package com.koala.effectivejava.method_module07.returnValueNotNull_54;

import java.util.ArrayList;
import java.util.List;

/**
 * 第54条：
 *      返回零长度的数组或者集合，而不是null
 * Create by koala on 2022-04-17
 */
public class returnValueNotNull {
    private final List<Cheese> cheesesInStock = new ArrayList<>();

    public List<Cheese> getCheeses(){
        return new ArrayList<>(cheesesInStock);
    }

}