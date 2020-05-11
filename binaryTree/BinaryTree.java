package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

class BinaryTree {
  class Node {
    int key;
    Node left, right;

    public Node(final int item) {
      this.key = item;
      this.left = this.right = null;
    }
  }

  Node root;

  BinaryTree() {
    root = null;
  }

  Node insertTree(Node root, final int key) {
    if (root == null) {
      root = new Node(key);
      return root;
    } else {
      if (key < root.key)
        root.left = insertTree(root.left, key);
      else if (key > root.key)
        root.right = insertTree(root.right, key);
      return root;
    }
  }

  void insert(final int key) {
    root = insertTree(root, key);
  }

  void preOrder() {
    preOrderTree(root);
  }

  void preOrderTree(final Node root) {
    if (root != null) {
      System.out.print(root.key + " ");
      preOrderTree(root.left);
      preOrderTree(root.right);
    }
  }

  void inOrder() {
    inOrderTree(root);
  }

  void inOrderTree(final Node root) {
    if (root != null) {
      inOrderTree(root.left);
      System.out.print(root.key + " ");
      inOrderTree(root.right);
    }
  }

  void postOrder() {
    postOrderTree(root);
  }

  void postOrderTree(final Node root) {
    if (root != null) {
      postOrderTree(root.left);
      postOrderTree(root.right);
      System.out.print(root.key + " ");
    }
  }

  void levelOrder() {
    levelOrderTree(root);
  }

  void levelOrderTree(Node root) {
    Queue<Node> levelQueue = new LinkedList<Node>();
    levelQueue.add(root);
    while (!levelQueue.isEmpty()) {
      Node tempNode = levelQueue.poll();
      System.out.print(tempNode.key + " ");
      if (tempNode.left != null) {
        levelQueue.add(tempNode.left);
      }
      if (tempNode.right != null) {
        levelQueue.add(tempNode.right);
      }
    }

  }

  void searchValue(int val) {
    searchTreeValue(root, val);
  }

  void searchTreeValue(Node root, int val) {
    boolean result = false;
    if (root == null) {
      System.out.println("No tree to search");
    } else {
      Queue<Node> searchQueue = new LinkedList<Node>();
      searchQueue.add(root);
      while (!searchQueue.isEmpty()) {
        Node tempNode = searchQueue.poll();
        if (tempNode.key == val) {
          System.out.println("YES");
          result = true;
          break;
        } else {
          if (tempNode.left != null) {
            searchQueue.add(tempNode.left);
          }
          if (tempNode.right != null) {
            searchQueue.add(tempNode.right);
          }
        }
      }
      if (!result) {
        System.out.println("CAN NOT FIND " + val + " IN THIS TREE");
      }
    }
  }
  public static void main(final String[] args) {
    final BinaryTree tree = new BinaryTree();
    tree.insert(50);
    tree.insert(30);
    tree.insert(20);
    tree.insert(10);
    tree.insert(25);
    tree.insert(40);
    tree.insert(70);
    tree.insert(60);
    tree.insert(65);
    tree.insert(80);
    tree.insert(90);

    System.out.print("Original Tree: ");
    tree.preOrder();
    System.out.println();

    System.out.print("In ordered tree: ");
    tree.inOrder();
    System.out.println();

    System.out.print("Post ordered tree: ");
    tree.postOrder();
    System.out.println();
    
    System.out.print("Level ordered tree: ");
    tree.levelOrder();
    System.out.println();

    System.out.print("Search in tree: ");
    tree.searchValue(60);
    System.out.println();

  }
}