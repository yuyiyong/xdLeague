package com.xdleague.dahei01.dao;

import com.xdleague.dahei01.model.dto.InsertAdminDto;
import com.xdleague.dahei01.model.po.UserPo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {

    @Select("SELECT * FROM t_user WHERE username = #{userName}")
    public UserPo getInfoByName(String userName);

    @Insert("insert into t_user( username, password, platformid) value(#{userName},#{passWord},#{platformId})")
    public int insertAdmin(InsertAdminDto insertAdminDto);
}

