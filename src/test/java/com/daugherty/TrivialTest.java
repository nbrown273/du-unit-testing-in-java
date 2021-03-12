package com.daugherty;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrivialTest {
    @Test
    public void shouldExpressItselfTrivially () {
        Trivial x = new Trivial();
        Assertions.assertEquals("trivial", x.toString());
    }
}
