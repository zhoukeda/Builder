package com.example.orderedbuilder;

/**
 * Created by dada on 2017/9/29.
 */
public class Product {
    private PartA partA;

    public PartA getPartA() {
        return partA;
    }

    public void setPartA(PartA partA) {
        this.partA = partA;
    }

    public PartB getPartB() {
        return partB;
    }

    public void setPartB(PartB partB) {
        this.partB = partB;
    }

    private PartB partB;
}
