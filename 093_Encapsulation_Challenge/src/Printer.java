public class Printer {

    private double tonerLevel = 100;
    private int pagesPrintedTotal;
    private boolean duplex;

    public Printer(double tonerLevel, int pagesPrintedTotal, boolean duplex) {
        if(tonerLevel >=0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrintedTotal = pagesPrintedTotal;
        this.duplex = duplex;
    }

    public void refillToner () {
        tonerLevel = 100;
        System.out.println("Toner level has been refilled to 100");
    }

    private boolean consumeToner (int pages) {
        double consumedAmount = pages * 0.1;
        if(tonerLevel < consumedAmount) {
            System.out.println("Toner level is too low. Refill the toner!");
            return false;
        } else {
            tonerLevel -= consumedAmount;
            return true;
        }
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public void printPage (int pageNumber) {
        int pageUsed = 0;
        if(duplex) {
            pageUsed = (pageNumber+1) / 2;
        } else {
            pageUsed = pageNumber;
        }

        if(consumeToner(pageNumber)) {
            pagesPrintedTotal += pageUsed;
            System.out.println("Pages printed in this job: " + pageUsed);
            System.out.println("Total pages printed with this machine: " + pagesPrintedTotal);
            System.out.println("Job is completed");
        }

    }
}
