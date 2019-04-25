package practico2;

public class Node {

	private Integer info;
	private ArbolBinario der;
	private ArbolBinario izq;
	
	
	public Node() {
	info = null;
	}
	public Node (Integer o) {
		this.info = o;
	}
	
	public void setInfo(Integer o) {
	info = o;
	}
	
	
	public Integer getInfo() {
	return info;
	}
	
	public ArbolBinario getDer() {
		return der;
	}
	public void setDer(ArbolBinario der) {
		this.der = der;
	}
	public ArbolBinario getIzq() {
		return izq;
	}
	public void setIzq(ArbolBinario izq) {
		this.izq = izq;
	}
	
	

}
