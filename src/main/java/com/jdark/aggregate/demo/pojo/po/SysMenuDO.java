package com.jdark.aggregate.demo.pojo.po;

import lombok.Data;

import javax.persistence.*;

@Table(name = "sys_menu")
@Data
public class SysMenuDO {
    /**
     * ID
     */
    @Id
    @Column(name = "menu_id")
    private Long menuId;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 权限标识
     */
    private String permission;

    /**
     * 获取ID
     *
     * @return menu_id - ID
     */
    public Long getMenuId() {
        return menuId;
    }

    /**
     * 设置ID
     *
     * @param menuId ID
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    /**
     * 获取权限名称
     *
     * @return name - 权限名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置权限名称
     *
     * @param name 权限名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取权限标识
     *
     * @return permission - 权限标识
     */
    public String getPermission() {
        return permission;
    }

    /**
     * 设置权限标识
     *
     * @param permission 权限标识
     */
    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }
}