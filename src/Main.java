public class Main {
    public static void main(String[] args) {
        Hogwarts[] gryffindor = {
                new Hogwarts("Harry", "Potter", "Gryffindor"),
                new Hogwarts("Hermione", "Granger", "Gryffindor"),
                new Hogwarts("Ron ", "Weasley", "Gryffindor")};
        for (int i = 0; i < gryffindor.length; i++) {
            Hogwarts hogwarts = gryffindor[i];
            System.out.println("Имя " + hogwarts.getFirstName() + " Фамилия " + hogwarts.getSurName() + " факультет " + hogwarts.getFaculty());
        }
        System.out.println();
        Hogwarts[] puffendui = {
                new Hogwarts("Zacharias", "Smith", "Puffendui"),
                new Hogwarts("Cedric ", "Diggory", "Puffendui"),
                new Hogwarts("Justin ", "Finch-Fletchley", "Puffendui")};
        for (int i = 0; i < puffendui.length; i++) {
            Hogwarts hogwarts = puffendui[i];
            System.out.println("Имя " + hogwarts.getFirstName() + " Фамилия " + hogwarts.getSurName() + " факультет " + hogwarts.getFaculty());
        }

        System.out.println();
        Hogwarts[] Kogtevran = {
                new Kogtevran("Zhou ", "Chang", "Kogtevran",5,5,5,7),
                new Kogtevran("Padma  ", "Patil ", "Kogtevran",5,5,5,7),
                new Kogtevran("Marcus  ", "Belby", "Kogtevran",7,7,7,7)};
        for (int i = 0; i < Kogtevran.length; i++) {
            Hogwarts Kogtevran = Kogtevran[i];
            System.out.println("Имя " + Kogtevran.getFirstName() +
                    " Фамилия " + Kogtevran.getSurName() +
                    " факультет " + Kogtevran.getFaculty());
        }
    }
}