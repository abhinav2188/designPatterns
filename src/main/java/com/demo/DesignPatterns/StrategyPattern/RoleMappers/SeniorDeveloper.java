package com.demo.DesignPatterns.StrategyPattern.RoleMappers;

import java.util.Arrays;
import java.util.List;

public class SeniorDeveloper implements Role {
    public String getDescription() {
        return "developers with 2+ years of experience";
    }

    public List<String> getResponsibilities() {
        return Arrays.asList("mentor junior developers"
        ,"decide technologies to work");
    }
}
