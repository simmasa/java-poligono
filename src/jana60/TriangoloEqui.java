package jana60;

public class TriangoloEqui implements Poligono{
    private double base;

    public TriangoloEqui(double base) {
        this.base = base;
    }

    @Override
    public double calcolaPerimetro() {
        return base*3;
    }

    @Override
    public double calcolaArea() {
        return ((Math.sqrt(3)/4)*Math.pow(base,2));
    }
}
