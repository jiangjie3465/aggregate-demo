package com.jdark.aggregate.demo.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.jdark.aggregate.demo.dao.mapper.SysUserMapper;
import com.jdark.aggregate.demo.dao.po.SysMenuDO;
import com.jdark.aggregate.demo.dao.po.SysRoleDO;
import com.jdark.aggregate.demo.dao.po.SysUserDO;
import com.jdark.aggregate.demo.service.SysUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

/**
 * @Description 系统用户业务实现
 * @Author Sans
 * @CreateTime 2019/9/14 15:57
 */
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {

  @Autowired
  private SysUserMapper sysUserMapper;

  /**
   * 根据用户名查询实体
   *
   * @Author Sans
   * @CreateTime 2019/9/14 16:30
   * @Param username 用户名
   * @Return SysUserEntity 用户实体
   */
  @Override
  public SysUserDO selectUserByName(String username) {
    Example example = new Example(SysUserDO.class);
    Criteria criteria = example.createCriteria();
    criteria.andEqualTo("username",username);
    List<SysUserDO> sysUsers = sysUserMapper.selectByExample(criteria);
    if (CollectionUtil.isNotEmpty(sysUsers)) {
      return sysUsers.get(0);
    }
    return null;
  }

  /**
   * 通过用户ID查询角色集合
   *
   * @Author Sans
   * @CreateTime 2019/9/18 18:01
   * @Param userId 用户ID
   * @Return List<SysRoleEntity> 角色名集合
   */
  @Override
  public List<SysRoleDO> selectSysRoleByUserId(Long userId) {
    return this.sysUserMapper.selectSysRoleByUserId(userId);
  }

  /**
   * 根据用户ID查询权限集合
   *
   * @Author Sans
   * @CreateTime 2019/9/18 18:01
   * @Param userId 用户ID
   * @Return List<SysMenuEntity> 角色名集合
   */
  @Override
  public List<SysMenuDO> selectSysMenuByUserId(Long userId) {
    return this.sysUserMapper.selectSysMenuByUserId(userId);
  }
}