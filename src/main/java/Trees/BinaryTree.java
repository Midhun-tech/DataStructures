package Trees;

import java.util.Scanner;

public class BinaryTree {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        tree.populate(scanner);
        tree.display();
    }


    public static class Node{

        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }

    }
    public Node root;

    public void populate(Scanner scanner){

        System.out.println("Enter the root Node: ");
        int val = scanner.nextInt();
        root = new Node(val);

        populate(scanner,root);
    }

    private void populate(Scanner scanner, Node node){

        System.out.println("Do you want to enter left of " + node.val);

        boolean left = scanner.nextBoolean();

        if(left){

            System.out.println("Enter the value of the left of "+ node.val);
            int val = scanner.nextInt();
            node.left = new Node(val);
            populate(scanner,node.left);
        }

        System.out.println("Do you want to enter Right of " + node.val);

        boolean right = scanner.nextBoolean();

        if(right){

            System.out.println("Enter the value of the right of "+ node.val);
            int val = scanner.nextInt();
            node.right = new Node(val);
            populate(scanner,node.right);
        }
    }
    public void display(){
        display(root,"");
    }

    private void display(Node node, String s) {
        if(node == null){
            return;
        }
        System.out.println(s + node.val);
        display(node.left, s+"\t");
        display(node.right, s+"\t");
    }


}
