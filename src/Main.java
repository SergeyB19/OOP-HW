public class Main {
    public static void main(String[] args) {
        Hogwarts[] people = {
                new Hogwarts("Harry", "Potter", "Gryffindor"),
                new Hogwarts("Hermione", "Granger", "Gryffindor"),
                new Hogwarts("Ron ", "Weasley", "Gryffindor")};
        for (int i = 0; i < people.length; i++) {
            Hogwarts hogwarts = people[i];
            System.out.println("Имя " + hogwarts.getFirstName() + " Фамилия " + hogwarts.getSurName() + " факультет " + hogwarts.getFaculty());
        }

    }
}