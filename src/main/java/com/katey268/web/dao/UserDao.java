package com.katey268.web.dao;

import com.katey268.web.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by 11456 on 2016/12/30.
 */

public interface UserDao {

    /**
     * 添加一个新用户对象
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 通过用户Id来查询用户
     * @param userId
     * @return
     */
    User queryById(Long  userId);

    /**
     * 根据用户名来查找
     * @param userName
     * @return
     */
    User queryByName(String userName);

    /**
     * 根据用户手机号来查询
     * @param userTel
     * @return
     */
    User queryByTel(String userTel);

    /**
     * 根据用户邮箱来查找
     * @param userMail
     * @return
     */
    User queryByMail(String userMail);

    /**
     * 修改邮箱地址
     * @param userId
     * @return
     */
    int updateMailById(@Param("userId") Long userId,
                       @Param("newUserMail") String newUserMail);

    /**
     * 修改绑定手机号
     * @param userId
     * @return
     */
    int updateTelById(@Param("userId") Long userId,
                      @Param("newUserTel") String newUserTel);

    /**
     * 根据用户编号修改头像
     * @param userId
     * @return
     */
    int updatePhotoById(@Param("userId") Long userId,
                        @Param("newUserPhoto") String newUserPhoto);

    /**
     * 根据用户编号修改账户密码
     * @param userId
     * @param newUserPwd
     * @return
     */
    int updatePwdById(@Param("userId") Long userId,
                      @Param("newUserPwd") String newUserPwd);
}
