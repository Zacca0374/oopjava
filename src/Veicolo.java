abstract class Vehicle {
    protected int velocita;

    public int getVelocita() {
        return velocita;
    }

    public abstract int getNumerodelleruote();

    public abstract int getNumberOfTires();
}

    class Macchina extends Vehicle {
    public Macchina(int velocita) {
        this.velocita = velocita;
    }

    @Override
    public int getNumerodelleruote() {
        return 4;
    }

        @Override
        public int getNumberOfTires() {
            return 0;
        }
    }

 class Moto extends Vehicle {
    public Moto(int velocita) {
        this.velocita = velocita;
    }

     @Override
     public int getNumerodelleruote() {
         return 2;
     }

     @Override
     public int getNumberOfTires() {
         return 2;
     }
 }