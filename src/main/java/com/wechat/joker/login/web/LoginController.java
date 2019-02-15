package com.wechat.joker.login.web;

import com.wechat.joker.tale.api.TusersApi;
import com.wechat.joker.tale.pojo.Tusers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author joker
 * @date 2019/1/8 15:19
 */
@RestController
@RequestMapping(path = "/joker")
public class LoginController {
    Logger logger= LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private TusersApi tusersApi;

//    @Value("${spring.application.name}")
    private String serverName;
    @MyFirstAnnotation("方法获取用户信息")
    @GetMapping(path = "/getservername")
    public Tusers getServerName(Integer id){
        return tusersApi.getOne(id);
    }


//    public static void main(String[] args){
//        int arr[] = {10,-11,-12,-13,-14,-15,-16,-2,7,8,-9,-7,11,-3,12,13,14,15,16,-10};
//        for(int i=0,j=arr.length-1;i<=j;i++){
//            System.out.println("i="+i+","+"j="+j);
//            if(arr[i]>0){continue;}
//            if(arr[i]<=0){
//                int start = arr[i];
//                j = jb(i,j,arr);
//                arr[i] = arr[j];
//                arr[j] = start;
//                j--;
//            }
//        }
//        for(int n=0;n<arr.length;n++){
//            System.out.print(arr[n]+" ");
//        }
//
//    }
//    public static int jb(int i, int j, int arr[]){
//        if(i<j){
//            if(arr[j] >0){
//                return j;
//            }else{
//                j--;
//                return jb(i,j,arr);
//            }
//        }else{
//            return j;
//        }
//    }
}

