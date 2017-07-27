package io.github.biezhi.java8.lambda;

import io.github.biezhi.java8.model.Person;
import io.github.biezhi.java8.todo.Lambda;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author biezhi
 * @date 2017/7/27
 */
public class LambdaTest {

    private Lambda lambda = new Lambda();

    private List<Person> people = new ArrayList<>();

    @Before
    public void before() {
        people.clear();
        people.add(new Person("biezhi"));
        people.add(new Person("rose"));
        people.add(new Person("jack"));
    }

    @Test
    public void testComparatorPerson() {
        lambda.comparatorPerson(people);
        System.out.println(people);
        Assert.assertEquals("biezhi", people.get(0).getName());
        Assert.assertEquals("jack", people.get(1).getName());
        Assert.assertEquals("rose", people.get(2).getName());
    }

    @Test
    public void testComparatorPersonJava8() {
        lambda.comparatorPersonJava8(people);
        System.out.println(people);
        Assert.assertEquals("biezhi", people.get(0).getName());
        Assert.assertEquals("jack", people.get(1).getName());
        Assert.assertEquals("rose", people.get(2).getName());
    }

}
