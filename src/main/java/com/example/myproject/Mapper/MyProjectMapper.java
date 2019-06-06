package com.example.myproject.Mapper;
import org.apache.ibatis.annotations.*;
import com.example.myproject.Entity.MyProject;

import java.util.List;

@Mapper
public interface MyProjectMapper {
    /*
    活动的查询与删除
     */
    @Select("select* from activity where ac_id=#{ac_id}")
    MyProject findAllActivity(Integer ac_id);

    @Select("select ac_id,ac_name,ac_pdate,ac_num,ac_jnum from activity")
    List<MyProject> findSomeActivity();

    @Delete("delete from activity where ac_id=#{ac_id}")
    Integer deleteByID(Integer ac_id);


   /*
   用户的查询与删除
    */
   @Select("select* from user where u_id=#{u_id}")
   MyProject findAllUser(Integer u_id);

   @Select("select u_id,u_name,ur_name,u_sex,u_age from user")
    List<MyProject> findSomeUser();

    @Delete("delete from user where u_id=#{u_id}")
    Integer deleteByUserID(Integer u_id);

/*
管理员的增删查改
 */
 @Select("select * from administrator")
 List<MyProject> getAllAdministrator();

 @Delete("delete from administrator where ad_id=#{ad_id}")
 Integer deleteByAdminID(Integer ad_id);

 @Insert("insert into administrator (ad_name,ad_pw,ad_cd,ad_email)values(#{ad_name},#{ad_pw},current_date(),#{ad_email})")
 Integer addAdministrator(MyProject myProject);

 @Select("select * from administrator where ad_id =#{ad_id}")
MyProject findByAdminId(Integer ad_id);

 @Update("update administrator set ad_name= #{ad_name},ad_pw= #{ad_pw},ad_cd= #{ad_cd},ad_email= #{ad_email} where ad_id=#{ad_id};")
 Integer updateByAdminId(MyProject myProject);


    /*
    登录的验证
     */
    @Select("select* from administrator where ad_name=#{ad_name}and ad_pw=#{ad_pw}")
    MyProject findNameAndPassword(String ad_name, String ad_pw);

    /*
    登录日志
     */
    @Insert("insert into adminlog (logname,createdate,remark)values(#{logname},current_date(),#{remark})")
    Integer addAdminLog(MyProject myProject);

    @Select("select use.u_sex,log.createdate,log.remark from user use join adminlog log  where use.ur_name=log.logname")
    List<MyProject> getAllAdminLog();
}
