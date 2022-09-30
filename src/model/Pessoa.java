package model;

import java.text.DecimalFormat;

public class Pessoa {

	public String nome;
	public int idade;
	public float altura;

	public String toString() {
		String alturastring = new DecimalFormat("####.00").format(altura);
		return "Pessoa= "+nome+" idade= "+idade+" altura= "+alturastring;
	}
}
