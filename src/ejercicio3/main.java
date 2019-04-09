package ejercicio3;

import java.util.Iterator;

import ejercicio1.MySimpleLinkedList;
import ejercicio1.Node;

public class main {

	public static void main(String[] args) {
		MySimpleLinkedList m1 = new MySimpleLinkedList();
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		m1.insertFront(31321);
		m1.insertFront(1245);
		m1.insertFront(22);
		m1.insertFront(88);
		mayor(m1);	
	}
	
	public static void mayor(MySimpleLinkedList m) {
		
		Iterator i = m.iterator();
			
			Integer info =(Integer) i.next();
			Integer aux = info;
		
			while(i.hasNext()) {
				info = (int)i.next();
				if(aux.compareTo(info) == -1) {
					aux = info;
				
			}
						
		}
		
		System.out.println(aux);
		System.out.println(m.getPos(aux));
	}
	
	public MySimpleLinkedList fusionListIguales(MySimpleLinkedList m1, MySimpleLinkedList m2) {
		MySimpleLinkedList salida = new MySimpleLinkedList();
		Iterator i = m1.iterator();
		
		while(i.hasNext()) {
			if(m2.contiene(i.next()))
				salida.insertFront(i.next());
		}
			
		
		return salida;
	}
	public MySimpleLinkedList fusionListDiferentes(MySimpleLinkedList m1, MySimpleLinkedList m2) {
		MySimpleLinkedList salida = new MySimpleLinkedList();
		Iterator i = m1.iterator();
		
		while(i.hasNext()) {
			if(!m2.contiene(i.next()))
				salida.insertFront(i.next());
		}
			
		
		return salida;
	}
}
