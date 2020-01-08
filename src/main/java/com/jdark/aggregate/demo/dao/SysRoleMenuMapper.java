package com.jdark.aggregate.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jdark.aggregate.demo.pojo.po.SysRoleMenuDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色权限关系DAO
 * @Author Sans
 * @CreateTime 2019/9/14 15:57
 */
@Mapper
public interface SysRoleMenuMapper extends BaseMapper<SysRoleMenuDO> {
	
}
