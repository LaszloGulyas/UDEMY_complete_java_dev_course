public class Main {

    public static void main(String[] args) {

        Printer corporatePrinter1 = new Printer(100, 0, true);
        corporatePrinter1.printPage(100);
        corporatePrinter1.printPage(200);
        System.out.println(corporatePrinter1.getTonerLevel());
        corporatePrinter1.printPage(800);
        corporatePrinter1.refillToner();
        corporatePrinter1.printPage(800);
    }
}
