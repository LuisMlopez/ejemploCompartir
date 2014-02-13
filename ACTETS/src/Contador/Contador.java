package Contador;

public class Contador {
	
	private int cont;
	
	public Contador(){
		cont=0;
	}
	
	public void decrementar(){
		cont=cont-1;
	}
	
	
	public int getContador(){
		return cont;
	}
	
	
	public void incrementar(){
		cont=cont+1;
	}
	
	
	public void printContador(){
		System.out.println("Valor: "+cont);
	}
	
	
	public void reset(){
		cont=0;
	}
	

}
