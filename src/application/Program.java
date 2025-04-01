package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

//			Lista para armazenar as linhas do arquivo
		List<Employee> list = new ArrayList<>();

//			Caminho do arquivo de entrada
			String path = "C:\\Windows\\Temp\\in.txt";

//			Bloco try-with-resources >> Declara um ou mais recursos, e garante que esses recursos serão fechados ao final do Bloco
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

//				Lê a primeira linha do arquivo
			String employeeCsv = br.readLine();

//				Loop para ler todas as linhas do arquivo
			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
				list.add(new Employee(fields[0], Double.parseDouble(fields[1]))); // Adiciona a linha na lista
				employeeCsv = br.readLine(); // Lê a próxima linha
			}

//				Ordena a lista em ordem alfabética
			Collections.sort(list);

//				Exibe os nomes ordenados
			for (Employee emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
		}
//			Captura e exibe mensagens de erro caso ocorra uma exceção na leitura do arquivo
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
/*
  Exemplo de dados do arquivo a serem comparados:
  
Maria Brown,4300.00
Alex Green,3100.00
Bob Grey,3100.00
Anna White,3500.00
Alex Black,2450.00
Eduardo Rose,4390.00
Willian Red,2900.00
Marta Blue,6100.00
Alex Brown,5000.00
 
*/