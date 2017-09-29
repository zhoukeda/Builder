package com.example.administrator.builderdemo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        Person.PersonBuilder builder = new Person.PersonBuilder();
        Person person = builder.setName("周科达").setAge(24).setSex(true).personBuilder();
        System.out.println(person.toString());
    }
}