package Practice2;
import java.util.*;
public class test2 {

	public static void main(String[] args) throws Exception {
//		int i=5;
//		System.out.println(i--);
//		System.out.println(i);
//		while(i-->0){
//			System.out.println(i);
//		}
//		System.out.println("Blah");
//		i=5;
//		while(--i>0){
//			System.out.println(i);
//		}
		int[] array={1,1,2,2,2,2,3,4};
		System.out.println("Hi ");
		int k=countOccurences(array,5);
		System.out.println("Hi "+k);
	}

	public static int countOccurences(int[] array, int i) {
		int len=0,index=0;
		int l=0, r=array.length-1;
		while(l<r){
			int mid=l+(r-l)/2;
			if(array[mid]==i){
				index=i;
				break;
			}else if(array[mid]<i){
				l=mid+1;
			}else{
				r=mid-1;
			}
		}
		if(l>=r) return -1;
		l=index-1;
		r=index+1;
		len++;
		while(array[l]==i || array[r]==i){
			if(array[l]==i && l>=0){
				len++;
				l--;
			}
			if(array[r]==i && r<array.length){
				len++;
				r++;
			}
		}
		return len;
	}
	


}

