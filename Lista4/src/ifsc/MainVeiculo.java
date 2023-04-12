package ifsc;

public class MainVeiculo {
public static void main(String[] args) {
		
		veiculo v1 = new veiculo();
		v1.setNome("Camaro");
		v1.setAno(2013);
		v1.setNumRodas(4);
		v1.setFabricante("chevrolet");
		v1.setCor("amarelo");
		
		veiculo v2 = new veiculo();
		v2.setNome("gol");
		v2.setAno(2016);
		v2.setNumRodas(4);
		v2.setFabricante("Volkswagen");
		v2.setCor("vermelho");
		
		veiculo v3 = new veiculo();
		v3.setNome("Taos");
		v3.setAno(2022);
		v3.setNumRodas(4);
		v3.setFabricante("Volkswagen");
		v3.setCor("cinza");
	}

}

