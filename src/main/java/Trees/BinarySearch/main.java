package Trees.BinarySearch;

import Trees.AVL.Node;
import Trees.BinarySearch.BinarySearch;

public class main {

    public static void main(String[] args) {

        BinarySearch BST = new BinarySearch();
        //BST.populateElementsIntoInsert(new int[]{5,4});
        //BST.display();
        BST.addelement(new Node(5));
        BST.addelement(new Node(4));
        BST.addelement(new Node(3));
        BST.addelement(new Node(2));
        BST.addelement(new Node(1));


        BST.displayroot();
//        BST.searchforvalue(10);
//        BST.remove(5);
//        BST.displayroot();
    }
}
