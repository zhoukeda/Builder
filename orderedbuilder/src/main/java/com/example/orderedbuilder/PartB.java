package com.example.orderedbuilder;

/**
 * Created by dada on 2017/9/29.
 */

public class PartB {
    public String getPart2() {
        return part2;
    }

    public PartB setPart2(String part2) {
        this.part2 = part2;
        return this;
    }

    private String part2;

    @Override
    public String toString() {
        return "PartB{" +
                "part2='" + part2 + '\'' +
                '}';
    }
}
