/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dg.datastructures;

import com.dg.datastructures.lists.DoubleLinkList;
import com.dg.datastructures.lists.SingleLinkList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DG
 */
public class MainController {
    public static void main(String[] args) {
        SingleLinkList<String> strList = new SingleLinkList<>();
        SingleLinkList<Integer> numList = new SingleLinkList<>();
        DoubleLinkList<String> strDList = new DoubleLinkList<>();
        DoubleLinkList<Integer> numDList = new DoubleLinkList<>();
        
        strList.insert("A");
        strList.display();
        strList.insert("B");
        strList.display();
        strList.insert("C");
        strList.display();
        strList.insert("D");
        strList.display();
        
        numList.insert(1);
        numList.display();
        numList.insert(2);
        numList.display();
        numList.insert(3);
        numList.display();
        numList.insert(4);
        numList.display();
        
        strDList.insert("A");
        strDList.display();
        strDList.insert("B");
        strDList.display();
        strDList.insert("C");
        strDList.display();
        strDList.insert("D");
        strDList.display();
        
        numDList.insert(1);
        numDList.display();
        numDList.insert(2);
        numDList.display();
        numDList.insert(3);
        numDList.display();
        numDList.insert(4);
        numDList.display();
        
        try {
            strList.delete();
            strList.display();
            strList.delete();
            strList.display();
            strList.delete();
            strList.display();
            strList.delete();
            strList.display();
            
            numList.delete();
            numList.display();
            numList.delete();
            numList.display();
            numList.delete();
            numList.display();
            numList.delete();
            numList.display();
            
            strDList.delete();
            strDList.display();
            strDList.delete();
            strDList.display();
            strDList.delete();
            strDList.display();
            strDList.delete();
            strDList.display();
            
            numDList.delete();
            numDList.display();
            numDList.delete();
            numDList.display();
            numDList.delete();
            numDList.display();
            numDList.delete();
            numDList.display();
        } catch (Exception ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
