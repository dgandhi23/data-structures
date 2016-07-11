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
public class SingleListNode<T> {
    T data;
    SingleListNode<T> next;
    
    SingleListNode(T _data) { 
        data = _data;
        next = null;
    }   
}
