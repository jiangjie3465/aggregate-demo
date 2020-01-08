package com.jdark.aggregate.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jdark.aggregate.demo.pojo.po.SysRoleDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description 角色DAO
 * @Author Sans
 * @CreateTime 2019/9/14 15:57
 */
@Mapper
public interface SysRoleMapper extends BaseMapper<SysRoleDO> {

}