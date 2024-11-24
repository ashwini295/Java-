package Novex_21112024_List_collection_Framework;

import java.util.LinkedList;
import java.util.List;

public class Lab_207_LL
{
    //Linkedlist allows duplicates and internally implements a doubly-linked list data struvture
    //Linkedlist elements will be stored internally using node representation
    //It is fast to insert and delete the elements, but slow for accessing the elements
    public static void main(String[] args) {
        //LinkedList mylist =new LinkedList<>();
        List mylist = new LinkedList();//dynamic dispatch
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(4);

        System.out.println(mylist);
        //selenium-> store and insrtion and deletion -DS-LL->will use linkedlist
        //API testing-> store and access it fast->will use arraylist




    }

}
