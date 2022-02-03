public class MyLinkedList implements NodeList {

    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem listItem) {
        if (root == null) {
            root = listItem;
            return true;
        }

        ListItem current = root;
        while (current != null) {
            if (current.getValue().equals(listItem.getValue())) {
                return false;
            }
            current = current.next();
        }

        if (listItem.compareTo(root) > 0) {
            listItem.setNext(root);
            root = listItem;
            return true;
        }

        current = root;
        ListItem previous = root;
        while (current.next() != null) {
            if (listItem.compareTo(current.next()) > 0) {
                listItem.setNext(current.next());
                current.setNext(listItem);
                return true;
            }
            previous = current;
            current = current.next();
        }

        previous.setNext(listItem);
        return true;
    }

    @Override
    public boolean removeItem(ListItem listItem) {
        if (listItem == null) {
            return false;
        }

        ListItem current = root;
        ListItem previous = root;
        while (current != null) {
            if (listItem.compareTo(current) == 0) {
                if (current == root) {
                    root = null;
                    return true;
                } else if (current.next() == null) {
                    previous.setNext(null);
                    return true;
                } else {
                    previous.setNext(current.next());
                    return true;
                }
            }
            previous = current;
            current = current.next();
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            ListItem current = root;
            while (current != null) {
                System.out.println(current.getValue());
                current = current.next();
            }
        }
    }
}
