package com.jb.operations;

import java.util.ArrayList;
import java.util.List;

public abstract class PrinterAbstraction {

    protected List<PrinterFeature> printerFeatures = new ArrayList<>();

    public PrinterAbstraction() {
        loadFeatures();
    }

    public void testPage(String text) {
        printerFeatures.forEach((printerFeature) -> printerFeature.print(text));
    }

    protected abstract void loadFeatures();
}
