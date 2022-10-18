package com.bootcoding.restaurant.exercise;

public class array_exercise {
    public static void main(String[] args) {
        int []num={10,20,30,40,50};
        int ages[]=new int[5];
//        ages[1]=10;
//        ages[2]=20;
//        ages[3]=30;
//        ages[3]=40;
//        ages[4]=50;
        for(int i=0;i<ages.length;i++){
            ages[i]=(i+1)*10;
        }
// how to traverse the array
     for(int i=0;i<ages.length;i++)
     {
         System.out.println(i + "=" +ages[i]);
     }

     String []month={ "jan","feb","mar","apr","may","june","july","aug","sep","oct","nov","dec"};
     for(int i=0;i<month.length;i++){
         System.out.println(month[i]);
     }
    }
}
