public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("CIB");
        bank.addBranch("Budapest");
        bank.addCustomer("Budapest", "Laci", 8000);
        bank.addCustomer("Budapest", "Nora", 3000);
        bank.addCustomer("Budapest", "Tomi", 5000);

        bank.addBranch("Pécs");
        bank.addCustomer("Pécs", "Joska", 999);

        bank.addCustomerTransaction("Budapest", "Laci", 15000);
        bank.addCustomerTransaction("Budapest", "Nora", 550);

        bank.listOfCustomers("Budapest", true);

    }
}
