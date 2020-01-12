package com.jdark.aggregate.demo.dao.po;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

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

}