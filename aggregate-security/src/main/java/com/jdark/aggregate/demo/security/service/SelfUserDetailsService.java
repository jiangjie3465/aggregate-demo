package com.jdark.aggregate.demo.security.service;


import com.jdark.aggregate.demo.dao.po.SysUserDO;
import com.jdark.aggregate.demo.service.SysUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * SpringSecurity用户的业务实现
 * @Author Sans
 * @CreateTime 2019/10/1 17:21
 */
@Component
public class SelfUserDetailsService implements UserDetailsService {

    @Autowired
    private SysUserService sysUserService;

    /**
     * 查询用户信息
     * @Author Sans
     * @CreateTime 2019/9/13 17:23
     * @Param  username  用户名
     * @Return UserDetails SpringSecurity用户信息
     */
    @Override
    public SelfUserBO loadUserByUsername(String username) throws UsernameNotFoundException {
        // 查询用户信息
        SysUserDO sysUserDO = sysUserService.selectUserByName(username);
        if (sysUserDO!=null){
            // 组装参数
            SelfUserBO selfUserBo = new SelfUserBO();
            BeanUtils.copyProperties(sysUserDO, selfUserBo);
            return selfUserBo;
        }
        return null;
    }
}