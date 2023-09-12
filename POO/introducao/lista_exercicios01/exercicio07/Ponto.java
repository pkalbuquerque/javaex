package POO.introducao.exercicio7;

public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y){
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
    private int definirQuadrante(){
        if (getx() >= 0 && gety() >= 0) 
            return 1;
        else if (getx() < 0 && gety() >= 0) 
            return 2;
        else if (getx() < 0 && gety() < 0) 
            return 3;
        else
        return  4;
    }
    public String imprimir(){
        return "Os ponto de coordenada (" + getx() + ", " + gety() +  ") pertence ao quadrante: " + definirQuadrante();
    }
}
