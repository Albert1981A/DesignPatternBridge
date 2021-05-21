package com.jb.features;

import com.jb.operations.PrinterFeature;

public class RegularTextFeature extends PrinterFeature {

    @Override
    public void print(String text) {
        System.out.println(text);
    }

}
