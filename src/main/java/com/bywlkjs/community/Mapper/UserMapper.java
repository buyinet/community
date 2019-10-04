package com.bywlkjs.community.Mapper;

import com.bywlkjs.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO user (name,account_id,token,gmt_create,gmt_modified)" +
            " VALUES (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    public int insert(User user);
}
