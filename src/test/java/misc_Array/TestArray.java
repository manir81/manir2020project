package misc_Array;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String [] myArr=new String[5];
		  myArr[0]="A";
		  myArr[1]="B";
		  myArr[2]="C";
		  myArr[3]="D";
		  myArr[4]="E";
		  System.out.println("First Print with all loaded item"); 
		for(int i=0;i<myArr.length;i++) {
		System.out.println(myArr[i]);
	
		if(i==2) {
		 myArr[i]="";
			}
		}
		System.out.println("2nd Print after remove  items"); 
		for(int i=0;i<myArr.length;i++) {
			System.out.println(myArr[i]);
	}
		System.out.println("3rd Print with Resized item"); 
		 myArr= new String[6];
		for(int i=0;i<myArr.length;i++) {
			System.out.println(myArr[i]);
	}
  }
}

