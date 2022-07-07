public class Puffendui extends Hogwarts {
    public int hardWork;
    public int fidelity;
    public int honesty;

    public Puffendui(String firstName, String surName, String faculty, int hardWork, int fidelity, int honesty) {
        super(firstName, surName, faculty);
        this.hardWork = hardWork;
        this.fidelity = fidelity;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getFidelity() {
        return fidelity;
    }

    public void setFidelity(int fidelity) {
        this.fidelity = fidelity;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
