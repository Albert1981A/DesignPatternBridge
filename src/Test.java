import com.jb.operations.PrinterAbstraction;
import com.jb.printerType.DeluxePrinter;
import com.jb.printerType.MediumPrinter;
import com.jb.printerType.RegularPrinter;

public class Test {

    public static void main(String[] args) {

        /**
         * Bridge Design Pattern is a separation between abstraction and implementation
         */
        System.out.println("----------------------- Deluxe Printer ---------------------");
        PrinterAbstraction printer1 = new DeluxePrinter();
        printer1.testPage("Deluxe Printer");
        System.out.println();

        System.out.println("----------------------- Medium Printer ---------------------");
        PrinterAbstraction printer2 = new MediumPrinter();
        printer2.testPage("Medium Printer");
        System.out.println();

        System.out.println("----------------------- Regular Printer ---------------------");
        PrinterAbstraction printer3 = new RegularPrinter();
        printer3.testPage("Regular Printer");
        System.out.println();

        printer1.testPage("Deluxe Printer");

    }

}
