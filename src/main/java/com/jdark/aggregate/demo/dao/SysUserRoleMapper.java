package com.jdark.aggregate.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jdark.aggregate.demo.pojo.po.SysUserRoleDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description 用户与角色关系DAO
 * @Author Sans
 * @CreateTime 2019/9/14 15:57
 */
@Mapper
public interface SysUserRoleMapper extends BaseMapper<SysUserRoleDO> {
	
}
