public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Harry", "Potter", "Gryffindor",5,7,8),
                new Gryffindor("Hermione", "Granger", "Gryffindor",10,10,10),
                new Gryffindor("Ron ", "Weasley", "Gryffindor",3,2,2)};
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Имя " + gryffindor.getFirstName() + " Фамилия " + gryffindor.getSurName() + " факультет " + gryffindor.getFaculty());
        }
        System.out.println();
        Puffendui[] puffenduii = {
                new Puffendui("Zacharias", "Smith", "Puffendui",5,4,7),
                new Puffendui("Cedric ", "Diggory", "Puffendui",7,7,7),
                new Puffendui("Justin ", "Finch-Fletchley", "Puffendui",9,10,3)};
        for (int i = 0; i < puffenduii.length; i++) {
            Puffendui puffendui = puffenduii[i];
            System.out.println("Имя " + puffendui.getFirstName() + " Фамилия " + puffendui.getSurName() + " факультет " + puffendui.getFaculty());
        }

        System.out.println();
        Kogtevran[] kogtevrans = {
                new Kogtevran("Zhou ", "Chang", "Kogtevran",5,5,5,7),
                new Kogtevran("Padma  ", "Patil ", "Kogtevran",5,5,5,7),
                new Kogtevran("Marcus  ", "Belby", "Kogtevran",7,7,7,7)};
        for (int i = 0; i < kogtevrans.length; i++) {
            Kogtevran kogtevran = kogtevrans[i];
            System.out.println("Имя " + kogtevran.getFirstName() +
                    " Фамилия " + kogtevran.getSurName() +
                    " факультет " + kogtevran.getFaculty());

        }
        System.out.println();
        print(gryffindors);
    }
    public static void print(Gryffindor[] gryffindors) {
        for (int i = 0; i <gryffindors.length ; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Имя " + gryffindor.getFirstName()+ " Фамилия " + gryffindor.getSurName()+ " Благородство " + gryffindor.getHonour()+ " Честь " + gryffindor.getNobility()+ " Храборость " + gryffindor.getBravery());
        }

    }

}