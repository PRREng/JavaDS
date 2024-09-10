


public class Tree<T> {
    private Node<T> root;
    
    Tree(Node root) {
        this.root = root;
    }
    
    public Node getRoot() {
        return this.root;
    }
    
    public void insert(T data) {
        Node node = new Node<T>(data);
        insertHelper(this.root, node);
    }
    
    private Node insertHelper(Node root, Node node) {
        if (root == null) { return node; }
        
        if ((int) root.getData() <= (int) node.getData()) {
            root.setRight(insertHelper(root.getRight(), node));
        }
        else if ((int) root.getData() > (int) node.getData() ) {
            root.setLeft(insertHelper(root.getLeft(), node));
        }
        
        return root;
    }
    
    public void printInOrder() {
        InOrderHelper(this.root);
    }
    
    private void InOrderHelper(Node root) {
        if (root == null) { return; }
        
        InOrderHelper(root.getLeft());
        System.out.print(root.getData() + " - ");
        InOrderHelper(root.getRight());
    }
    
    public void printPosOrder() {
        PosOrderHelper(this.root);
    }
    
    private void PosOrderHelper(Node root) {
        if (root == null) { return; }
        
        PosOrderHelper(root.getLeft());
        PosOrderHelper(root.getRight());
        System.out.print(root.getData() + " - ");
    }
}


