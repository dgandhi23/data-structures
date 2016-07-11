/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dg.datastructures.trees;

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
        if(root == null) {
            root = node;
        }else {
            BSTNode<T> current = root;
            BSTNode<T> parent;
            
            while(true) {
                parent = current;
                if(_data.compareTo(parent.data) < 0) {
                    current = current.left;                    
                    if(current == null) {
                        parent.left = node;
                        return;
                    }
                } else {
                    current = current.right;                    
                    if(current == null) {
                        parent.right = node;
                        return;
                    }
                }
            }
        }
    }
    
    public void display() {
        BTreePrinter.printNode(root);
    }
}
