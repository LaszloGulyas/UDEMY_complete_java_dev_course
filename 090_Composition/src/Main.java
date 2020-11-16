public class Main {

    public static void main (String[] args) {

        Dimensions myCaseSize = new Dimensions(150, 500, 600);
        Case myCase = new Case("ATX-mini","CoolerMaster", "500W ATX", myCaseSize);

        Resolution resFullHD = new Resolution(1920, 1080);
        Resolution resHDReady = new Resolution(1366, 768);

        Monitor myGamerMonitor = new Monitor("AW22", "Dell", 22, resFullHD);
        Monitor myOldMonitor = new Monitor("xy17", "LG", 17, resHDReady);

        Motherboard myGamerMotherboard = new Motherboard("Arctic White",
                "MSI", 4, 3, "Phoenix");

        PC myGamerPC = new PC(myCase, myGamerMonitor, myGamerMotherboard);

        myGamerPC.setMonitor(myOldMonitor);

        myGamerPC.powerUp();

    }
}
