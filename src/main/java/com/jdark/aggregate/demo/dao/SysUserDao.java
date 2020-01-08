package com.jdark.aggregate.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jdark.aggregate.demo.pojo.po.SysMenuDO;
import com.jdark.aggregate.demo.pojo.po.SysRoleDO;
import com.jdark.aggregate.demo.pojo.po.SysUserEntity;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description 系统用户DAO
 * @Author Sans
 * @CreateTime 2019/9/14 15:57
 */
@Mapper
public interface SysUserDao extends BaseMapper<SysUserEntity> {

    /**
     * 通过用户ID查询角色集合
     * @Author Sans
     * @CreateTime 2019/9/18 18:01
     * @Param  userId 用户ID
     * @Return List<SysRoleEntity> 角色名集合
     */
    List<SysRoleDO> selectSysRoleByUserId(Long userId);
    /**
     * 通过用户ID查询权限集合
     * @Author Sans
     * @CreateTime 2019/9/18 18:01
     * @Param  userId 用户ID
     * @Return List<SysMenuEntity> 角色名集合
     */
    List<SysMenuDO> selectSysMenuByUserId(Long userId);
	
}
