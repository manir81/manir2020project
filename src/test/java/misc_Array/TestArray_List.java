package misc_Array;


import java.util.ArrayList;
import java.util.List;

public class TestArray_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>myArrlist=new ArrayList<String>();
		myArrlist.add("APPLE");
		myArrlist.add("BALL");
		myArrlist.add("CAT");
		myArrlist.add("DOG");
		myArrlist.add("EAGLE");
		System.out.println("*******************************"); 
		
		  System.out.println("First Print with all loaded item"); 
		for(int i=0;i<myArrlist.size();i++) {
		System.out.println(myArrlist.get(i));
	
		if(i==2) {
			myArrlist.remove(3);
			}
		}
		System.out.println("*******************************"); 
		System.out.println("2nd Print after remove  items"); 
		for(int i=0;i<myArrlist.size();i++) {
			System.out.println(myArrlist.get(i));
	}
		System.out.println("*******************************"); 
		System.out.println("3rd Print with Resized item"); 
		myArrlist= new ArrayList<String>();
		for(int i=0;i<myArrlist.size();i++) {
			System.out.println(myArrlist.get(i));
	}
	}

}
