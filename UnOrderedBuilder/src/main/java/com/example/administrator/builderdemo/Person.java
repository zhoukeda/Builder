package com.example.administrator.builderdemo;

/**
 * Created by dada on 2017/9/29.
 */

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    private boolean sex;
    public static class PersonBuilder{
        Person mperson = new Person();
        public PersonBuilder setName(String name){
            mperson.name = name;
            return this;
        }
        public PersonBuilder setAge(int age){
            mperson.age = age;
            return this;
        }
        public PersonBuilder setSex(boolean sex){
            mperson.sex = sex;
            return this;
        }
        public Person personBuilder(){
            return mperson;
        }
    }
}
