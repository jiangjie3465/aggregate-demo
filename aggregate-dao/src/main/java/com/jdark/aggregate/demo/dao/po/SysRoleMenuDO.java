package com.jdark.aggregate.demo.dao.po;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * @author 蒋杰
 */
@Table(name = "sys_role_menu")
@Data
public class SysRoleMenuDO {
    /**
     * ID
     */
    @Id
    private Long id;

    /**
     * 角色ID
     */
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 权限ID
     */
    @Column(name = "menu_id")
    private Long menuId;

}