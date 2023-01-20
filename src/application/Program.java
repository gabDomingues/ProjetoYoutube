package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Gafanhoto;
import entities.Video;
import entities.Visualizacao;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Video v = new Video("Aula 14 - Projeto Final");
 		Gafanhoto p = new Gafanhoto("Gabriel", 21, 'M', "gab@gmail.com");

		System.out.println(v);
		System.out.println("--------------");
		System.out.println(p);
		System.out.println("--------------");
		
		Visualizacao f1 = new Visualizacao(p, v);
		f1.avaliar(7);
		System.out.println(v);
		System.out.println("--------------");
		
		v.like();
		
		Visualizacao f2 = new Visualizacao(p, v);
		f2.avaliar(9);
		System.out.println(v);

		
		System.out.println("--------------");
		System.out.println(p);
		sc.close();
	}

}
