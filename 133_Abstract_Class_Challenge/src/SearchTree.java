import java.util.LinkedList;

public class SearchTree implements NodeList {

    private ListItem root;

    public SearchTree(ListItem root) {
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
        while (true) {
            if (listItem.compareTo(current) == 0) {
                return false;
            } else if (listItem.compareTo(current) > 0) {
                if (current.previous() == null) {
                    current.setPrevious(listItem);
                    return true;
                } else {
                    current = current.previous();
                }
            } else {
                if (current.next() == null) {
                    current.setNext(listItem);
                    return true;
                } else {
                    current = current.next();
                }
            }
        }
    }

    @Override
    public boolean removeItem(ListItem listItem) {
        if (listItem == null) {
            return false;
        }

        LinkedList<ListItem> stack = new LinkedList<>();
        ListItem parent = root;
        ListItem current = root;
        while (!(current == null && stack.size() == 0)) {
            if (current != null) {
                stack.push(current);
                current = current.previous();
            } else {
                current = stack.pop();
                if (current.compareTo(listItem) == 0) {
                    if (stack.size() > 0) {
                        parent = stack.pop();
                    }
                    performRemoval(current, parent);
                    return true;
                }
                parent = current;
                current = current.next();
            }
        }
        return false;
    }

    private void performRemoval(ListItem toBeRemoved, ListItem parent) {
        if (toBeRemoved == parent) {
            ListItem left = parent.previous();
            ListItem right = parent.next();
            root = null;
            if (left != null) {
                addItem(left);
            }
            if (right != null) {
                addItem(right);
            }
            return;
        }

        if (parent.previous() == toBeRemoved) {
            parent.setPrevious(null);
        } else if (parent.next() == toBeRemoved) {
            parent.setNext(null);
        }

        if (toBeRemoved.previous() != null) {
            addItem(toBeRemoved.previous());
        }

        if (toBeRemoved.next() != null) {
            addItem(toBeRemoved.next());
        }
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            return;
        }

        if (root.previous() != null) {
            traverse(root.previous());
        }

        System.out.println(root.getValue());

        if (root.next() != null) {
            traverse(root.next());
        }
    }
}
