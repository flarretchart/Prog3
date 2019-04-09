package ejercicio3;

import java.util.Iterator;
import java.util.List;



import ejercicio1.*;

public class Pila {
	private MySimpleLinkedList pila;

	public Pila() {
		this.pila = new MySimpleLinkedList();
	}

	public void push(Object o) {
		this.pila.insertFront(o);
	}

	public Object pop() {
		Object value = this.top();
		MySimpleLinkedList p = new MySimpleLinkedList();
		for(int i=2;i<this.pila.size();i++)
			p.setFirst(pila.get(i));
		
		this.pila = p;
		return value;
	}


	public Object top() {
		return this.pila.get(1);

	}

	public MySimpleLinkedList reverse() {
		MySimpleLinkedList p = new MySimpleLinkedList();
		Iterator<Object> i =this.pila.iterator();
		
		while(i.hasNext()) {
			p.insertFront(i.next());
		}
		
		return p;
	
	}
	
}
