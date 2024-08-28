package orientada_obj;

public class Carro_2 {

	public static void main(String[] args) {
// Criando objetos da classe Carro
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		Carro carro4 = new Carro();
		
		//Objeto 1
		carro1.setModelo("Onix");
		carro1.setMarca("Chevrolet");
		carro1.setTipo("Carro popular");
		carro1.setCor("Prata");
		carro1.setAcl(600);
		carro1.setFarol("Sim");
		carro1.setDireita("Sim");
		carro1.setEsquerda("Sim");
		
		//Objeto 2
				carro2.setModelo("Civic");
				carro2.setMarca("Honda");
				carro2.setTipo("Carro popular");
				carro2.setCor("Branco");
				carro2.setAcl(800);
				carro2.setFarol("Sim");
				carro2.setDireita("Sim");
				carro2.setEsquerda("Sim");
				
				//Objeto 3
				carro3.setModelo("Jetta");
				carro3.setMarca("Volkswagen");
				carro3.setTipo("Carro popular");
				carro3.setCor("Preto");
				carro3.setAcl(700);
				carro3.setFarol("Sim");
				carro3.setDireita("Sim");
				carro3.setEsquerda("Sim");
				
				//Objeto 4
				carro4.setModelo("Strada");
				carro4.setMarca("Fiat");
				carro4.setTipo("Caminhonete");
				carro4.setCor("Vermelho");
				carro4.setAcl(400);
				carro4.setFarol("Sim");
				carro4.setDireita("Sim");
				carro4.setEsquerda("Sim");
				
				// Chamando método get () para apresentar os objetos
				
				System.out.println("----- OBJETO 1-----");
				System.out.println(carro1.getModelo());
				System.out.println(carro1.getMarca());
				System.out.println(carro1.getTipo());
				System.out.println(carro1.getCor());
				System.out.println(carro1.getAcl());
				System.out.println(carro1.getFarol());
				System.out.println(carro1.getDireita());
				System.out.println(carro1.getEsquerda());
				
				System.out.println("----- OBJETO 2-----");
				System.out.println(carro2.getModelo());
				System.out.println(carro2.getMarca());
				System.out.println(carro2.getTipo());
				System.out.println(carro2.getCor());
				System.out.println(carro2.getAcl());
				System.out.println(carro2.getFarol());
				System.out.println(carro2.getDireita());
				System.out.println(carro2.getEsquerda());
				
				System.out.println("----- OBJETO 3-----");
				System.out.println(carro3.getModelo());
				System.out.println(carro3.getMarca());
				System.out.println(carro3.getTipo());
				System.out.println(carro3.getCor());
				System.out.println(carro3.getAcl());
				System.out.println(carro3.getFarol());
				System.out.println(carro3.getDireita());
				System.out.println(carro3.getEsquerda());
				
				System.out.println("----- OBJETO 4-----");
				System.out.println(carro4.getModelo());
				System.out.println(carro4.getMarca());
				System.out.println(carro4.getTipo());
				System.out.println(carro4.getCor());
				System.out.println(carro4.getAcl());
				System.out.println(carro4.getFarol());
				System.out.println(carro4.getDireita());
				System.out.println(carro4.getEsquerda());

	}

}
