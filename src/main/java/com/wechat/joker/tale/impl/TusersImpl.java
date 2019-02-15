package com.wechat.joker.tale.impl;

import com.wechat.joker.login.web.LoginController;
import com.wechat.joker.tale.api.TusersApi;
import com.wechat.joker.tale.dao.TusersMapper;
import com.wechat.joker.tale.pojo.Tusers;
import org.apache.ibatis.annotations.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author joker
 * @date 2019/2/14 15:38
 */
@Service
public class TusersImpl implements TusersApi {

    Logger logger= LoggerFactory.getLogger(TusersImpl.class);

    @Autowired
    private RedisTemplate redisTemplate;

    @Resource
    private TusersMapper tusersMapper;

    @Override
    public Tusers getOne(Integer uid) {

        String key = "user-" + uid;
        ValueOperations<String, Tusers> operations = redisTemplate.opsForValue();

        // 缓存存在
        boolean hasKey = redisTemplate.hasKey(key);
        if (hasKey) {
            Tusers user = operations.get(key);

            //logger.info("从缓存中获取了用户 >> " +"id: "+ user.getId()+", username: "+user.getUsername()+",password: "+user.getPassword());
            return user;
        }
        Tusers user;
        // 从 DB 中获取用户信息
        user = tusersMapper.selectByPrimaryKey(uid);


        // 插入缓存
//        if(user!=null){
//            operations.set(key, user, 30, TimeUnit.SECONDS);
//            LOGGER.info("用户插入缓存 >> " +"id: "+ user.getId()+", username: "+user.getUsername()+",password: "+user.getPassword());
//        }

        return user;
    }
}
