package dao.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import bean.User;

public interface UserMapper {  
	  
    @Select(value="select username,password,enabled from dbo.usersTest where username = #{username}")  
    User loadUserByUsername(@Param("username") String username);  
    @Insert(value="insert into dbo.usersTest (username, password, enabled, create_date) value(#{username},#{password},#{enabled},#{createDate})")  
    void saveUser(User user);  
}  