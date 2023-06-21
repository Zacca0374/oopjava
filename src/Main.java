public class Main {
    public static void main(String[] args) {
        Macchina macchina = new Macchina(130);
        Moto moto = new Moto(110);

        System.out.println("Macchina Velocita: " + macchina.getVelocita() + " km/h");
        System.out.println("Macchina Numero delle ruote: " + macchina.getNumerodelleruote());
        System.out.println("Moto Velocita: " + moto.getVelocita() + " km/h");
        System.out.println("Moto Numero delle ruote: " + moto.getNumberOfTires());
    }
}