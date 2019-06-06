package com.example.myproject.Entity;

import java.util.Date;

public class MyProject {
   /* 活动的属性*/
    private Integer ac_id;
    private String ac_name;
    private Date ac_pdate;
    private Integer ac_num;
    private Integer ac_jnum;
    private String ac_det;
    private String ac_loc;
    private String ac_cre;
    private String ac_tel;
    private Integer ac_lnum;
    private Date ac_sdate;
    private Date ac_edate;
    private String ac_type;

    /* 活动的属性*/
    private Integer ad_id;
    private String ad_name;
    private String ad_pw;
    private String ad_cd;
    private String ad_email;

    public Integer getAd_id() {
        return ad_id;
    }

    public void setAd_id(Integer ad_id) {
        this.ad_id = ad_id;
    }

    public String getAd_cd() {
        return ad_cd;
    }

    public void setAd_cd(String ad_cd) {
        this.ad_cd = ad_cd;
    }

    public String getAd_email() {
        return ad_email;
    }

    public void setAd_email(String ad_email) {
        this.ad_email = ad_email;
    }

    /*用户的属性*/
    private Integer u_id;
    private String u_name;
    private String ur_name;
    private String u_sex;
    private Integer u_age;
    private String u_wx;
    private String u_qq;
    private String u_work;
    private String u_loc;
    private String u_el;

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getUr_name() {
        return ur_name;
    }

    public void setUr_name(String ur_name) {
        this.ur_name = ur_name;
    }

    public String getU_sex() {
        return u_sex;
    }

    public void setU_sex(String u_sex) {
        this.u_sex = u_sex;
    }

    public Integer getU_age() {
        return u_age;
    }

    public void setU_age(Integer u_age) {
        this.u_age = u_age;
    }

    public String getU_wx() {
        return u_wx;
    }

    public void setU_wx(String u_wx) {
        this.u_wx = u_wx;
    }

    public String getU_qq() {
        return u_qq;
    }

    public void setU_qq(String u_qq) {
        this.u_qq = u_qq;
    }

    public String getU_work() {
        return u_work;
    }

    public void setU_work(String u_work) {
        this.u_work = u_work;
    }

    public String getU_loc() {
        return u_loc;
    }

    public void setU_loc(String u_loc) {
        this.u_loc = u_loc;
    }

    public String getU_el() {
        return u_el;
    }

    public void setU_el(String u_el) {
        this.u_el = u_el;
    }




    public String getAd_name() {
        return ad_name;
    }

    public void setAd_name(String ad_name) {
        this.ad_name = ad_name;
    }

    public String getAd_pw() {
        return ad_pw;
    }

    public void setAd_pw(String ad_pw) {
        this.ad_pw = ad_pw;
    }





    public String getAc_tel() {
        return ac_tel;
    }

    public void setAc_tel(String ac_tel) {
        this.ac_tel = ac_tel;
    }

    public Integer getAc_lnum() {
        return ac_lnum;
    }

    public void setAc_lnum(Integer ac_lnum) {
        this.ac_lnum = ac_lnum;
    }

    public Date getAc_sdate() {
        return ac_sdate;
    }

    public void setAc_sdate(Date ac_sdate) {
        this.ac_sdate = ac_sdate;
    }

    public Date getAc_edate() {
        return ac_edate;
    }

    public void setAc_edate(Date ac_edate) {
        this.ac_edate = ac_edate;
    }

    public String getAc_type() {
        return ac_type;
    }

    public void setAc_type(String ac_type) {
        this.ac_type = ac_type;
    }

    public Integer getAc_id() {
        return ac_id;
    }

    public void setAc_id(Integer ac_id) {
        this.ac_id = ac_id;
    }

    public String getAc_name() {
        return ac_name;
    }

    public void setAc_name(String ac_name) {
        this.ac_name = ac_name;
    }

    public Date getAc_pdate() {
        return ac_pdate;
    }

    public void setAc_pdate(Date ac_pdate) {
        this.ac_pdate = ac_pdate;
    }

    public Integer getAc_num() {
        return ac_num;
    }

    public void setAc_num(Integer ac_num) {
        this.ac_num = ac_num;
    }

    public Integer getAc_jnum() {
        return ac_jnum;
    }

    public void setAc_jnum(Integer ac_jnum) {
        this.ac_jnum = ac_jnum;
    }

    public String getAc_det() {
        return ac_det;
    }

    public void setAc_det(String ac_det) {
        this.ac_det = ac_det;
    }

    public String getAc_loc() {
        return ac_loc;
    }

    public void setAc_loc(String ac_loc) {
        this.ac_loc = ac_loc;
    }

    public String getAc_cre() {
        return ac_cre;
    }

    public void setAc(String ac_cre) {
        this.ac_cre = ac_cre;
    }

/* 登录日志的属性*/
private String logname;
private String remark;
private Date createdate;

    public void setAc_cre(String ac_cre) {
        this.ac_cre = ac_cre;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getLogname() {
        return logname;
    }

    public void setLogname(String logname) {
        this.logname = logname;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
