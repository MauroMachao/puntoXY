package ar.edu.uno.puntoxy;

public class Punto {

	//ATRIBUTOS:

	private double x;
	private double y;
	private double xy;
	private static int cont=0;
	private double x2;
	private double y2;
	//////////////////////////////////

	//CONSTRUCTORES:

	public Punto(double x,double y) {
		this.setX(x);
		this.setY(y);
		this.setX2(x);
		this.setY2(y);
	}

	public Punto(int c) {
		this.setCont(cont++);
	}

	public Punto() {
		this(0,0);
	}
	/*public Punto(double xy) {
		this.setX(getXy());
		this.setY(getXy());
	}

	public Punto(double xy) {
		this(xy);
	}*/
	public Punto(Punto a) {
		this.setX(a.getX());
		this.setY(a.getY());
	}
	//////////////////////////////////////////

	//METODOS:

	public Punto suma(Punto a) {
		return new Punto(this.getX() + a.getX() , this.getY() + a.getY());
		
	}

	public static double modulo(Punto a) {
		return Math.sqrt(Math.pow(a.getX(), 2) + Math.pow(a.getY(),2));
	}

	public double distancia(Punto a) {
		return Math.sqrt(Math.pow(modulo(this), 2) + Math.pow(modulo(a), 2));
	}
	
	public static double distanciaxy(Punto a, Punto b) {
		return Math.sqrt(Math.pow(modulo(a), 2) + Math.pow(modulo(b), 2));
	}
	
	public Punto clon(Punto a) {
		a.setX(this.getX());
		a.setY(this.getY());
		return a;
	}
	
	public boolean equals(Punto a) {
		if(this.getX()==a.getX() && this.getY()==a.getY()) return true;
	 return false;
	}
	
	public String toString() {
		return "(" + x +"," + y +")";
	}

	public static void reset(Punto a) {
		a.setX(a.getX2());
		a.setY(a.getY2());
		}
	
	public Cuadrante getCuadrante() {
		if(this.getX ()> 0 && this.getY ()>0)return Cuadrante I;
		
	}
	//GETTERS & SETTERS:

	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public static int getCont() {
		return cont;
	}
	public static void setCont(int cont) {
		Punto.cont = cont;
	}

	public double getXy() {
		return xy;
	}

	public void setXy(double xy) {
		this.xy = xy;
	}

	public double getX2() {
		return x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

	public double getY2() {
		return y2;
	}

	public void setY2(double y2) {
		this.y2 = y2;
	}

}
