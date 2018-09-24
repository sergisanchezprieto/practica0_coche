
public class CocheJuego extends Coche {
	
	private JLabelGraficoAjustado lCoche;

	public CocheJuego() {
		this.lCoche = new JLabelGraficoAjustado("coche.png", 100, 100);
		this.lCoche.setRotacion(Math.PI/2);
		
	}

	public JLabelGraficoAjustado getlCoche() {
		return lCoche;
	}

	public void setlCoche(JLabelGraficoAjustado lCoche) {
		this.lCoche = lCoche;
	}
	public void getlCoche(JLabelGraficoAjustado lCoche) {
		this.lCoche = lCoche;
	}
	
	public void setRotacion(double miDireccionActul) {
		lCoche.setRotacion(miDireccionActul+Math.PI/2);
	}
	

}
