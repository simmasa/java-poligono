package jana60;

public class Triangolo implements Poligono{
    private double lato1;
    private double lato2;
    private double lato3;

    public Triangolo(double lato1, double lato2, double lato3) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

    @Override
    public double calcolaPerimetro() {
        return lato1+lato3+lato2;
    }

    @Override
    public double calcolaArea() {
        double semiP=(calcolaPerimetro()/2);
        return Math.sqrt(semiP*(semiP-lato1)*(semiP-lato2)*(semiP-lato3));
    }
    public void printArea() {
        double semiP=(calcolaPerimetro()/2);
        System.out.println(Math.sqrt(semiP*(semiP-lato1)*(semiP-lato2)*(semiP-lato3)));
    }
}


