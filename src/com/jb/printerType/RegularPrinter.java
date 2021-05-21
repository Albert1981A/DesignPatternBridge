package com.jb.printerType;

import com.jb.features.RegularTextFeature;
import com.jb.operations.PrinterAbstraction;

public class RegularPrinter extends PrinterAbstraction {

    @Override
    protected void loadFeatures() {
        this.printerFeatures.add(new RegularTextFeature());
    }

}
