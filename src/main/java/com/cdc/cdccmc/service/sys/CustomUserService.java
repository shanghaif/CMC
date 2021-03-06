package com.cdc.cdccmc.service.sys;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cdc.cdccmc.domain.sys.SysRole;
import com.cdc.cdccmc.domain.sys.SysUser;
import com.cdc.cdccmc.repository.sys.SysRoleRepository;
import com.cdc.cdccmc.repository.sys.SysUserRepository;
import com.cdc.cdccmc.service.LogService;
/**
 * 已被废弃
 * @author ZhuWen
 */
//@Service
public class CustomUserService implements UserDetailsService { //自定义UserDetailsService 接口

    @Autowired
    private SysUserRepository sysUserRepository;
    @Autowired
    private SysRoleRepository sysRoleRepository;
    @Autowired
	private LogService logService;

    @Override
    public UserDetails loadUserByUsername(String username) { //重写loadUserByUsername 方法获得 userdetails 类型用户
    	SysUser user = null;
    	try{
	        user = sysUserRepository.findAll(username).get(0);
	        List<SysRole> roles = sysRoleRepository.findRoleByid(user.getId());
	        user.setRoles(roles);
    	}catch(Exception ex){
    		ex.printStackTrace();
    		logService.addLogError(null, ex, "", null);
    	}
	        if(user == null){
	            throw new UsernameNotFoundException("用户名不存在");
	        }
	        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
	        //用于添加用户的权限。只要把用户权限添加到authorities 就万事大吉。
	        for(SysRole role:user.getRoles()){
	            authorities.add(new SimpleGrantedAuthority(role.getName()));
	            System.out.println(role.getName());
	        }
	        return new org.springframework.security.core.userdetails.User(user.getUsername(),
	                user.getPassword(), authorities);
    	
    }
}
