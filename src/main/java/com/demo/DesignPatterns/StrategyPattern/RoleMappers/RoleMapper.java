package com.demo.DesignPatterns.StrategyPattern.RoleMappers;

import java.util.HashMap;

public class RoleMapper {

    private static HashMap<RoleType, Role> mapper;
    static{
        mapper = new HashMap<RoleType, Role>();
        mapper.put(RoleType.INTERN,new Intern());
        mapper.put(RoleType.JUNIOR_DEVELOPER, new JuniorDeveloper());
        mapper.put(RoleType.SENIOR_DEVELOPER,new SeniorDeveloper());
        mapper.put(RoleType.PRODUCT_DESIGNER, new ProductDesigner());
    }

    public static Role getRole(RoleType roleType){
        return mapper.get(roleType);
    }

}
