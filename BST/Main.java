

public class Main
{
	public static void main(String[] args) {
		
		// iniciando a arvore com sua raiz
		Tree bst = new Tree(new Node(45));
		
		// inserindo os outros nós na arvore
		bst.insert(30);
		bst.insert(60);
		bst.insert(20);
		bst.insert(40);
		bst.insert(50);
		bst.insert(75);
		bst.insert(10);
		bst.insert(25);
		bst.insert(35);
		bst.insert(42);
		bst.insert(49);
		bst.insert(52);
		bst.insert(70);
		bst.insert(80);
		bst.insert(27);
		
        // impressao de nós em ordem
		bst.printInOrder();
		System.out.println();
		// impressao de nós em pós ordem
		bst.printPosOrder();
	}
}