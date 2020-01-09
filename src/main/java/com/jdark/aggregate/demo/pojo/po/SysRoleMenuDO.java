package com.jdark.aggregate.demo.pojo.po;

import javax.persistence.*;

/**
 * @author 蒋杰
 */
@Table(name = "sys_role_menu")
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

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取角色ID
     *
     * @return role_id - 角色ID
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置角色ID
     *
     * @param roleId 角色ID
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取权限ID
     *
     * @return menu_id - 权限ID
     */
    public Long getMenuId() {
        return menuId;
    }

    /**
     * 设置权限ID
     *
     * @param menuId 权限ID
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }
}