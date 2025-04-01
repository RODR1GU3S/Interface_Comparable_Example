package entities;

public class Employee implements Comparable<Employee> {

	private String name;
	private Double salary;

	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

//	Esse Método compareTo serve para comparar um objeto com outro
	@Override
	public int compareTo(Employee other) {

		return name.compareTo(other.getName()); // Aqui está comparando o nome com o outro nome

//		return -salary.compareTo(other.getSalary()); // Aqui se quiser comparar por Salário em Ordem DECRESCENTE "coloca o sinal ( - )"

//		return salary.compareTo(other.getSalary()); // Aqui se quiser comparar por Salário

	}
}
/*
 * Method compareTo:
 * 
 * Parameters:
 * 
 * // o - o objeto a ser comparado. o -the object to be compared.
 * 
 * Returns:
 * 
 * // um número inteiro negativo, zero, ou um número inteiro positivo como este
 * objeto é menor que, igual, ou maior que o objeto especificado. a negative
 * integer, zero, or a positive integer as this object is less than, equal to,
 * or greater than the specified object.
 * 
 * Exemplo:
 * 
 * System.out.println("maria".compareTo("alex")); >>>>>> Resultado 12
 * "pois maria em ordem alfabética está em ordem superior do que alex"
 * System.out.println("alex".compareTo("maria")); >>>>>> Resultado -12
 * "pois alex em ordem alfabética está em ordem superior do que maria"
 * System.out.println("maria".compareTo("maria")); >>>>>> Resultado 0
 * "pois maria em ordem alfabética é igual a maria"
 * 
 */
