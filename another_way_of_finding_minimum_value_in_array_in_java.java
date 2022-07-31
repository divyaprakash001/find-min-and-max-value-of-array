package com.divya;    // your package here

public class another_way_of_finding_minimum_value_in_array_in_java {

    static void findMin(int arr[])    // using methods
    {
        int min = arr[0];
        for(int element : arr)   // using for each loop // you can use for loop also
        {
            if(min>element)
            {
                min = element;
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int []arra = {2,34,4,5,7,5,6,4,4,3};
        findMin(arra);
    }
}
