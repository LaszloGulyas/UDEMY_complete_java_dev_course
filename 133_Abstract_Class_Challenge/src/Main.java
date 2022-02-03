public class Main {

    public static void main(String[] args) {
        SearchTree searchTree = new SearchTree(null);
        searchTree.addItem(new Node(3));
        ListItem test = new Node(3);
        searchTree.addItem(test);
        System.out.println(searchTree.removeItem(test));
        searchTree.traverse(searchTree.getRoot());
    }
}
