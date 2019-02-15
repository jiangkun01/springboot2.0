package com.wechat.joker.tale.dao;

import com.wechat.joker.tale.pojo.Tusers;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class TusersSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_users
     *
     * @mbggenerated Thu Feb 14 15:35:09 CST 2019
     */
    public String insertSelective(Tusers record) {
        BEGIN();
        INSERT_INTO("t_users");
        
        if (record.getUid() != null) {
            VALUES("uid", "#{uid,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            VALUES("username", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            VALUES("password", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            VALUES("email", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getHomeUrl() != null) {
            VALUES("home_url", "#{homeUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getScreenName() != null) {
            VALUES("screen_name", "#{screenName,jdbcType=VARCHAR}");
        }
        
        if (record.getCreated() != null) {
            VALUES("created", "#{created,jdbcType=INTEGER}");
        }
        
        if (record.getActivated() != null) {
            VALUES("activated", "#{activated,jdbcType=INTEGER}");
        }
        
        if (record.getLogged() != null) {
            VALUES("logged", "#{logged,jdbcType=INTEGER}");
        }
        
        if (record.getGroupName() != null) {
            VALUES("group_name", "#{groupName,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_users
     *
     * @mbggenerated Thu Feb 14 15:35:09 CST 2019
     */
    public String updateByPrimaryKeySelective(Tusers record) {
        BEGIN();
        UPDATE("t_users");
        
        if (record.getUsername() != null) {
            SET("username = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            SET("password = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            SET("email = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getHomeUrl() != null) {
            SET("home_url = #{homeUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getScreenName() != null) {
            SET("screen_name = #{screenName,jdbcType=VARCHAR}");
        }
        
        if (record.getCreated() != null) {
            SET("created = #{created,jdbcType=INTEGER}");
        }
        
        if (record.getActivated() != null) {
            SET("activated = #{activated,jdbcType=INTEGER}");
        }
        
        if (record.getLogged() != null) {
            SET("logged = #{logged,jdbcType=INTEGER}");
        }
        
        if (record.getGroupName() != null) {
            SET("group_name = #{groupName,jdbcType=VARCHAR}");
        }
        
        WHERE("uid = #{uid,jdbcType=INTEGER}");
        
        return SQL();
    }
}