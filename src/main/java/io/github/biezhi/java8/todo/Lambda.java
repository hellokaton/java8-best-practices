package io.github.biezhi.java8.todo;

import io.github.biezhi.java8.Avoid;
import io.github.biezhi.java8.Good;
import io.github.biezhi.java8.JDK7;
import io.github.biezhi.java8.model.Person;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * lambda实践
 *
 * @author biezhi
 * @date 2017/7/27
 */
public class Lambda {

    /**
     * Java7中排序方法
     */
    @JDK7
    public void comparatorPerson(List<Person> people) {
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
    }

    /**
     * 在Java8中好的做法
     */
    @Good
    public void comparatorPersonJava8(List<Person> people) {
        people.sort(Comparator.comparing(Person::getName));
    }

    /**
     * 避免使用这种方法
     */
    @Avoid
    public Function<String, String> toUpperCase1() {
        return (str) -> str.toUpperCase();
    }

    @Avoid
    public Function<String, String> toUpperCase2() {
        return (str) -> {
            return str.toUpperCase();
        };
    }

    /**
     * 好的做法
     */
    @Good
    public Function<String, String> toUpperCaseGood() {
        return str -> str.toUpperCase();
    }

}