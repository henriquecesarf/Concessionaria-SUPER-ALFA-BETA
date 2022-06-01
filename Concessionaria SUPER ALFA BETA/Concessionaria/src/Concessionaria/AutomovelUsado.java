package Concessionaria;

import java.util.ArrayList;
import java.util.List;

public class AutomovelUsado extends Automovel {
	private int anoFabricacao;
	private float km;
	private List<Opcional> opcionais;
	
	public void addopcional(Opcional opcional) {
		if(opcionais==null) {
			opcionais = new ArrayList<Opcional>();
		}
		this.opcionais.add(opcional);
	}
	
	
	public AutomovelUsado(Fabricante fabricante, String modelo, String chassi, String cor, double precoCusto, int anoFabricacao, float km) {
		super(fabricante, modelo, chassi, cor, precoCusto);
		this.anoFabricacao = anoFabricacao;
		this.km = km;
	}


	public int getAnoFabricacao() {
		return anoFabricacao;
	}


	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}


	public float getKm() {
		return km;
	}


	public void setKm(float km) {
		this.km = km;
	}
	
	public double getTotal() {
		if(this.opcionais==null) {
			return 0;
		}
		
		return this.opcionais.size() * 100;
		
	}
	
	
	
	
}