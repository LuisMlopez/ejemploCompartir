package Contador;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Contador[] vec= new Contador[3];
		
		for (int i=0;i<vec.length;i++)
			vec[i]= new Contador();
		
		
		String menu= "\n1.- Incrementar";
		menu = menu + "\n2.- Decrementar";
		menu = menu + "\n3.- Resetear";
		menu = menu + "\n4.- Seleccionar contador";
		menu = menu + "\n0.- Salir";
		
		Contador c = vec[0];
		
		int opt;
		
		do{
			System.out.println(menu+"\n");
			vec[0].printContador();
			vec[1].printContador();
			vec[2].printContador();
			System.out.println("\nElija una opcion:");
			opt = teclado.nextInt();
			
			switch (opt) {
			
			case 1: c.incrementar();
				break;
			case 2: c.decrementar();
				break;
			case 3: c.reset();
				break;
			case 4: System.out.print("Contador? (1-3): ");
				int r = teclado.nextInt();
				if (r<1 || r>3)
					System.out.println("Opción erronea");
				else
					c=vec[r-1];
			}	
						
		}while(opt!=0);	
		
		teclado.close();
	}

}


