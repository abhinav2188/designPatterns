package com.demo.DesignPatterns;

import com.demo.DesignPatterns.StrategyPattern.RoleMappers.RoleType;
import com.demo.DesignPatterns.StrategyPattern.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

@SpringBootTest
class StrategyPatternTest {

	@Test
	void employeeRoleTest(){

		Employee emp1 = new Employee("aladin", RoleType.INTERN);
		assertEquals(emp1.getRole().getDescription(),"intern");
		assertEquals(emp1.getRole().getResponsibilities().get(0), "Learn new frameworks" );

		Employee emp2 = new Employee("samrat", RoleType.PRODUCT_DESIGNER);
		assertIterableEquals(emp2.getRole().getResponsibilities(), Arrays.asList("gather product details",
				"attend to clients"));

		Employee emp3 = new Employee("jasmine", RoleType.SENIOR_DEVELOPER);
		assertEquals(emp3.getRole().getDescription(),"developers with 2+ years of experience");
		assertEquals(emp3.getName(), "jasmine");

	}

}
