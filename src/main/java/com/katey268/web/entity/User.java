package com.katey268.web.entity;


/**
 * Created by 11456 on 2016/12/27.
 */
public class User {

    /**
     * 用户编号
     */
    private long userId;
    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getUserId() {
        return userId;
    }

    /**
     * 用户姓名
     */
    private String userName;
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    /**
     * 用户手机号
     */
    private String userTel;
    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }
    public String getUserTel() {
        return userTel;
    }

    /**
     * 用户密码
     */
    private String userPwd;
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserPwd() {
        return userPwd;
    }

    /**
     * 用户邮箱
     */
    private String userMail;
    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }
    public String getUserMail() {
        return userMail;
    }

    /**
     * 用户头像
     */
    private String userPhoto;

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userTel='" + userTel + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userMail='" + userMail + '\'' +
                ", photo='" + userPhoto + '\'' +
                '}';
    }
}
