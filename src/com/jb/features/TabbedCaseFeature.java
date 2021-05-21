package com.jb.features;

import com.jb.operations.PrinterFeature;

public class TabbedCaseFeature extends PrinterFeature {
    @Override
    public void print(String text) {
        char[] chars = text.toCharArray();
        for (char c :chars) System.out.print(c + "\t");
        System.out.println();
    }
}
