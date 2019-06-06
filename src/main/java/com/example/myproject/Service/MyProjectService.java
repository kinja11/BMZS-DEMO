package com.example.myproject.Service;
import com.example.myproject.Entity.MyProject;
import java.util.List;
public interface MyProjectService {
 /* 查找活动表*/
MyProject findAllActivity(Integer ac_id);
List<MyProject> findSomeActivity();
/* 删除活动表*/
Integer deleteByID(Integer ac_id);

MyProject userLogin(String ad_name,String ad_pw);


 /* 查找用户表*/
 MyProject findAllUser(Integer u_id);
 List<MyProject> findSomeUser();
 Integer deleteByUserId(Integer u_id);


 /* 增删查改管理员表*/
 List<MyProject> getAllAdministrator();
 Integer deleteByAdminId(Integer ad_id);
 Integer addAdministrator(MyProject myProject);
 MyProject findByAdminId(Integer ad_id);
 Integer updateByAdminId(MyProject myProject);

 /* 登录日志*/
 Integer addAdminLog(MyProject myProject);
 List<MyProject> findAllAdminLog();

}
