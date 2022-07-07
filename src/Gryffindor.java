public class Gryffindor extends Hogwarts {
    public String nobility;
    public String honour;
    public int bravery;

    public Gryffindor(String firstName, String surName, String faculty, String nobility, String honour, int bravery) {
        super(firstName, surName, faculty);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public String getNobility() {
        return nobility;
    }

    public void setNobility(String nobility) {
        this.nobility = nobility;
    }

    public String getHonour() {
        return honour;
    }

    public void setHonour(String honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}
