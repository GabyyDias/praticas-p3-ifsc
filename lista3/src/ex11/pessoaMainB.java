package ex11;

import java.util.Scanner;

public class pessoaMainB {
	public static void main (String [] args) { 
		Scanner leitura = new Scanner (System.in); 
		Pessoa [] pessoas = new pessoa [3]; 
		
		for ( int i = 0; i < pessoas.length; i++) { 
			Pessoa p = new Pessoa (); 
			
			System.out.println (" digite seu nome: "); 
			p.nome = leitura.nextLine ();
			System.out.println (" digite seu cpf: "); 
			p.cpf = leitura.nextLine ();
			System.out.println (" digite sua data de nascimento: "); 
			p.Nascimento = leitura.nextLine ();
			
			pessoas [i] = p; 
			
		} 
		
		for (int i = 0; i < pessoas.length; i++) { 
			System.out.println ( "a" + pessoas [i].nome + "possuindo cpf " + pessoas [i].cpf + 
					" e nascida no dia " +pessoas[i].Nascimento); 
		
			
		
				

