package Concessionaria;
import java.util.ArrayList;

public class Venda {
	
	
	public double compraCarroZero(Cliente cliente, Automovel automovel ) {
		
		return automovel.getPrecoCusto() + (automovel.getPrecoCusto() * 0.3)  + automovel.getTotal();
	}
	
	
	public double compraCarroUsado(Cliente cliente, AutomovelUsado automovelUsado) {

        int percaAno = 2022 - automovelUsado.getAnoFabricacao();
        double percaPct = percaAno * 0.02;

        double totalcarro = automovelUsado.getPrecoCusto() + (automovelUsado.getPrecoCusto() * 0.3);

        return automovelUsado.getPrecoCusto() + (automovelUsado.getPrecoCusto() * 0.3) - (totalcarro * percaPct) + automovelUsado.getTotal() ;
	}

}