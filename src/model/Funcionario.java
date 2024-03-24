package model;

import javax.swing.JOptionPane;

public class Funcionario {
	
	private String nome;
	private double salario;
	private String cargo;

	public Funcionario() {
		this.nome = "";
		this.salario = 1412;
		this.cargo = "";
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		if (salario<1412) {
			JOptionPane.showMessageDialog(null, "Nenhum funcionário pode receber menos de um salário mínimo");
			this.salario = 1412;
		}
		else {
			this.salario = salario;
		}
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public double getSalarioLiquido(double descontos, double beneficios) {
		double salarioLiquido = getSalario() - descontos - beneficios;
		return salarioLiquido;
	}

}
