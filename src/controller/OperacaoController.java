package controller;

import java.text.DecimalFormat;

import br.edu.fateczl.filaobj.Fila;
import model.Pessoa;

public class OperacaoController {

	public OperacaoController() {
		super();
	}
	
	public void brinquedo(Fila fila) throws Exception {
		
		while (!fila.isEmpty()) { 
			Pessoa p = new Pessoa();
			p = (Pessoa) fila.remove();
			String alturastring = new DecimalFormat("####.00").format(p.altura);
			if (p.altura<1.60) {
				System.out.println("Cliente = "+p.nome+" - "+p.idade+" anos - "+ alturastring+" -  Não entrou no brinquedo por causa da altura");
			} else {
				if (p.idade<16) {
					System.out.println("Cliente = "+p.nome+" - "+p.idade+" anos - "+ alturastring+" -  Não entrou no brinquedo por causa da idade");
				} else {
					System.out.println("Cliente = "+p.nome+" - "+p.idade+" anos - "+ alturastring+" -  Entrou no brinquedo");
				}
			}
		}
	}
}
