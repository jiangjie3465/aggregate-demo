package com.jdark.aggregate.demo.dao.po;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * @author jiangjie
 */
@Table(name = "sys_user")
@Data
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

}