public class Main {

    public static void main(String[] args) {

        Printer myPrinter = new Printer("My printer", 90, 0, true, 3000);

        myPrinter.showResource();
        System.out.println();

        myPrinter.startPrint(100);
        myPrinter.showResource();
        System.out.println();

        myPrinter.startPrint(75);
        myPrinter.showResource();
        System.out.println();

        myPrinter.startPrint(1000);
        myPrinter.showResource();

        myPrinter.startPrint(2000);
        myPrinter.showResource();

        myPrinter.startPrint(1000);

        myPrinter.fillToner();

        myPrinter.startPrint(500);
        myPrinter.showResource();
    }
}
