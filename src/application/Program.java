package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Lesson> list = new ArrayList<>();

		System.out.print("Quantas aulas tem o curso? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a aula:");
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char ch = sc.next().charAt(0);

			System.out.print("Título: ");
			String height = sc.next();
			sc.nextLine();

			if (ch == 'c') {
				System.out.print("URL do vídeo: ");
				String url = sc.next();

				System.out.print("Duração em segundos: ");
				Integer sec = sc.nextInt();
				sc.nextLine();

				System.out.println();

				list.add(new Video(height, url, sec));

			} else {
				System.out.print("Descrição: ");
				String desc = sc.next();
				sc.nextLine();

				System.out.print("Quantidade de questões: ");
				Integer qtde = sc.nextInt();

				list.add(new Task(height, desc, qtde));

				System.out.println();
			}
		}

		Integer sum = 0;
		for (Lesson lesson : list) {
			Integer descricao = lesson.duration();
			sum += descricao;		
		}
		
		System.out.printf("Duração Total do Curso = " + sum + " segundos");

		sc.close();
	}

}
