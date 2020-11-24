package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o caminho: ");
		String strCaminho = sc.nextLine();

		File caminho = new File(strCaminho);
		/////////////////////////////////////////////////////
		// LER PASTAS
		File[] pastas = caminho.listFiles(File::isDirectory);
		System.out.println("PASTAS: ");

		for(File pasta : pastas) {
			System.out.println(pasta);
		}
		////////////////////////////////////////////////////
		// LER ARQUIVOS
		File[] arquivos = caminho.listFiles(File::isFile);
		System.out.println("ARQUIVOS: ");
		for(File arquivo: arquivos) {
			System.out.println(arquivo);
		}
		////////////////////////////////////////////////////
		// CRIAR UMA SUB-PASTA
		boolean sucesso = new File(strCaminho + "O nome que eu quiser").mkdir();
		System.out.println("Diretório criado com sucesso: "+sucesso);
		
		sc.close();
	}

}
