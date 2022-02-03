package com.demo.DesignPatterns.RoleMappers;

import java.util.Arrays;
import java.util.List;

public class ProductDesigner implements Role {
    public String getDescription() {
        return "product designer";
    }

    public List<String> getResponsibilities() {
        return Arrays.asList("gather product details",
                "attend to clients");
    }
}
