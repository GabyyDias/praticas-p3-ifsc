package ifsc;

public class MainProduto {
	public static void main(String[] args) { 

		ArrayList<Produto> prdt= new ArrayList<>(); 
		
		Produto p1 = new Produto();
		p1.setNome("celular");
		p1.setCodBarras(6364487493l);
		p1.setPreco(1.169);
		p1.setFornecedor("Samung");

		prdt.add(p1); 

		Produto p2 = new Produto();
		p2.setNome("televisão");
		p2.setCodBarras(7349278539l);
		p2.setPreco(1.989);
		p2.setFornecedor("Philco");

		prdt.add(p2); 

		Produto p3 = new Produto();
		p3.setNome("notebook");
		p3.setCodBarras(4243939829l);
		p3.setPreco(7.899);
		p3.setFornecedor("Apple"); 

		prdt.add(p3); 
		
		for(Produto prdts: prdt) { 
			System.out.println(prdts.getNome()); 
			System.out.println(prdts.getCodBarras()); 
			System.out.println(prdts.getPreco()); 
			System.out.println(prdts.getFornecedor()); 
			
		}
		
		
		
		

	}
}
