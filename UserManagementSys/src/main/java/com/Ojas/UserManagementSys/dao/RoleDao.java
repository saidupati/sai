package com.Ojas.UserManagementSys.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Ojas.UserManagementSys.model.Role;
//siddhardh
///hii
//prasanna

@Repository
public interface RoleDao extends CrudRepository<Role, Long> {
    Systrm.out.println("Hii sai prasanna");
    Role findRoleByName(String name);
}
