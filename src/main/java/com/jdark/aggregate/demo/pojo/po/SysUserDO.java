package com.jdark.aggregate.demo.pojo.po;

import javax.persistence.*;

@Table(name = "sys_user")
public class SysUserDO {
    /**
     * 用户ID
     */
    @Id
    @Column(name = "user_id")
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 状态 PROHIBIT：禁用   NORMAL：正常
     */
    private String status;

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取状态 PROHIBIT：禁用   NORMAL：正常
     *
     * @return status - 状态 PROHIBIT：禁用   NORMAL：正常
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态 PROHIBIT：禁用   NORMAL：正常
     *
     * @param status 状态 PROHIBIT：禁用   NORMAL：正常
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}