package com.jdark.aggregate.demo.pojo.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @Description 角色与权限关系实体
 * @Author Sans
 * @CreateTime 2019/9/14 15:57
 */
@Data
@TableName("sys_role_menu")
public class SysRoleMenuDO implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 角色ID
	 */
	private Long roleId;
	/**
	 * 权限ID
	 */
	private Long menuId;
}
