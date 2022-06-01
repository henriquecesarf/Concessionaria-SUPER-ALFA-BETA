package Concessionaria;

public class Opcional {
	private int codigo;
	private String nome;
	private double valor = 100;
	

	


	public Opcional(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor * this.valor;
	}
	
	
	
	
}