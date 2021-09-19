import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }

        return branch.newCustomer(customerName, initialTransaction);
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }

        return branch.addCustomerTransaction(customerName, transaction);
    }

    private Branch findBranch(String branchName) {
        for (Branch b : branches) {
            if (b.getName().equals(branchName)) {
                return b;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        //print out list of customers if printTransactions is true
        // returns isBranchExist?
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }

        StringBuilder out = new StringBuilder();
        out.append("Customer details for branch ").append(branchName);

        ArrayList<Customer> customers = branch.getCustomers();

        if (printTransactions) {
            for (int i = 0; i < customers.size(); i++) {
                Customer customer = customers.get(i);
                out.append("\nCustomer: ").append(customer.getName()).append("[").append(i + 1).append("]");
                out.append("\nTransactions");

                ArrayList<Double> transactions = customer.getTransactions();
                for (int j = 0; j < transactions.size(); j++) {
                    out.append("\n[").append(j + 1).append("]  Amount ").append(transactions.get(j));
                }
            }
        } else {
            for (int i = 0; i < customers.size(); i++) {
                Customer customer = customers.get(i);
                out.append("\nCustomer: ").append(customer.getName()).append("[").append(i + 1).append("]");
            }
        }

        System.out.println(out);
        return true;
    }
}
