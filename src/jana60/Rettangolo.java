package jana60;

public class Rettangolo implements Poligono {
    private double lato1, lato2;

    public Rettangolo(double lato1, double lato2) {
        this.lato1 = lato1;
        this.lato2 = lato2;
    }

    @Override
    public double calcolaPerimetro() {
        return (lato1+lato2)*2;
    }

    @Override
    public double calcolaArea() {
        return lato1*lato2;
    }
}
