package com.example.orderedbuilder;

/**
 * Created by dada on 2017/9/29.
 */
public interface IBuilder {
    PartA getPartA(PartA partA);
    PartB getPartB(PartB partB);
    Product getProduct();
}
