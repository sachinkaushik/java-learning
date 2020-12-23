package ds;public class BinaryTree {

    Node root;

    public void addNode(int key, String name) {

        Node newNode = new Node(key, name);

        if (root == null) {

            root = newNode;

        } else {

            Node focusNode = root;

            Node parent;

            while (true) {

                parent = focusNode;


                if (key < focusNode.key) {

                    // Switch focus to the left child

                    focusNode = focusNode.leftChild;

 

                    if (focusNode == null) {

 

                        // then place the new node on the left of it

 

                        parent.leftChild = newNode;

                        return; // All Done

                    }

                } else { // If we get here put the node on the right

                    focusNode = focusNode.rightChild;

                    // If the right child has no children

 

                    if (focusNode == null) {

 

                        // then place the new node on the right of it

 

                        parent.rightChild = newNode;

                        return; // All Done

                    }

                }

            }

        }

    }

    // Recursion is used to go to one node and
public void inOrderTraverseTree(Node focusNode) {

        if (focusNode != null) {

            inOrderTraverseTree(focusNode.leftChild);

            System.out.println(focusNode);

            inOrderTraverseTree(focusNode.rightChild);

        }

    }

    public void preorderTraverseTree(Node focusNode) {

        if (focusNode != null) {

            System.out.println(focusNode);

            preorderTraverseTree(focusNode.leftChild);

            preorderTraverseTree(focusNode.rightChild);

        }

    }

    public void postOrderTraverseTree(Node focusNode) {

        if (focusNode != null) {

            postOrderTraverseTree(focusNode.leftChild);

            postOrderTraverseTree(focusNode.rightChild);

            System.out.println(focusNode);

        }

    }

    public Node findNode(int key) {

        Node focusNode = root;

        while (focusNode.key != key) {

 



            if (key < focusNode.key) {

 
           // Shift the focus Node to the left child

 

                focusNode = focusNode.leftChild;

 

            } else {

 

 

                focusNode = focusNode.rightChild;

 

            }

 

            if (focusNode == null)

                return null;

        }

        return focusNode;

    }

public static void main(String[] args) {

        BinaryTree theTree = new BinaryTree();

 

       

 

        theTree.addNode(25, "Vice President");

 

        theTree.addNode(15, "Office Manager");

 

        theTree.addNode(30, "Secretary");

 
        theTree.addNode(50, "Boss");
        theTree.addNode(75, "Sales Manager");

 

        theTree.addNode(85, "Salesman 1");

 

        System.out.println("\nNode with the key 75");

        System.out.println("root="+theTree.root);

        System.out.println(theTree.findNode(75));

 

}

}

class Node {

    int key;

    String name;


    Node leftChild;

    Node rightChild;

 

    Node(int key, String name) {

 

        this.key = key;

        this.name = name;

    }

    public String toString() {

        return name + " has the key " + key;

    }

}
