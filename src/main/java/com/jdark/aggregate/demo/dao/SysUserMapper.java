package com.jdark.aggregate.demo.dao;

import com.jdark.aggregate.demo.pojo.po.SysMenuDO;
import com.jdark.aggregate.demo.pojo.po.SysUserDO;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author 蒋杰
 */
@Repository
public interface SysUserMapper extends Mapper<SysUserDO> {
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