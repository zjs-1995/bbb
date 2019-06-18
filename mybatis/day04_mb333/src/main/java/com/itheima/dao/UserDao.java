package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserDao {

/*
    */
/**
     * 保存用户
     * @param user
     *//*

    @Insert("insert into user(username,address,sex,birthday) value(#{username},#{address},#{sex},#{birthday})")
    void saveUser(User user);

    */
/**
     * 更新用户
     * @param user
     *//*

    @Update("update user set username=#{username},address=#{address},sex=#{sex},birthday=#{birthday} where id = #{id }")
    void update(User user);

    */
/**
     * 删除用户
     * @param id
     *//*

    @Delete("delete from user where id = #{id}")
    void delete(Integer id);
*/



    /**
     *根据id查询用户
     * @param id
     * @return
     */
    @Select("select * from user where id = #{id}")
    @ResultMap(value = {"userMap"})
    User findById(Integer id);

    /**
     * 根据用户名称模糊查询
     * @param username
     * @return
     */
   // @Select("select * from user where username like #{usernamr}")
    @Select("select * from user where username like '%${value}%'")
    List<User> findUserByName(String username);

    @Select("select * from user")
    @Results(id = "userMap",value = {
            @Result(id=true,column = "id",property = "userId"),
            @Result(column = "username",property = "userName"),
            @Result(column = "address",property = "userAddress"),
            @Result(column = "sex",property = "userSex"),
            @Result(column = "birthday",property = "userBirthday"),
    })
    List<User> findAll();
}
