package jana60;

public class Quadrato implements Poligono {
    double lato;

    public Quadrato(double lato) {
        this.lato = lato;
    }

    @Override
    public double calcolaPerimetro() {
        return lato*4;
    }

    @Override
    public double calcolaArea() {
        return lato*lato;
    }
}
