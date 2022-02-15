package com.demo.DesignPatterns.StrategyPattern;

import com.demo.DesignPatterns.StrategyPattern.RoleMappers.Role;
import com.demo.DesignPatterns.StrategyPattern.RoleMappers.RoleMapper;
import com.demo.DesignPatterns.StrategyPattern.RoleMappers.RoleType;
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
