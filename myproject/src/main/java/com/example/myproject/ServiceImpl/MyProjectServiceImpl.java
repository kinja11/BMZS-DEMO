package com.example.myproject.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.myproject.Entity.MyProject;
import com.example.myproject.Service.MyProjectService;
import com.example.myproject.Mapper.MyProjectMapper;

import java.util.List;

@Service
public class MyProjectServiceImpl implements MyProjectService {
    @Autowired
    private MyProjectMapper myProjectMapper;

    /* 活动的查询与删除     */
    @Override
    public MyProject findAllActivity(Integer ac_id) {
        return myProjectMapper.findAllActivity(ac_id);
    }

    @Override
    public List<MyProject> findSomeActivity() {
        return myProjectMapper.findSomeActivity();
    }

    @Override
    public Integer deleteByID(Integer ac_id) {
        return myProjectMapper.deleteByID(ac_id);
    }

    @Override
    public MyProject userLogin(String ad_name, String ad_pw) {
        return myProjectMapper.findNameAndPassword(ad_name, ad_pw);
    }


    /* 用户的查询与删除     */
    @Override
    public MyProject findAllUser(Integer u_id) {
        return myProjectMapper.findAllUser(u_id);
    }

    @Override
    public List<MyProject> findSomeUser() {
        return myProjectMapper.findSomeUser();
    }

    @Override
    public Integer deleteByUserId(Integer u_id) {
        return myProjectMapper.deleteByUserID(u_id);
    }



    /* 管理员的增删查改    */

    @Override
    public List<MyProject> getAllAdministrator() {
        return myProjectMapper.getAllAdministrator();
    }

    @Override
    public Integer deleteByAdminId(Integer ad_id) {
        return myProjectMapper.deleteByAdminID(ad_id);
    }

    @Override
    public Integer addAdministrator(MyProject myProject) {
        return myProjectMapper.addAdministrator(myProject);
    }

    @Override
    public MyProject findByAdminId(Integer ad_id) {
        return myProjectMapper.findByAdminId(ad_id);
    }

    @Override
    public Integer updateByAdminId(MyProject myProject) {
        return myProjectMapper.updateByAdminId(myProject);
    }

}