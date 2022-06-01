package Concessionaria;

import java.util.ArrayList;
import java.util.List;

public class Automovel{
	private Fabricante fabricante;
	private String modelo;
	private String chassi;
	private String cor;
	private double precoCusto;
	private List<Opcional> opcionais;
	
	
	public void addopcional(Opcional opcional) {
		if(opcionais==null) {
			opcionais = new ArrayList<Opcional>();
		}
		this.opcionais.add(opcional);
	}
	
	public Automovel(Fabricante fabricante, String modelo, String chassi, String cor, double precoCusto
		) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.chassi = chassi;
		this.cor = cor;
		this.precoCusto = precoCusto;
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	public List<Opcional> getOpcional() {
		return opcionais;
	}
	public void setOpcional(List<Opcional> opcional) {
		this.opcionais = opcional;
	}
	
	
	public double getTotal() {
		if(this.opcionais==null) {
			return  0;
		}
		
		return this.opcionais.size() * 100;
		
	}
	
	
	
	
}