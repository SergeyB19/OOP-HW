public class HufflepuffStudent extends HogwartsStudent {
    private static int diligence;
    private static int loyality;
    private static int honesty;

    public HufflepuffStudent(String name, int magic, int transgression, int diligence) {
        super(name, magic, transgression);
        this.diligence = diligence;
        this.loyality = loyality;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyality() {
        return loyality;
    }

    public void setLoyality(int loyality) {
        this.loyality = loyality;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public static int ability() {
        return diligence + loyality + honesty;
    }
    public void HufflepuffStudent(HufflepuffStudent hufflepuffStudent) {
        int ability1 = ability();
        int ability2 = HufflepuffStudent.ability();
        if (ability1 > ability2) {
            System.out.println("Когтевранец %s лучше, чем когтевранец %s: %d VS %d%n", getName(),hufflepuffStudent.getName(),ability1,ability2);
        } else if (ability2>ability1) {
            System.out.println("Когтевранец %s лучше, чем когтевранец %s: %d VS %d%n", hufflepuffStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.println("Когтевранец %s такой же, как когтевранец %s: %d VS %d%n", hufflepuffStudent.getName(), ability1, ability2);
        }
    }

}