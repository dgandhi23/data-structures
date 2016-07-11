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
public class DoubleLinkList<T> {
    DoubleListNode<T> head;
    DoubleListNode<T> tail;
    
    public void insert(T _data) {
        DoubleListNode<T> node = new DoubleListNode<>(_data);
        if(head == null) {
            head = tail = node;
        }else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }
    
    public T delete() throws Exception {
        if(head == null) throw new Exception("List is Empty!");
        if(head.next == null) {
            T _data = head.data;
            head = tail = null;
            return _data;
        }else {
            T _data = tail.data;
            DoubleListNode<T> prev = tail.prev;
            tail.prev = null;
            prev.next = null;
            tail = prev;
            return _data;
        }
    }
    
    public void display() {
        DoubleListNode current = head;
        while(current != null) {
            System.out.print(current.data);
            System.out.print("-->");
            current = current.next;
        }
        System.out.println("NULL");
        current = tail;
        while(current != null) {
            System.out.print(current.data);
            System.out.print("-->");
            current = current.prev;
        }
        System.out.println("NULL");
    }
}
