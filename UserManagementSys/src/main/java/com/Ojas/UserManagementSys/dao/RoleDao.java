package com.Ojas.UserManagementSys.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Ojas.UserManagementSys.model.Role;
//siddhardh
///hii
//prasanna
///sai
@Repository
public interface RoleDao extends CrudRepository<Role, Long> {
    Role findRoleByName(String name);
}
