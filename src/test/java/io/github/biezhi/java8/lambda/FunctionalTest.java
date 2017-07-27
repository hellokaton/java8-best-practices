package io.github.biezhi.java8.lambda;

import io.github.biezhi.java8.todo.Functional;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author biezhi
 * @date 2017/7/27
 */
public class FunctionalTest {

    private Functional functional = new Functional();

    @Test
    public void testNameGreet() {
        String greeting = functional.nameGreet(() -> "Jack");
        Assert.assertEquals("Hello Jack", greeting);
    }

}
