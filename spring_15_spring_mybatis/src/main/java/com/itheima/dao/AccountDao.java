package com.itheima.dao;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AccountDao {

    @Insert("insert into b210410(name,QQ,Wechat)values(#{name},#{QQ},#{Wechat})")
    void save(Account account);

    @Delete("delete from b210410 where id = #{id} ")
    void delete(Integer id);

    @Update("update b210410 set name = #{name} , QQ = #{QQ} where id = #{id} ")
    void update(Account account);

    @Select("select * from b210410")
    List<Account> findAll();

    @Select("select * from b210410 where id = #{id} ")
    Account findById(Integer id);
}