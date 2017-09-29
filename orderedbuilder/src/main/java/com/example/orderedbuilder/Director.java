package com.example.orderedbuilder;

/**
 * Created by dada on 2017/9/29.
 */

public class Director {
    private IBuilder iBuilder;

    public Director(IBuilder iBuilder) {
        this.iBuilder = iBuilder;
    }

    public Director getProduct(PartA partA, PartB partB){
        iBuilder.getPartA(partA);
        iBuilder.getPartB(partB);
        return this;
    }
    public Product showProduct(){
        return iBuilder.getProduct();
    }
}
