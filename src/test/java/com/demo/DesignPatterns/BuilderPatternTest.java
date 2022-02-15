package com.demo.DesignPatterns;

import com.demo.DesignPatterns.BuilderPattern.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class BuilderPatternTest {

    @Test
    public void createUserUsingBuilder_AllFields() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        User user = User.builder()
                .setName("Faydee")
                .setEmail("faydee@builder.com")
                .setDob(dateFormat.parse("26-08-1998"))
                .setMobile("92134")
                .build();

        Assertions.assertEquals(user.getName(),"Faydee");
        Assertions.assertEquals(user.getEmail(),"faydee@builder.com");
        Assertions.assertEquals(user.getMobile(), "92134");
        Assertions.assertEquals(user.getDob(), dateFormat.parse("26-08-1998"));
    }

    @Test
    public void createUsingBuilder_SomeFields() {
        User user = User.builder()
                .setName("Faydee")
                .setEmail("faydee@builder.com")
                .build();

        Assertions.assertEquals(user.getName(),"Faydee");
        Assertions.assertEquals(user.getEmail(),"faydee@builder.com");
        Assertions.assertEquals(user.getMobile(), null);
        Assertions.assertEquals(user.getDob(), null);

    }
}
