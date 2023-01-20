package winter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		LinkedList<Integer> ll=new LinkedList<Integer>();
		
		doTimings("ArrayList",al);
		doTimings("LinkedList",ll);

	}
	public static void doTimings(String type,List<Integer> l) {
		for(int i=0;i<1E5;i++) {
			l.add(i);
		}
		long start =System.currentTimeMillis();
		
		// for(int i=0;i<1E5; i++) {  //items at the start
			// l.add(0,i);
		for(int i=0;i<1E5;i++) {   //items at the end
			l.add(i);
		}
		long end=System.currentTimeMillis();
		System.out.println("TimeTaken "+(end-start)+" ms for "+type);
	}

}
