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
public class SingleLinkList<T> {
    SingleListNode<T> head;
    SingleListNode<T> tail;

    public SingleLinkList() {
        head = null;
        tail = null;
    }
    
    public void insert(T _data) {
        SingleListNode<T> node = new SingleListNode<>(_data);
        if(head == null) {
            head = tail = node;
        } else {
            tail.next = node;
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
            SingleListNode<T> current = head;
            while(current.next != tail) {
                current = current.next;
            }
            T _data = tail.data;
            tail = current;
            tail.next = null;
            return _data;
        }
    }
    
    public void display() {
        SingleListNode current = head;
        while(current != null) {
            System.out.print(current.data);
            System.out.print("-->");
            current = current.next;
        }
        System.out.println("NULL");
    }
}
