import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> myContacts;

    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) != -1) {
            return false;
        } else {
            myContacts.add(contact);
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) != -1) {
            myContacts.set(myContacts.indexOf(oldContact), newContact);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) != -1) {
            myContacts.remove(contact);
            return true;
        } else {
            return false;
        }
    }

    private int findContact(Contact contact) {
        return (findContact(contact.getName()));
    }

    private int findContact(String name) {
        Contact contact = queryContact(name);
        return contact == null ? -1 : myContacts.indexOf(contact);
    }

    public Contact queryContact(String name) {
        for (Contact c : myContacts) {
            if (c.getName().equals(name)) {
                return c;
            }
        }

        return null;
    }

    public void printContacts() {
        StringBuilder out = new StringBuilder();

        out.append("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact c = myContacts.get(i);
            out.append("\n").append(i + 1).append(". ").append(c.getName())
                    .append(" -> ").append(c.getPhoneNumber());
        }
        System.out.println(out);
    }
}
