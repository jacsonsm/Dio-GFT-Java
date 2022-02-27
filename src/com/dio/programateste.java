package com.dio;

import com.dio.model.Gato;

public class programateste {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
		/*int a =10;
		int b =20;
		
		System.out.println("HELLO WORLD" + "-" + (a+b));*/

	}

}

class Livros {
	private String nome;
	private String npag;
}
