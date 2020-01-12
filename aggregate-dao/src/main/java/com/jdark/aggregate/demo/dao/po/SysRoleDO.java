package com.jdark.aggregate.demo.dao.po;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * @author jiangjie
 */
@Table(name = "sys_role")
@Data
public class SysRoleDO {
    /**
     * 角色ID
     */
    @Id
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 角色名称
     */
    @Column(name = "role_name")
    private String roleName;

}