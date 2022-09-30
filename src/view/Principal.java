package view;


import br.edu.fateczl.filaobj.Fila;
import model.Pessoa;
import controller.OperacaoController;

public class Principal {

	public static void main(String[] args) throws Exception {
		String nome;
		int idade;
		float altura;

		Fila fila = new Fila();
		
		for (int i=0;i<30;i++) {
			nome = "Pessoa"+(i+1);
			idade = (int) (Math.random() * 30) + 10;
			altura = (float) ((float) Math.random() * 0.65 + 1.35);
			Pessoa p = new Pessoa();
			p.nome = nome;
			p.idade = idade;
			p.altura = altura;
			fila.insert(p);
		}
		OperacaoController c = new OperacaoController();
		c.brinquedo(fila);
	}

}
