package logistic;
import tienda.Tienda;

public class Distri {
	private M_transporte metodo;
	public void setMetodo(M_transporte m) {
		this.metodo=m;
	}
	public void transportar(Tienda inicio ,Tienda destino) {
		M_transporte.Transportar(inicio,destino);
		
	}
	

}
