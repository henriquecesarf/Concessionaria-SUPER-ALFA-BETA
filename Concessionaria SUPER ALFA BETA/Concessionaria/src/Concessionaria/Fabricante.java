package Concessionaria;
import java.util.Scanner;

public class Fabricante {
	private String nomeFantasia;
	private String cnpj;
	private String telefone;
	Scanner s = new Scanner(System.in);
	
	public Fabricante(String nomeFantasia, String cnpj, String telefone) {
		super();
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.telefone = telefone;
	}

	
	public String DemonstrarFab() {
		return "Nome:" + this.nomeFantasia + "\nCNPJ:" + this.cnpj + "\nTelefone:" + this.telefone;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}
	
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}