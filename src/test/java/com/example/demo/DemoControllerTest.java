package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoControllerTest {

    @Test
    public void testHello() {
        DemoController controller = new DemoController();
        assertEquals("Hello from Demo!", controller.hello());
    }
}
