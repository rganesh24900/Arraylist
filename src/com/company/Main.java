package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Object> l1 = new ArrayList<Object>();
        Test t1 =new Test("Ganesh","FullTime");
        Test t2 =new Test("Tommy","PartTime");
        Test t3 = new Test("Bucky","FullTime");
        l1.add(t1);
        l1.add(t2);
        l1.add(t3);

        ArrayList<Integer> i1 = new ArrayList<Integer>();

        i1.add(4);
        i1.add(6);
        i1.add(4);
        System.out.println(l1);
        System.out.println("Replacing the object t2 with value 8: ");
        l1.set(1,8);
        System.out.println(l1);


        System.out.println("Adding both the arraylist and storing the result in l1:");
        l1.addAll(i1);

        System.out.println("Removing elements of i1 from l1");
        l1.removeAll(i1);

            System.out.println(l1);


            System.out.println("Traversing the elements in arraylist using iterator:");
            Iterator itr = l1.iterator();
            while (itr.hasNext()){
                System.out.println(itr.next());
            }

            System.out.println("Printing the elements using the index of it:");

            for(int i=0;i<l1.size();i++){
                System.out.println(l1.get(i));
        }









        }


    }

