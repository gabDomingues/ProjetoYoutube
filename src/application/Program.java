package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Gafanhoto;
import entities.Pessoa;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Video v[] = new Video[3];
 		Pessoa p = new Gafanhoto("Gabriel", 21, 'M', "gab@gmail.com");
		v[0] = new Video("Aula 14 - Projeto Final");
		System.out.println(v[0]);
		System.out.println("--------------");
		System.out.println(p);
		sc.close();
	}

}
