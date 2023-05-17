package ex9;

public class PessoaMainA {
	public static void main (String [] args) { 
		
		Peessoa p1 = new Peessoa(); 
		p1.nome = "gaby";  
		p1.cpf = 1234567890l;
		p1.data = "08/02/2006";
		System.out.println ("A pessoa  " + p1.nome+ " tem o CPF nº " + p1.cpf + 
		" e sua data de aniversário é:" + p1.data); 
		
		Peessoa p2 = new Peessoa(); 
		p2.nome = "Amanda";  
		p2.cpf = 5476218976l;
		p2.data = "15/07/2006";
		System.out.println ("A pessoa " + p2.nome+ " tem o CPF nº " + p2.cpf + 
				" e sua data de aniversário é:" + p2.data); 
		
		Peessoa p3 = new Peessoa(); 
		p3.nome = "Lara";  
		p3.cpf = 5432167890l;
		p3.data = "24/08/2005";
		System.out.println ("A pessoa " + p3.nome+ " tem o CPF nº " + p3.cpf + 
				" e sua data de aniversário é: " + p3.data); 
		

	
	}
}
