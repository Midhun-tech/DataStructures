package Trees.AVL;

public class AVL {

    public Node root;

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int val){

        root = insert(val,root);

    }
    private Node insert(int value, Node node){
        if(node == null){
            Node nod = new Node(value);
            return nod;
        }
        if(value < node.val){
            node.left = insert(value,node.left);
        }
        if(value > node.val){
            node.right = insert(value,node.right);
        }
        node.height = Math.max(height(node.left),height(node.right)) + 1 ;
        return rotate(node);
    }

    public Node rotate (Node node){
        if(height(node.left) - height(node.right) > 1){
            // left heavy
            if(height(node.left.left) - height(node.left.right) > 0){
                // left left case
                return rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0){
                // left right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if(height(node.left) - height(node.right) < -1){
            // right heavy
            if(height(node.right.left) - height(node.right.right) < 0){
                // right right case
                return leftRotate(node);
            }
            if(height(node.right.left) - height(node.right.right) > 0){
                // right left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node leftRotate(Node child) {
        Node parent = child.left;
        Node childRightChild = parent.left;

        parent.left = child;
        parent.right = childRightChild;

        parent.height = Math.max(height(parent.left),height(parent.right) + 1) ;
        child.height = Math.max(height(child.left),height(child.right) + 1 );

        return parent;
    }
    private Node rightRotate(Node parent) {

        Node child = parent.left;
        Node childRightChild = child.left;

        child.right = parent;
        parent.left = childRightChild;

        parent.height = Math.max(height(parent.left),height(parent.right) + 1) ;
        child.height = Math.max(height(child.left),height(child.right) + 1 );

        return child;
    }

    public void populateElementsIntoInsert(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            this.insert(arr[i]);
        }
    }

    public boolean isbalanced(Node node) {
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <=1 && isbalanced(node.left) && isbalanced(node.right);
    }

    public void display(){

        display(this.root, "Root Node: ");

    }
    private void display(Node node, String details) {

        if(node == null ){
            return;
        }
        System.out.println(details + node.val);
        display(node.left ,"left child of " + node.val + " : ");
        display(node.right ,"Right child of " + node.val + " : ");

    }

    public void addelement(Node node){
        root = addelementhelper(root, node);
    }
    private Node addelementhelper(Node root, Node node) {

        if(root == null){
            root = node;
            return root;
        }
        if(node.val < root.val){
            root.left = addelementhelper(root.left, node);
        }
        if(node.val > root.val){
            root.right = addelementhelper(root.right, node);
        }
        return root;
    }

    public void displayroot(){

        displayroot_helper(root);
    }
    private void displayroot_helper(Node root){
        if(root != null){
            displayroot_helper(root.left);
            System.out.println(root.val);
            displayroot_helper(root.right);
        }
    }

    public void searchforvalue(int value){

        System.out.println(searchforvaluehelper(root , value));
    }
    private boolean searchforvaluehelper(Node root, int value) {
        if(root == null){
            return false;
        }
        else if (value == root.val){
            return true;
        }
        else if (value < root.val){
            return searchforvaluehelper(root.left,value);
        }
        else{
            return searchforvaluehelper(root.right,value);
        }

    }

    public void remove(int value){
        if(searchforvaluehelper(root,value)){
            root = remove_helper(root, value);
            System.out.println("Removed : " + root.val);
        }
        else
            System.out.println(value +" not found in the BST");
    }
    private Node remove_helper(Node root, int value) {

        if(root == null){
            return root;
        }
        else if(value < root.val){
            root.left = remove_helper(root.left,value);
        }
        else if(value > root.val){
            root.right = remove_helper(root.right, value);
        }
        else{

            // Deleting leaf node
            if(root.left == null && root.right == null){
                root = null;
            }
            // Root node has right child
            else if(root.right !=null){
                root.val = successor(root); // finding a successor to replace the node
                root.right = remove_helper(root.right, root.val);
            }
            else {
                root.val = predecessor(root);
                root.left = remove_helper(root.left, root.val);
            }
        }
        return root;
    }

    // Find the least value below the right child of this root node
    private int successor(Node root) {
        root = root.right;
        while(root.left != null){
            root = root.left;
        }
        return root.val;
    }
    // Find the greatest value below the left child of this root node
    private int predecessor(Node root){
        root = root.left;
        while(root.right != null){
            root = root.right;
        }
        return root.val;
    }

}

