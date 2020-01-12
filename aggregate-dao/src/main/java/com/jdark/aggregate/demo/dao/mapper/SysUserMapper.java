package com.jdark.aggregate.demo.dao.mapper;

import com.jdark.aggregate.demo.dao.po.SysMenuDO;
import com.jdark.aggregate.demo.dao.po.SysRoleDO;
import com.jdark.aggregate.demo.dao.po.SysUserDO;
import java.util.List;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author jiangjie
 */
@Repository
public interface SysUserMapper extends Mapper<SysUserDO> {

    /**
     * 通过用户ID查询角色集合
     * @createTime 2019/9/18 18:01
     * @param  userId 用户ID
     * @return List<SysRoleEntity> 角色名集合
     */
    List<SysRoleDO> selectSysRoleByUserId(Long userId);

    /**
     * 通过用户ID查询权限集合
     * @createTime 2019/9/18 18:01
     * @param  userId 用户ID
     * @return List<SysMenuEntity> 角色名集合
     */
    List<SysMenuDO> selectSysMenuByUserId(Long userId);
}