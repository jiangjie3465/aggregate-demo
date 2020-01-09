package com.jdark.aggregate.demo.dao;

import com.jdark.aggregate.demo.pojo.po.SysMenuDO;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author 蒋杰
 */
@Repository
public interface SysMenuMapper extends Mapper<SysMenuDO> {
}