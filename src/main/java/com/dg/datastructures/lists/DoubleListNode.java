/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dg.datastructures.lists;

/**
 *
 * @author DG
 * @param <T>
 */
public class DoubleListNode<T> {
    DoubleListNode<T> prev;
    T data;
    DoubleListNode<T> next;

    public DoubleListNode(T _data) {
        prev = null;
        data = _data;
        next = null;
    }
}
