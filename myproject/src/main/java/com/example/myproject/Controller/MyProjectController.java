package com.example.myproject.Controller;
import com.example.myproject.Entity.MyProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.myproject.Service.MyProjectService;

import java.util.List;



@Controller
@RequestMapping("myp")
public class MyProjectController {
    @Autowired
    private MyProjectService myProjectService;
/**/
    @GetMapping("/index")
    public String Register(){

        return "index";
    }
    /* 统计分析页面 */
    @GetMapping("/statistic")
    public String Statistic(){

        return "statistic";
    }
    /* 用户登录日志页面 */
    @GetMapping("/userlog")
    public String userLog(){

        return "userlog";
    }
    /* 管理员登录日志页面 */
    @GetMapping("/adminlog")
    public String adminLog(){

        return "adminlog";
    }

    /* 注册页面 */
    @GetMapping("/login")
    public String Login(){

        return "login";
    }











    @GetMapping("/list")
    public String getNameAndPassword(//@RequestParam(value ="username")String username,
                                  //@RequestParam(value ="password")String password,
            Model model ){
       //if(username=="MSQ"&&password=="123"){
        List<MyProject> myProjectList= myProjectService.findSomeActivity();
        model.addAttribute("smallmyp",myProjectList);
        return "activity";
       // return "对了";}
       //else{
          // return"用户名或密码错误，请重试";
      // }

    }




    @GetMapping("/lists/{id}")
    public String getAllActivity(@PathVariable("id") Integer ac_id , Model model ){
        MyProject myProjectList=myProjectService.findAllActivity(ac_id);
        model.addAttribute("myp",myProjectList);

     return "activitydetail";
    }
    @GetMapping("/del/{id}")
    public String deleteByStuID(@PathVariable("id") Integer ac_id) {
        myProjectService.deleteByID(ac_id);
        return "redirect:/myp/list";
    }
/*
用户的查询与删除
 */
    @GetMapping("/user")
    public String getSomeUser(Model model ) {
        List<MyProject> myProjectList= myProjectService.findSomeUser();
        model.addAttribute("someuse",myProjectList);
        return "user";
    }




    @GetMapping("/user/{id}")
    public String getAllUser(@PathVariable("id") Integer u_id , Model model ) {
        MyProject myProjectList=myProjectService.findAllUser(u_id);
        model.addAttribute("use",myProjectList);
        return "userdetail";
    }

    @GetMapping("/deluser/{id}")
    public String deleteByUserID(@PathVariable("id") Integer u_id) {
        myProjectService.deleteByUserId(u_id);
        return "redirect:/myp/user";
    }

/*
管理员的增删查改
 */
//查找
@GetMapping("/administrator")
public String getAllAdministrator(Model model ) {
    List<MyProject> myProjectList= myProjectService.getAllAdministrator();
    model.addAttribute("admini",myProjectList);
    return "administrator";
}
// 删除
    @GetMapping("/deladmin/{id}")
    public String deleteByAdminID(@PathVariable("id") Integer ad_id) {
        myProjectService.deleteByAdminId(ad_id);
        return "redirect:/myp/administrator";
    }

//添加
    @GetMapping("/addadmin")
    public String addAdministrator(Model model) {
        List<MyProject> myProjectList=myProjectService.getAllAdministrator();
        model.addAttribute("addadmin", myProjectList);
        return "addadmin";
    }
    // 添加后返回主页
    @PostMapping("/addadmin")
    public String addAdmin(MyProject myProject) {
        myProjectService.addAdministrator(myProject);
        return "redirect:/myp/administrator";

    }
//修改
@GetMapping("/updateadmin/{id}")
public String updateByAdminID(@PathVariable("id") Integer ad_id , Model model) {
   MyProject myProject = myProjectService.findByAdminId(ad_id);
    model.addAttribute("admin", myProject);
    return "updateadmin";
}

    @PostMapping("/updateadmin")
    public String updateByAdminId(MyProject myProject) {
        myProjectService.updateByAdminId(myProject);
        return "redirect:/myp/administrator";

    }




    }









