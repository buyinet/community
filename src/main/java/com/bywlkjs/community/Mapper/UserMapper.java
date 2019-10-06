package com.bywlkjs.community.Mapper;

import com.bywlkjs.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO user (name,account_id,token,gmt_create,gmt_modified)" +
            " VALUES (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    public int insert(User user);

    @Select("SELECT " +
            "id," +
            "name," +
            "account_id as accountId," +
            "token," +
            "gmt_create as gmtCreate," +
            "gmt_modified as gmtModified " +
            "FROM user WHERE token=#{token}")
    public User findByToken(String token);
}