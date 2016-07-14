/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dg.datastructures.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author DG
 * @param <T>
 */
public class BinarySearchTree<T extends Comparable<? super T>> {

    BSTNode<T> root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(T _data) {
        BSTNode<T> node = new BSTNode<>(_data);
        if (root == null) {
            root = node;
        } else {
            BSTNode<T> current = root;
            BSTNode<T> parent;

            while (true) {
                parent = current;
                if (_data.compareTo(parent.data) < 0) {
                    current = current.left;
                    if (current == null) {
                        parent.left = node;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = node;
                        return;
                    }
                }
            }
        }
    }

    public void delete(T _data) {
        if (root == null) {
            return;
        }

        BSTNode<T> parent = root, current = root;

        //search for the node to be deleted
        while (_data.compareTo(current.data) != 0) {
            parent = current;

            if (_data.compareTo(current.data) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }

            //node to be deleted was not found
            if (current == null) {
                return;
            }
        }

        //case 1: if node has no children
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
                return;
            }

            if (parent.left == current) {
                parent.left = null;
            } else {
                parent.right = null;
            }

            return;
        }

        //case 2: if node has left child
        if (current.right == null) {
            if (current == root) {
                root = current.left;
                current.left = null;
                return;
            }

            if (parent.left == current) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }

            current.left = null;
            return;
        }

        //case 3: if node has right child
        if (current.left == null) {
            if (current == root) {
                root = current.right;
                current.right = null;
                return;
            }

            if (parent.left == current) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }

            current.right = null;
            return;
        }

        //case 4: if node has both children
        if (current.left != null && current.right != null) {
            //check if root of right tree node is the min node value on the right
            if (current.right.left == null) {
                current.data = current.right.data;
                current.right = current.right.right;
                return;
            }

            BSTNode<T> minNodeParent = current, minNode = current.right;

            while (minNode.left != null) {
                minNodeParent = minNode;
                minNode = minNode.left;
            }

            //here we are at the left most node of the tree
            current.data = minNode.data;
            minNodeParent.left = minNode.right;
        }
    }

    public List<T> printInorder() {
        List<T> inorder = new ArrayList<>();

        if (root == null) {
            return inorder;
        }

        Stack<BSTNode<T>> stack = new Stack();
        BSTNode<T> current = root;

        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                BSTNode<T> node = stack.pop();
                inorder.add(node.data);
                current = node.right;
            }
        }

        return inorder;
    }

    public List<T> printPreorder() {
        List<T> preorder = new ArrayList<>();

        if (root == null) {
            return preorder;
        }

        Stack<BSTNode<T>> stack = new Stack();
        stack.push(root);

        while (!stack.isEmpty()) {
            BSTNode<T> node = stack.pop();
            preorder.add(node.data);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }

        return preorder;
    }

    /**
     * 
     * @return 
     * @reference: http://www.programcreek.com/2012/12/leetcode-solution-of-iterative-binary-tree-postorder-traversal-in-java/
     */
    public List<T> printPostorder() {
        List<T> postorder = new ArrayList<>();

        if (root == null) {
            return postorder;
        }

        Stack<BSTNode<T>> stack = new Stack<>();
        stack.push(root);

        BSTNode<T> prev = null;
        while (!stack.empty()) {
            BSTNode<T> curr = stack.peek();

            // go down the tree.
            //check if current node is leaf, if so, process it and pop stack,
            //otherwise, keep going down
            if (prev == null || prev.left == curr || prev.right == curr) {
                //prev == null is the situation for the root node
                if (curr.left != null) {
                    stack.push(curr.left);
                } else if (curr.right != null) {
                    stack.push(curr.right);
                } else {
                    stack.pop();
                    postorder.add(curr.data);
                }

                //go up the tree from left node
                //need to check if there is a right child
                //if yes, push it to stack
                //otherwise, process parent and pop stack
            } else if (curr.left == prev) {
                if (curr.right != null) {
                    stack.push(curr.right);
                } else {
                    stack.pop();
                    postorder.add(curr.data);
                }

                //go up the tree from right node
                //after coming back from right node, process parent node and pop stack.
            } else if (curr.right == prev) {
                stack.pop();
                postorder.add(curr.data);
            }

            prev = curr;
        }
        
        return postorder;
    }

    public void display() {
        BTreePrinter.printNode(root);
    }
    
    public void displayTraversal(List<T> list) {
        for(T l : list) {
            System.out.print(l);
            System.out.print(",");
        }
        System.out.println();
    }
}
