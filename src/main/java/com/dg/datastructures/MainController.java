/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dg.datastructures;

import com.dg.datastructures.lists.DoubleLinkList;
import com.dg.datastructures.lists.SingleLinkList;
import com.dg.datastructures.trees.BinarySearchTree;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DG
 */
public class MainController {

    public static void main(String[] args) {
        SingleLinkList<String> strList = new SingleLinkList<>();
        DoubleLinkList<Integer> numDList = new DoubleLinkList<>();
        BinarySearchTree<Integer> numBST = new BinarySearchTree<>();

        strList.insert("A");
        strList.display();
        strList.insert("B");
        strList.display();
        strList.insert("C");
        strList.display();
        strList.insert("D");
        strList.display();

        numDList.insert(1);
        numDList.display();
        numDList.insert(2);
        numDList.display();
        numDList.insert(3);
        numDList.display();
        numDList.insert(4);
        numDList.display();

        numBST.insert(6);
        numBST.display();
        numBST.insert(2);
        numBST.display();
        numBST.insert(1);
        numBST.display();
        numBST.insert(9);
        numBST.display();
        numBST.insert(8);
        numBST.display();
        numBST.insert(15);
        numBST.display();
        numBST.insert(13);
        numBST.display();
        numBST.insert(11);
        numBST.display();
        numBST.insert(18);
        numBST.display();

        try {
            strList.delete();
            strList.display();
            strList.delete();
            strList.display();
            strList.delete();
            strList.display();
            strList.delete();
            strList.display();

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

        numBST.displayTraversal(numBST.printInorder());
        numBST.displayTraversal(numBST.printPreorder());
        numBST.displayTraversal(numBST.printPostorder());

        numBST.delete(6);
        numBST.display();
        numBST.delete(2);
        numBST.display();
        numBST.delete(1);
        numBST.display();
        numBST.delete(9);
        numBST.display();
        numBST.delete(8);
        numBST.display();
        numBST.delete(15);
        numBST.display();
        numBST.delete(13);
        numBST.display();
        numBST.delete(11);
        numBST.display();
        numBST.delete(18);
        numBST.display();
    }
}
