package Practice1;
import java.util.*;


public class checkingImmutability{
	static boolean foo=true;
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        HashMap<Integer,ArrayList<Integer>> hmap=new HashMap<Integer,ArrayList<Integer>>();
        ArrayList<Integer> order=new ArrayList<Integer>();
       
        for(int i=0;i<prerequisites.length;i++){
            int key=prerequisites[i][0];
            int value=prerequisites[i][1];
            ArrayList<Integer> l;
            if(hmap.containsKey(key)){
                l=hmap.get(key);
            }else{
                l=new ArrayList<Integer>();
            }
            if(!order.contains(value)){
                if(!hmap.containsKey(value)) order.add(value);
            }
            if(order.contains(key)) order.remove((Integer)key);
            l.add(value);
            hmap.put(key,l);
        }
        if(hmap.size()==numCourses) return new int[0];
        
        Iterator it=hmap.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pair=(Map.Entry)it.next();
            getPrerequisites((int)pair.getKey(),order,hmap);
        }
        if(!foo) order.clear();
        int[] courses=new int[order.size()];
       for(int i=0;i<order.size();i++){
    	   System.out.print(order.get(i)+" ");
    	   courses[i]=order.get(i);
       }
       return courses;
    }
    
    
    public static void getPrerequisites(int course, ArrayList<Integer> order, HashMap<Integer,ArrayList<Integer>> hmap){
        if(foo){
        if(order.contains(course)) return;
        ArrayList<Integer> l=hmap.get(course);
        if(l.contains(-1)){
            foo=false;
        }
        int i=0;
        while(i<l.size() && l.get(i)!=-1 && foo){
            if(!order.contains(l.get(i))){
                l.add(-1);
                hmap.put(course,l);
                getPrerequisites(l.get(i),order,hmap);
            }
            i++;
        }
        if(foo) order.add(course);
        }
    }
    
    public String validIPAddress(String ip) {
        String result="Neither";
        if(ip.indexOf("::")!=-1 || ip.indexOf("..")!=-1 || ip.indexOf(".:")!=-1 || ip.indexOf(":.")!=-1){
            return result;
        }else if(ip.indexOf('.')!=-1){
            String[] array=ip.split("\\.");
            if(array.length!=4) return result;
            for(int i=0;i<4;i++){
            	int k=Integer.parseInt(array[i]);
            	if(k<0 || k>255 || (k>0 && array[i].charAt(0)=='0')){
            		return result;
            	}
            }
            result="IPv4";
        }else if(ip.indexOf(':')!=-1){
            String[] array=ip.split(":");
            if(array.length!=6) return result;
            for(int i=0;i<6;i++){
            	if(array[i].length()>4 || (array[i].charAt(0)=='0' && array[i].length()>1)) return result;
            }
            result="IPv6";
        }
        return result;
    }
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>(100);
//		l.add(0, 2);
//		l.add(100, 0);
//		System.out.println(l);
//		
		SortedSet s=new TreeSet();
		s.add(10);
		s.add(2);
		s.add(1);
		s.add(11);
		System.out.println(s);
		s.remove(11);
		s.remove(11);
		//System.out.println(s);
		System.out.println(s.size());
		Random rand=new Random();
		int size=rand.nextInt(s.size()) + 1;
		System.out.println(size);
//		int[][] c={{1,0},{2,0},{3,2},{3,1}};
//		System.out.println(2/3);
//		findOrder(4,c);
//		String str="abcd";
//		if(str.matches("[a-f | A-F | 0-9]")){
//			System.out.println("working");
//		}
//		if(str.indexOf("::")!=-1){
//			
//		}
		
	}
	

}
