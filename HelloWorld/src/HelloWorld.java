import java.util.ArrayList;

public class HelloWorld {

	public static void main(String[] args) {
		/*int[] ar = { 10, 9, 8, 7, 6, 8 };
		for (int r : ar) {
			System.out.println(r);
			r++; */
		
		ArrayList<Integer> myList = new ArrayList<Integer>(3);
		myList.add(7);
		myList.add(77);
		myList.add(777);
		
		System.out.println("Array size " + myList.size());
		
for (Integer my : myList) {
	
	System.out.println(my);
}
		}
	}

