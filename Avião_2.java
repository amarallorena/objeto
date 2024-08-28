package orientada_obj;

public class Avião_2 {

	public static void main(String[] args) {
		//Criando objeto avião
Aviao aviao1 = new Aviao();

//OBJETO 1
aviao1.setEa("Azul");
aviao1.setModelo(666);
aviao1.setPorte("Transcontinental");
aviao1.setCor("Rosa");
aviao1.setVoa("Sim");
aviao1.setAltura(13,716);
aviao1.setPeso(230.000);
aviao1.setLocomove("Sim");

//Cha,amdo o método get() para apresentar os objetos
System.out.println("----- OBJETO 1-----");
System.out.println(aviao1.getEa);
System.out.println(aviao1.getModelo);
System.out.println(aviao1.getPorte);
System.out.println(aviao1.getCor);
System.out.println(aviao1.getVoa);
System.out.println(aviao1.getAltura);
System.out.println(aviao1.getPeso);
System.out.println(aviao1.getLocomove);

	}

}
