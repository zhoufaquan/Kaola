package cn.zfq.kaola.entity;

import java.io.Serializable;

public class Student implements Serializable {
    private int c_id;
    private String c_nickname;
    private String c_mail;
    private String c_name;
    private String c_pwd;
    private String c_telephone;
    private String c_idcard;
    private String c_image;
    private String c_sex;


    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getC_nickname() {
        return c_nickname;
    }

    public void setC_nickname(String c_nickname) {
        this.c_nickname = c_nickname;
    }

    public String getC_mail() {
        return c_mail;
    }

    public void setC_mail(String c_mail) {
        this.c_mail = c_mail;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getC_pwd() {
        return c_pwd;
    }

    public void setC_pwd(String c_pwd) {
        this.c_pwd = c_pwd;
    }

    public String getC_telephone() {
        return c_telephone;
    }

    public void setC_telephone(String c_telephone) {
        this.c_telephone = c_telephone;
    }

    public String getC_idcard() {
        return c_idcard;
    }

    public void setC_idcard(String c_idcard) {
        this.c_idcard = c_idcard;
    }

    public String getC_image() {
        return c_image;
    }

    public void setC_image(String c_image) {
        this.c_image = c_image;
    }

    public String getC_sex() {
        return c_sex;
    }

    public void setC_sex(String c_sex) {
        this.c_sex = c_sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "c_id=" + c_id +
                ", c_nickname='" + c_nickname + '\'' +
                ", c_mail='" + c_mail + '\'' +
                ", c_name='" + c_name + '\'' +
                ", c_pwd='" + c_pwd + '\'' +
                ", c_telephone='" + c_telephone + '\'' +
                ", c_idcard='" + c_idcard + '\'' +
                ", c_image='" + c_image + '\'' +
                ", c_sex='" + c_sex + '\'' +
                '}';
    }
}
