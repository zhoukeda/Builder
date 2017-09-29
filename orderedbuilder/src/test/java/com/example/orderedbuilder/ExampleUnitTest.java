package com.example.orderedbuilder;

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
        IBuilder builder = new ProductBuilder();
        Director director = new Director(builder);
        Product product = director.getProduct(new PartA().setPart1("aaa"), new PartB().setPart2("bbb")).showProduct();
        System.out.println(product.getPartA().getPart1()+"---"+product.getPartB().getPart2());
    }
}