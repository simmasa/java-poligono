package jana60;

public class Main {
    public static void main(String[] args) {
        PentagonoReg pent = new PentagonoReg(5);
        Rettangolo rett = new Rettangolo( 3, 7);
        Triangolo tria = new Triangolo(3,7,9);


        System.out.println(pent.getApotema());
    }
}
