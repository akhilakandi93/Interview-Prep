package Hackerrank;

import java.util.Arrays;

public class airportTerminals {

	public static void main(String[] args) {
		String[] arrivals={"10:00","10:05","10:30"};
		String[] departure={"12:00","10:20","10:35"};
		for(int i=0;i<arrivals.length;i++){
			System.out.print(arrivals[i]+" ");
		}
		if(arrivals[1].compareTo(departure[1])>1){
			System.out.println("Arr is greater");
		}else{
			System.out.println("Dep is greater");
		}
		System.out.println(minTerminals(arrivals,departure));
	}
	
	public static int minTerminals(String[] arr, String[] dep){
		int count=0,j=0,i=0;
		Arrays.sort(dep);
		while(i<arr.length){
			if(arr[i].compareTo(dep[j])<0){
				count++;
				i++;
			}else{
				count--;
				j++;
			}
		}
		return count;
	}

}
