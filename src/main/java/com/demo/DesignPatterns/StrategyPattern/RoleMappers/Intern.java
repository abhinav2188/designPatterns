package com.demo.DesignPatterns.StrategyPattern.RoleMappers;

import java.util.Arrays;
import java.util.List;

public class Intern implements Role {

    public String getDescription() {
        return "intern";
    }

    public List<String> getResponsibilities() {
        return Arrays.asList("Learn new frameworks",
                "Learn Design Patterns");
    }
}
