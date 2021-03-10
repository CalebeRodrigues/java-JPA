package aplicacao;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(1, "Calebe Rodrigues", "calebe@gmail.com");
		Pessoa p2 = new Pessoa(1, "Carlos da Silva", "calos@gmail.com");
		Pessoa p3 = new Pessoa(1, "Joaquim Torres", "joaquim@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
