package ejercicio3;

import java.util.Iterator;

import ejercicio1.Node;

public class MyIterator implements Iterator<Object>{
	private Node nodo;
	public MyIterator(Node nodo) {
		this.nodo = nodo;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return this.nodo != null;
	}

	@Override
	public Object next() {
		Object info = this.nodo.getInfo();
		this.nodo = this.nodo.getNext();
		return info;
	}
	
}
