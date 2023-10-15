package Trees;

public class SegmentTree {
    public static void main(String[] args){
        int[] arr = {3,8,6,7,-2,-8,4,9};
        SegmentTree tree = new SegmentTree(arr);
        //tree.display();
        System.out.println(tree.query(0 , 2));

    }

    private static class Node {

        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    private Node root;

    public SegmentTree(int[] arr){
        // create a tree using given array
        this.root = constructTree(arr,0 , arr.length-1);

    }

    private Node constructTree(int[] arr, int start, int end) {

        if(start == end){
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }
        // Create a new node with the index you are at
        Node node = new Node(start, end);

        int mid = (start+end) /2;

        node.left = this.constructTree(arr, start, mid);
        node.right = this.constructTree(arr, mid+1,end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display(){

        displayhelper(this.root);
    }
    private void displayhelper(Node node){
        String str = "";

        if(node.left != null){
            str = str + "Interval =[" +node.left.startInterval + "-"+node.left.endInterval +"] and data: " + node.left.data + " =>";
        }
        else {
            str = str +"No left child";
        }

        // for current node
        str = str + "Interval =[" +node.startInterval + "-" + node.endInterval + "] and data: " + node.data + " <= ";

        if(node.right != null){
            str = str + "Interval =[" +node.right.startInterval + "-"+node.right.endInterval +"] and data: " + node.right.data ;
        }
        else {
            str = str +"No right child";
        }

        System.out.println(str + '\n');

        if(node.left !=null){
            displayhelper(node.left);
        }
        if(node.right != null){
            displayhelper(node.right);
        }


    }

    // query for sum of number with given intervals
    public  int  query(int qstartIndex, int qendIndex){
        return this.queryhelper(this.root, qstartIndex, qendIndex);
    }
    private int queryhelper(Node node, int qstartIndex, int qendIndex) {
        // case 1 : node is completely lying inside query
        if(node.startInterval >= qstartIndex && node.endInterval <=qendIndex){
            return node.data;
        }
        // case 2 : node is completely outside
        else if(node.startInterval > qendIndex || node.endInterval < qstartIndex){
            return 0;
        }
        // case 3 : overlapping
        else{
            return this.queryhelper(node.left , qstartIndex, qendIndex) + this.queryhelper(node.right , qstartIndex, qendIndex);
        }

    }

    //update
    public void update(int index, int value){
        this.root.data = updatehelper(this.root , index, value);
    }
    private int updatehelper(Node node, int index, int value) {
        if(index >= node.startInterval && index <= node.endInterval){
            if(index == node.startInterval && index == node.endInterval){
                node.data = value ;
                return node.data;
            }
            else {
                int leftAns = updatehelper(node.left, index, value);
                int rightAns = updatehelper(node.right, index, value);

                node.data = leftAns + rightAns;
                return node.data;
            }
        }
        return node.data;
    }
}
