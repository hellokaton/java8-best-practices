package io.github.biezhi.java8.todo;

import io.github.biezhi.java8.Avoid;
import io.github.biezhi.java8.Good;
import io.github.biezhi.java8.model.Bar;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * 函数式接口实践
 *
 * @author biezhi
 * @date 2017/7/27
 */
public class Functional {

    @FunctionalInterface
    interface FooBarQuery {
        Foo findAllFoos(Bar bar);
    }

    public String nameGreet(Supplier<String> nameSupplier) {
        return "Hello " + nameSupplier.get();
    }

    @Avoid
    interface Foo<T> {
        <R> Foo<R> apply(Function<T, R> fn);

        Foo<T> apply(UnaryOperator<T> fn);
    }

    @Good
    interface FooGood<T> {
        <R> Foo<R> applyFunction(Function<T, R> fn);

        Foo<T> applyOperator(UnaryOperator<T> fn);
    }


    interface Last {

        @Good
        Foo parse(Locale locale, Function<Locale, Foo> fn);

        @Avoid
        Foo parseAvoid(Function<Locale, Foo> fn, Locale locale);
    }

}