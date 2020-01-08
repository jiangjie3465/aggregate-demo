package com.jdark.aggregate.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jdark.aggregate.demo.pojo.po.SysMenuDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 权限DAO
 * @Author Sans
 * @CreateTime 2019/9/14 15:57
 */
@Mapper
public interface SysMenuMapper extends BaseMapper<SysMenuDO> {

}