package Binärbaum.Bro_Code;

import javax.xml.namespace.QName;

public class BinarySearchTree {
    
    Node root;

    public void insert(Node node) {
        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node) {

        int data = node.data;
        //Root is empty
        if (root == null) {
            root = node;
            return root;
        } //go left if value of my Element is smaller than the root-nodes value. 
        else if (data < root.data) {
            root.left = insertHelper(root.left, node);
        } //go right if value of my Element is larger than the root-nodes value.
        else {
            root.right = insertHelper(root.right, node);
        }
        //return current root node.
        return root;
    }

    public void display() {
        displayHelper(root);
    }
    
    private void displayHelper(Node root) {
        if (root != null) {
            //Inorder-Traversal:
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);

            //For Decreasing-Order: change left with right.
        }
    }
    
    public boolean search(int data) {
        return searchHelper(root, data);
    }

    private boolean searchHelper(Node root, int data) {
        //root is empty
        if (root == null) {
            return false;
        }
        //found the node we were looking for.
        else if (root.data == data) {
            return true;
        }
        //need to go left if our data is smaller than root.data.
        else if (root.data > data) {
            return searchHelper(root.left, data);
        }
        //need to go left if our data is larger than root.data
        else{
            return searchHelper(root.right, data);
        }
    }

    public void remove(int data) {
        //CHeck if data exists:
        if (search(data)) {
            //call remove-helper recursively
            removeHelper(root, data);
        }
        //trying to remove an element that's not in the tree:
        else {
            System.out.println(data + " couldn not be found!");
        }
    }
    
    public Node removeHelper(Node root, int data) {
        if (root == null) {
            return root;
        }
        //Case: data is less than root node -> go left down the tree as far as we can.
        else if (data < root.data) {
            root.left = removeHelper(root.left, data);
        }
        //Case: data is more than root node -> go right down the tree as far as we can.
        else if (data > root.data) {
            root.right = removeHelper(root.right, data);
        } else { //we found the node.
                 //check if it's a leaf node: (without any child-nodes)
            if (root.left == null && root.right == null) {
                root = null;
            }
            //case: only has smaller children (right == null)
            else if (root.right != null) { //find successor to replace this node.
                root.data = successor(root);
                //link a child to the spot where we deleted a node.
                root.right = removeHelper(root.right, data);
            } else { //find a predecessor to replace this node
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }

        }
        return root;
    }

    //attempting to find the least value below the right child of this root node.
    private int successor(Node root) {
        //go right once from the node that we want to remove. Then go as far left as we can to find the next closest bigger Node to the one we just removed.
        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    //same as successor but the other way round. Try to find the try to find the highest value below the left child of the root node:
    //we go left from the Node to be removed and then as far right as we can.
    private int predecessor(Node root) {
        root = root.left;
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }
}