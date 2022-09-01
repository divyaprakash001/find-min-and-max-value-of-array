package com.divya;    // your package here

public class finding_minimum_maximum_value_in_array_using_methods_in_java {

    static void findMin(int arr[])    // using methods find minimum value
    {
        int min = arr[0];
        for(int element : arr)   // using for each loop // you can use for loop also
        {
            if(min>element)     // when element is smaller that min, assign min as that element
            {
                min = element;      // assigning new min value 
            }
        }
        System.out.println( "The minimum value in this array is "+min);
    }

    static void findMax(int arr[])    // using methods find maximum value
    {
        int max = arr[0];
        for(int element : arr)   // using for each loop // you can use for loop also
        {
            if(max<element)
            {
                max = element;
            }
        }
        System.out.println( "The maximum value in this array is "+max);
    }

    public static void main(String[] args) {
        int []arra = {22,34,5,7,53,44,443,3};
        findMin(arra);
        findMax(arra);
    }
}
