package Novex_20112024_List;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab_201_List
{
    public static void main(String[] args) {
        List l = new ArrayList<>();//stored in arrays format(contineous memory)
        List l1 = new LinkedList();//stored in doubly linkedlist(insertion n deletion is eassy but finding ele is difficult)
        //diff is how they r stored in memory

        //Arraylist->
        //insersion/deletion/updation->Heavy
        //searching->eassy

        //Linkedlist
        //insersion/deletion/updation-> eassy
        //searching->heavy(A_>B->c)


        //Vector-> same as arraylist only diff is its synchronized in nature old class(legacy class)
        //one-one-> slow




        List fruits = List.of("Apple","Mango","Orange","Banana");
        //in list of we cant add new elements list of is hard coaded function


    }
}
