package Novex_21112024_List_collection_Framework;

import java.util.PriorityQueue;

public class Lab_216_Queue
{
    public static void main(String[] args)
    {
        //very very rarely used FIFO
        //does not allowx null
        PriorityQueue pq = new PriorityQueue<>();
        pq.offer(1);//instead of add they use offer
        pq.offer(3);
        pq.offer(2);
        pq.offer(4);

        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());//instead of pop here poll will be used
        System.out.println(pq);


    }
}
