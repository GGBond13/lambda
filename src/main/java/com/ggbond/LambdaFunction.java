package com.ggbond;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.sql.SQLOutput;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//Lambda4大函数
public class LambdaFunction {
    public static void main(String[] args) {
        //function:接收一个参数.并返回一个结果
        function01();
        //Spupplier:不接受任何参数,返回一个结果
        function02();
        //Comsumer:接收一个参数.但没有返回值
        function03();
        //Predicate:接收一个参数并返回一个布尔值结果
        function04();
    }

    private static void function01() {
    /*Function<String, String> function = new Function<String, String>() {
        @Override
        public String apply(String s) {
            return s.toUpperCase();
        }
    };*/
        Function<String, String> function = s -> {return s.toUpperCase();};

        System.out.println(function.apply("ggbond"));
    }
    private static void function02() {
       /* Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return UUID.randomUUID().toString();
            }
        };*/
        Supplier<String> supplier = () -> {return UUID.randomUUID().toString();};
        System.out.println(supplier.get());
    }
    private static void function03(){
        Consumer<String> consumer = s -> System.out.println("这是一个Consumer函数接口!,它的参数为:"+ s);
        consumer.accept("100");
    }
    private  static void function04(){
        Predicate<String> predicate = s -> {return s.startsWith("G");};
        System.out.println(predicate.test("GGBond"));
    }
}
