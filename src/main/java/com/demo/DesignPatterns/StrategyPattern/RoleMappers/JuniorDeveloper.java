package com.demo.DesignPatterns.StrategyPattern.RoleMappers;

import java.util.Arrays;
import java.util.List;

public class JuniorDeveloper implements Role {

    public String getDescription() {
        return "Developers with 0-1 year of experience";
    }

    public List<String> getResponsibilities() {
        return Arrays.asList("Implement small Api",
                "Write unit tests");
    }
}
