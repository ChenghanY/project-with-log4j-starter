package com.james;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class StarterServiceTest {

    @Test
    public void log() {
        StarterService starterService = new StarterService();
        starterService.doSomething();
    }
}