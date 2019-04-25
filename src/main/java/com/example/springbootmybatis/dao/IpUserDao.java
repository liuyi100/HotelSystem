package com.example.springbootmybatis.dao;

import com.example.springbootmybatis.entity.Ip_User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author liuy
 * @Date 2019/4/25-11:57
 */
@Mapper
public interface IpUserDao {

    public Ip_User getUserbyId(Integer id);
}
