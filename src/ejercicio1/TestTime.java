package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class TestTime {

	public static void main(String[] args) {
		Timer t = new Timer();
		List<Integer> l2  = new ArrayList<>();
		System.out.println("array");
		for(int i =0;i<10;i++) {
			t.start();
			l2.add(i);
			System.out.println(t.stop());
		}
		System.out.println("linked");
		l2.add(21312);
		l2.add(213123);
		l2.add(3);
		
		MySimpleLinkedList l1 = new MySimpleLinkedList();
		for(int i =0;i<10;i++) {
			
			t.start();
			l1.insertFront(i);
			System.out.println(t.stop());
		}
		
		
		
	
	}

}
