package com.example.orderedbuilder;

/**
 * Created by dada on 2017/9/29.
 */

public class PartA {
    public String getPart1() {
        return part1;
    }

    public PartA setPart1(String part1) {
        this.part1 = part1;
        return this;
    }

    private String part1;

    @Override
    public String toString() {
        return "PartA{" +
                "part1='" + part1 + '\'' +
                '}';
    }
}
