package POO.introducao.exercicio7;

public class ponto {
    private double x;
    private double y;

    public ponto(double x, double y){
        setx(x);
        sety(y);
    }
    public void setx(double x ){
        this.x = x;
    }
    public void sety(double y ){
        this.y = y;
    }
    public double getx(){
        return this.x;
    }
    public double gety(){
        return this.y;
    }
}
