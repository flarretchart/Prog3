package practico2;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		

		
			ArbolBinario abb = new ArbolBinario();
			Node root = new Node();
			
			root.setInfo(new Integer(15));
			
			abb.insert(root.getInfo());
		
			abb.insert(new Integer(18));
			abb.insert(new Integer(13));
			abb.insert(new Integer(17));
			abb.insert(new Integer(20));
			abb.insert(new Integer(21));
			abb.insert(new Integer(19));
			abb.insert(new Integer(9));
			abb.insert(new Integer(14));
			abb.insert(new Integer(7));
			abb.insert(new Integer(11));
			
			List<Integer> list = abb.getFrontera();
			
			for(Integer val : list) {
				System.out.println(val);
			}
			
			
	}

}
