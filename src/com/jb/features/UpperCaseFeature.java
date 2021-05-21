package com.jb.features;

import com.jb.operations.PrinterFeature;

public class UpperCaseFeature extends PrinterFeature {

    @Override
    public void print(String text) {
        System.out.println(text.toUpperCase());
    }

}
