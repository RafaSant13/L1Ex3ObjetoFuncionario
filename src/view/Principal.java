package view;

import model.Funcionario;

public class Principal {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.setNome("Fulano");
		//O set de salário menor que o mínimo deve disparar uma mensagem e definir o valor como o salário mínimo (1412,00)
		f.setSalario(1200);
		f.setCargo("Ajudante de servente");
		
		double descontos = 200;
		double beneficios = 150;
		System.out.println("Nome do Funcionário: "+f.getNome());
		System.out.println("Cargo do Funcionário: "+f.getCargo());
		System.out.println("Salário Bruto: "+f.getSalario()+"| Salário Líquido: "+f.getSalarioLiquido(descontos, beneficios));
	}

}
