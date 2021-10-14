package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;
//CLASSE TRABALHADOR:
public class Worker117 {
	private String name; 
	private WorkerLevel level; //IMPORTAÇÃO DA CLASSE WORKERLEVEL
	private Double baseSalary; //VARIAVEL INICIAL DE BASE DE SALARIO
	private Department117 department; //IMPORTAÇÃO DA CLASSE DEPARTAMENTO
	private List<HourContract117> contracts = new ArrayList<>(); //LISTA CRIADA PARA ADICIONAR OS CONTRATOS DO TRABALHADOR(WORKER)

	public Worker117() { //CONSTRUTOR VAZIO CASO NAO QUEIRA USAR O CONSTRUTOR COM PARAMETROS

	}

	public Worker117(String name, WorkerLevel level, Double baseSalary, Department117 department) {//CONSTRUTOR COM PARAMETROS PRÉ DEFINIDOS
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department; //ASSOCIAÇÕES ENTRE PARAMETROS DO CONSTRUTOR E VARIAVEIS DA CLASSE TRABALHADOR(WORKER)
	}

	public String getName() {//GETTERS AND SETTERS
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department117 getDepartment() {
		return department;
	}

	public void setDepartment(Department117 department) {
		this.department = department;
	}

	public List<HourContract117> getContracts() {
		return contracts; //NESTE CASO, O ARRAYLIST NAO PODE TER UM SETTER, POIS O SET MUDA O ARQUIVO.
	}

	public void addContract(HourContract117 contract) {
		contracts.add(contract);//METODO CRIADO PARA ADICIONAR CONTRATOS AO ARRAYLIST. VARIAVEL CONTRACTS É DO ARRAY E A CONTRACT É DO METODO.
	}

	public void removeContract(HourContract117 contract) {
		contracts.remove(contract);//METODO CRIADO PARA REMOVER CONTRATO DO ARRAYLIST. VARIAVEL CONTRACTS É DO ARRAY E A CONTRACT É DO METODO.
	}

	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract117 c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.totalValue(); //DUVIDAS SOBRE ESTA PARTE... DO INICIO DO METODO ATÉ O RETURN
			}
		}

		return sum;
	}

}
