package com.jdark.aggregate.demo.dao.po;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * @author jiangjie
 */
@Table(name = "sys_user_role")
@Data
public class SysUserRoleDO {
    /**
     * ID
     */
    @Id
    private Long id;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 角色ID
     */
    @Column(name = "role_id")
    private Long roleId;

}