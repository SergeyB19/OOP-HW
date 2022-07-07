public class Kogtevran extends Hogwarts {
    public int mind;
    public int wisdom;
    public int wit;
    public int creation;

    public Kogtevran(String firstName, String surName, String faculty, int mind, int wisdom, int wit, int creation) {
        super(firstName, surName, faculty);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }


    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }
}
