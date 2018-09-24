
public class Coche {
	
	private double miVelocidad;
	protected double miDireccionActul;
	protected double posX;
	protected double posY;
	private String piloto;



public Coche(){
	this.miVelocidad=0;
	this.miDireccionActul=0;
	this.posX=0;
	this.posY=0;
	this.piloto="";
}



public double getMiVelocidad() {
	return miVelocidad;
}



public void setMiVelocidad(double miVelocidad) {
	this.miVelocidad = miVelocidad;
}



public double getMiDireccionActul() {
	return miDireccionActul;
}



public void setMiDireccionActul(double miDireccionActul) {
	this.miDireccionActul = miDireccionActul;
}



public double getPosX() {
	return posX;
}



public void setPosX(double posX) {
	this.posX = posX;
}



public double getPosY() {
	return posY;
}



public void setPosY(double posY) {
	this.posY = posY;
}



public String getPiloto() {
	return piloto;
}



public void setPiloto(String piloto) {
	this.piloto = piloto;
}



@Override
public String toString() {
	
	return super.toString()+ "piloto:" + piloto + "posicion:" + posX + posY + "velocidad actual:" + miVelocidad + "direccion:" + miDireccionActul;
}

public void acelera(double aceleracion) {
	 this.miVelocidad += aceleracion;
	 


}

public void girar(double giro) {
	this.miDireccionActul += giro;
	
}
public void mueve() {
	this.posX = this.posX + this.miVelocidad * Math.cos(this.miDireccionActul + (Math.PI/2));
	this.posY = this.posY + this.miVelocidad * Math.sin(this.miDireccionActul + (Math.PI/2));
	
}




}
