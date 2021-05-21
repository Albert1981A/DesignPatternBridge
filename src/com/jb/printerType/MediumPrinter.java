package com.jb.printerType;

import com.jb.features.LowerCaseFeature;
import com.jb.features.RegularTextFeature;
import com.jb.features.UpperCaseFeature;
import com.jb.operations.PrinterAbstraction;

public class MediumPrinter extends PrinterAbstraction {

    @Override
    protected void loadFeatures() {
        this.printerFeatures.add(new RegularTextFeature());
        this.printerFeatures.add(new UpperCaseFeature());
        this.printerFeatures.add(new LowerCaseFeature());
    }

}
