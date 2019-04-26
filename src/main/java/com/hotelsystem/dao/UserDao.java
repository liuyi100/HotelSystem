package com.hotelsystem.dao;

import com.hotelsystem.entity.Ip_User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author liuy
 * @Date 2019/4/25-11:30
 */

@Mapper
public interface UserDao {

   @Select("select * from ip_user where id=#{id}")
    public Ip_User getUserbyId(Integer id);
}
