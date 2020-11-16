public class Printer {

    private String name;
    private double tonerLevel = 100;
    private int printedPages = 0;
    private boolean isDuplex;
    private int pagesLeft = 2000;

    public Printer(String name, int tonerLevel, int printedPages, boolean isDuplex, int pagesLeft) {
        this.name = name;
        if(tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }

        if(printedPages >= 0) {
            this.printedPages = printedPages;
        }
        this.isDuplex = isDuplex;

        if(pagesLeft >= 0) {
            this.pagesLeft = pagesLeft;
        }
    }

    public void showResource() {
        System.out.println("Pages left in the printer: " + pagesLeft);
        System.out.println("Actual toner level: " + (int)tonerLevel + "%");
    }

    public int getPrintedPages() {
        return this.printedPages;
    }

    public double getTonerLevel() {
        return this.tonerLevel;
    }

    public void fillToner() {
        if(this.tonerLevel == 100) {
            System.out.println("Toner is already full!");
        } else {
            this.tonerLevel = 100;
            System.out.println("Toner has been refilled (100%)");
        }
    }

    public void replenishPaper() {
        //Max capacity = 4000;
        if(pagesLeft + 1000 > 4000) {
            System.out.println(4000 - pagesLeft + " pages have been replenished. Storage is full!");
            pagesLeft = 4000;
        } else {
            System.out.println(1000 + " pages have been replenished");
            pagesLeft += 1000;
            System.out.println("Pages in the printer: " + pagesLeft);
        }
    }

    public void startPrint(int pages) {
        pages = calcNeededPages(pages);

        if(checkResource(pages) == false) {
            return;
        }
        useResource(pages);
    }

    public boolean checkResource(int pages) {
        boolean status = true;
        if(pages > pagesLeft) {
            System.out.println("Not enough paper, replenish it!");
            status = false;
        }

        if(calcNeededToner(pages) > tonerLevel) {
            System.out.println("Not enough toner, refill it!");
            status = false;
        }
        return status;
    }

    private void useResource(int pages) {
        System.out.println(pages + " pages have been printed");
        printedPages += pages;
        pagesLeft -= pages;

        System.out.println((int)calcNeededToner(pages) + "% of total toner has been used");
        tonerLevel -= calcNeededToner(pages);
    }

    private int calcNeededPages(int pages) {
        if(isDuplex) {
            if(pages % 2 > 0) {
                pages /= 2;
                pages ++;
                return pages;
            } else {
                return pages /= 2;
            }
        } else {
            return pages;
        }
    }

    private double calcNeededToner(int pages) {
        return pages * 0.05;
    }
}
