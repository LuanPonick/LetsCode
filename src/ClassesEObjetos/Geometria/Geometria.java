package ClassesEObjetos.Geometria;

public class Geometria {
    public double raio;
    public double ladoA;
    public double ladoB;

    public double calcular(double raio){
        this.raio = 3.14 * (this.raio * this.raio);
        return this.raio;
    }
    public double calcular(double ladoA, double ladoB){
        double area = ladoA*ladoB;
        return area;

    }

}
