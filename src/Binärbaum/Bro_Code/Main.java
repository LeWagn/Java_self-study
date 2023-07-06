package Binärbaum.Bro_Code;

public class Main {

    //Tree: 
    //used in: File Explorer, HTML DOM, Databases...
    //size = # of Nodes.
    //depth = # of edges below the root node
    //height = # of edges above the furthes leaf-node.

    //Binary Tree: Trees that have no nodes with more than 2 child-nodes.
    //Best case: O(log n). Worst Case: O(n)

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));

        tree.remove(1);

        tree.display();

        System.out.println(tree.search(1));

    }

    //Theorie: Tree-Traversal (In- Post- and Pre- Order)
    /*Here: Binary Tree! Not Binary Search Tree
     * 
     * In-Order: left -> root -> right :            //Used to visit all Nodes in non-decreasing Order. 
     * private void traverseTree(Node root){
     *      traverseTree(root.left); 
     *      sysout(root.data);
     *      traverseTree(root.right);
     * }
     * 
     * Post-Order: left -> right -> root:           //Used to delete a Tree from leaf to root.
     * private void traverseTree(Node root){
     *      traverseTree(root.left); 
     *      traverseTree(root.right);
     *      sysout(root.data);
     * }
     * 
     * Pre-Order: root -> left -> right:            //Used to create a copy of a Tree.
     * private void traverseTree(Node root){
     *      sysout(root.data);
     *      traverseTree(root.left); 
     *      traverseTree(root.right);
     * }
     */

}
