package principal;

public class Ponto2D {
	private double x;
	private double y;
	
	
	
	public Ponto2D(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	

    public double getX (){
        return x;
    }

    public void setX (double x){
        this.x = x;
    }

    public double getY (){
        return y;
    }

    public void setY (double y){
        this.y = y;
    }

	public double calculaDistancia(Ponto2D ponto) {
		double distanciaPontos;

        distanciaPontos = Math.pow(Math.pow((ponto.getX()-this.x), 2) + Math.pow((ponto.getY()-this.y), 2), 2);

        return distanciaPontos;
	}

}
