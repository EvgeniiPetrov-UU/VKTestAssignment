package com.vk.demo.service.entity.impl;

import com.vk.demo.dao.abstracts.RoleDao;
import com.vk.demo.model.entity.user.Role;
import com.vk.demo.service.entity.abstracts.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleDao roleDao;

    @Autowired
    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role getRoleByName(String name) {
        return roleDao.findRoleByName(name);
    }
}
