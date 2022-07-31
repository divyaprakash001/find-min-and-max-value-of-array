package in.divya.main;

public class max_min_value_of_array_in_java {

	public static void main(String[] args) {
		int [] arr = {54,24,43,44,212,78,65,24,6,7,8,6,54,34,1,454,43,43,36,227,32,63,376};
//		finding maximum from arr array
		
		int max = 0;    // set maximum to 0
		
		for(int e : arr)
		{
			if(e>max)
			{
				max = e;     // max will be re-assigned a new bigger value
			}
		}
		
		System.out.println("The max element is " + max);
		 
		
//		finding minimum from arr array
		
		int min=arr[arr.length-1];    // set minimum to  last index of array
		
		for(int m : arr)
		{
			if(m<min)
			{
				min = m;
			}
		}
		System.out.println("The min element is " + min);

	}

}
