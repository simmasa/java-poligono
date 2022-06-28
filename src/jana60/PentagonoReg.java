package jana60;

public class PentagonoReg implements Poligono {
    private final int lati=5;
    private final double fisso= 0.688;
    private double lato;

    public PentagonoReg(double lato) {
        this.lato = lato;
    }

    @Override
    public double calcolaPerimetro() {
        return lato*5;
    }

    @Override
    public double calcolaArea() {
        return (calcolaPerimetro()*getApotema())/2;
    }
    public double getApotema(){
        return lato*fisso;
    }
}
