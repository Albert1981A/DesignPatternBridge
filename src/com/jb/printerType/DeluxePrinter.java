package com.jb.printerType;

import com.jb.features.LowerCaseFeature;
import com.jb.features.RegularTextFeature;
import com.jb.features.TabbedCaseFeature;
import com.jb.features.UpperCaseFeature;
import com.jb.operations.PrinterAbstraction;

public class DeluxePrinter extends PrinterAbstraction {

    @Override
    public void loadFeatures() {
        this.printerFeatures.add(new RegularTextFeature()); //0
        this.printerFeatures.add(new UpperCaseFeature()); // 1
        this.printerFeatures.add(new LowerCaseFeature()); // 2
        this.printerFeatures.add(new TabbedCaseFeature()); // 3
    }

}
