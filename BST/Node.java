


public class Node<T> {
    private T data;
    private Node left;
    private Node right;
    
    Node(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    
    public T getData() {
        return this.data;
    }
    
    public Node getLeft() {
        return this.left;
    }
    
    public Node getRight() {
        return this.right;
    }
    
    public void setData(T data) {
        this.data = data;
    }
    
    public void setLeft(Node node) {
        this.left = node;
    }
    
    public void setRight(Node node) {
        this.right = node;
    }
}



