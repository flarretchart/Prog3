package practico2;

import java.util.ArrayList;
import java.util.List;

public class ArbolBinario {
	private Node root;

	public ArbolBinario() {
		this.root = new Node();
	}

	public Integer getRoot() {
		return this.root.getInfo();
	}

	public boolean isEmpty() {
		return this.root == null;
	}

	public boolean hasElement(Integer value) {
		if (this.isEmpty())
			return false;

		if (this.root.getInfo().equals(value))
			return true;

		if (this.root.getInfo().compareTo(value) == -1) {
			this.root.getIzq().hasElement(value);
		} else {
			this.root.getDer().hasElement(value);
		}

		return false;
	}

	public void printPosOrder() {
		if (this.isEmpty())
			return;

		System.out.print(this.root.getInfo() + " ");

		this.root.getIzq().printPosOrder();

		this.root.getDer().printPosOrder();
	}

	public void printPreOrder() {
		if (this.isEmpty())
			return;
		
		this.root.getIzq().printPosOrder();
		
        this.root.getDer().printPosOrder();
        
		System.out.print(this.root.getInfo() + " ");

	}

	public void printInOrder() {
		if (this.isEmpty())
			return;

		this.root.getIzq().printPosOrder();
		System.out.print(this.root.getInfo() + " ");;
		this.root.getDer().printPosOrder();
	}

	
	public int getHeight() {
		return 0;
	}

	public void insert(Integer value) {
		  if (this.isEmpty()) {
	           this.newArbolBinario(value);
	        }
		  
	        else {

	    		if (this.root.getInfo().compareTo(value) == -1) {
	    			this.root.getIzq().insert(value);
	    		} else {
	    			this.root.getDer().insert(value);
	    		}
	        }
	}
	
	private void  newArbolBinario (Integer value) {
		 Node node = new Node();
         node.setInfo(value);
         node.setDer(new ArbolBinario());
         node.setIzq(new ArbolBinario());
         this.root = node;
	}
	
	public boolean delete(Object object) {
		return false;
	}

	public List<Node> getLongestBranch() {
		return null;
	}

	public List<Integer> getFrontera() {
		List<Integer> salida = new ArrayList<>();
		if(this.isSheet())
			salida.add(this.root.getInfo());
		
		salida.addAll(this.root.getIzq().getFrontera());
		
		salida.addAll(this.root.getDer().getFrontera());
		
		return salida;
	}
	
	private boolean isSheet() {
		return (this.root.getIzq().isEmpty() && this.root.getDer().isEmpty());
	}

	public Object getMaxElement() {
		return null;
	}

	public List<Node> getElementAtLevel() {
		return null;
	}
}



