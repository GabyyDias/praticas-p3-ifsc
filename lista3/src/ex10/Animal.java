package ex10;

public class Animal {

	public static void main(String[] args) {
		
		AnimalDois a = new AnimalDois() ; 
		a.familia = "balaenepterodai"; 
		a.nomeCientifico = "mysticeti"; 
		a.reino = "animalia"; 
		System.out.println ("o nome científico do animal é " + a.nomeCientifico+ " ele pertence á família "
		+ a.familia + "e ao reino " + a.reino); 
		
		AnimalDois a2 = new AnimalDois() ; 
		a2.familia = "felídeos"; 
		a2.nomeCientifico = "Felis silvestris catus"; 
		a2.reino = "animalia"; 
		System.out.println ("o nome científico do animal é " + a2.nomeCientifico+ " ele pertence á família "
		+ a2.familia + "e ao reino " + a2.reino); 
		
		AnimalDois a3 = new AnimalDois() ; 
		a3.familia = " Canidae "; 
		a3.nomeCientifico = "Canis lupus familiaris "; 
		a3.reino = "animalia"; 
		System.out.println ("o nome científico do animal é " + a3.nomeCientifico+ " ele pertence á família "
		+ a3.familia + "e ao reino " + a3.reino); 
		
		AnimalDois a4 = new AnimalDois() ; 
		a4.familia = " Psittacidae "; 
		a4.nomeCientifico = "psittaciforme "; 
		a4.reino = "animalia"; 
		System.out.println ("o nome científico do animal é " + a4.nomeCientifico+ " ele pertence á família "
		+ a4.familia + "e ao reino " + a4.reino); 
		
		AnimalDois a5 = new AnimalDois() ; 
		a5.familia = " Equidae "; 
		a5.nomeCientifico = "Equus ferus caballus "; 
		a5.reino = " "; 
		System.out.println ("o nome científico do animal é " + a5.nomeCientifico+ " ele pertence á família "
		+ a5.familia + "e ao reino " + a5.reino); 
		
		
		
	
	}

}
