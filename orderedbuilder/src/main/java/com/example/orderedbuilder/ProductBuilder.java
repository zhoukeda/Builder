package com.example.orderedbuilder;

/**
 * Created by dada on 2017/9/29.
 */

public class ProductBuilder implements IBuilder {
    private Product product = new Product();
    @Override
    public PartA getPartA(PartA partA) {
        product.setPartA(partA);
        return product.getPartA();
    }

    @Override
    public PartB getPartB(PartB partB) {
        product.setPartB(partB);
        return product.getPartB();
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
