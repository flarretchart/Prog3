package ejercicio1;

import java.util.Iterator;

import ejercicio3.MyIterator;

public class MySimpleLinkedList implements Iterable<Object>{
	protected Node first;

	public MySimpleLinkedList() {
		this.first = null;
	}

	public void insertFront(Object o) {
		Node tmp = new Node(o, null);
		tmp.setNext(first);
		first = tmp;
	}
	
	public Object get(int index) {
		int count = 0;
		Node nodo =this.first;
		while(count<index) {
			nodo =nodo.getNext();
			count++;	
		}
		return nodo.getInfo();
	}
	public Object extractFront() { 
		return null;
	}

	public void print(int n) {
		System.out.println(this.get(n));
	}

	public boolean isEmpty() { 
		return this.first == null;
	}
	
	public int size() {
		int size = 0;
		Node nodo = this.first;
		
		while(nodo!= null) {
			nodo = nodo.getNext();
			size++;
		}
		return size;
	}
	public void setFirst(Node n) {
		this.first = n;
	}

	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return new MyIterator(this.first);
	}

	public int getPos(Object info) {
		Iterator i= this.iterator();
		int pos = 0;
		while(i.hasNext()) {
			
			if(info.equals(i.next()))
					return pos;
				
			pos++;
		}
		
		return -1;
	}
	
	public boolean contiene(Object value) {
		Iterator i = this.iterator();
		while(i.hasNext()) {
			if(value.equals(i.next()))
				return true;
		}
		
		return false;
	}
	
		
		

	}
	

