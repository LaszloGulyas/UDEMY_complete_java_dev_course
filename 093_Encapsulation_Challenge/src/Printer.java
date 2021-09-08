public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        int result;

        if (tonerAmount > 0 && tonerAmount < 100) {
            if ((tonerLevel + tonerAmount) > 100) {
                result = -1;
            } else {
                tonerLevel += tonerAmount;
                result = tonerLevel;
            }
        } else {
            result = -1;
        }

        return result;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;

        if (duplex) {
            pagesToPrint = (pages + 1) / 2;
        }

        pagesPrinted += pagesToPrint;

        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }
}
