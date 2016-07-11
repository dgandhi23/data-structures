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
public class BSTNode<T> {
    BSTNode<T> left;
    T data;
    BSTNode<T> right;

    public BSTNode(T _data) {
        left = null;
        data = _data;
        right = null;
    }
}
