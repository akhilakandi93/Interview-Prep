package Practice3;
import java.util.*;
public class mergeIntervals {

	static class Interval{
		int start;
		int end;
		Interval(int s,int e){
			start=s;
			end=e;
		}
	}
	public static void main(String[] args) {
		List<Interval> i=new ArrayList<Interval>();
		Interval a=new Interval(1,3);
		i.add(a);
		a=new Interval(3,4);
		i.add(a);
		a=new Interval(4,6);
		i.add(a);
		a=new Interval(6,10);
		i.add(a);
		mergeIntervals(i);
	}
	private static void mergeIntervals(List<Interval> i) {
		List<Interval> l=new ArrayList<Interval>();
		int[] starts=new int[i.size()];
		int[] ends=new int[i.size()];
		for(int j=0;j<i.size();j++){
			starts[j]=i.get(j).start;
			ends[j]=i.get(j).end;
		}
		Arrays.sort(starts);
		Arrays.sort(ends);
		
		for(int j=0,k=0;j<i.size();j++){
			if(j==i.size()-1 || starts[j+1]>ends[j]){
				Interval a=new Interval(starts[k],ends[j]);
				l.add(a);
				k=j+1;
			}
		}
		for(int j=0;j<l.size();j++){
			System.out.println(l.get(j).start+" "+l.get(j).end);
		}
	}
	
	

}
