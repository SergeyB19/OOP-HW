public class Gryffindor extends Hogwarts {
    public int nobility;
    public int honour;
    public int bravery;

    public Gryffindor(String firstName, String surName, String faculty, int nobility, int honour, int bravery) {
        super(firstName, surName, faculty);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return String.format("благородство = %d,честь=%d; храбрость=%d",  super.toString(), nobility, honour, bravery);
    }
}
