package com.demo.DesignPatterns;

import com.demo.DesignPatterns.RoleMappers.Role;
import com.demo.DesignPatterns.RoleMappers.RoleMapper;
import com.demo.DesignPatterns.RoleMappers.RoleType;
import lombok.Value;

@Value
public class Employee {
    private String name;
    private Role role;

    public Employee(String name, RoleType roleType){
        this.name = name;
        this.role = RoleMapper.getRole(roleType);
    }
}
