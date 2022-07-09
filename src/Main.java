import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();


    public static void main(String[] args) {
        GryffindorStudent harry = generateGryffindorStudent("Гарри Поттер");
        GryffindorStudent ron = generateGryffindorStudent("Рон Уизли");
        RawenclawStudent luna = generateRawenclawStudent("Полумна Лавгуд");
        SlytherinStudent draco = generateSlytherinStudent("Драко Малфой");
        SlytherinStudent cedric = generateSlytherinStudent("Седрик Диггори");

        harry.print();
        ron.print();
        luna.print();
        draco.print();
        cedric.print();

        harry.compareHogwarts(draco);
        harry.compareGryffindor(ron);
}


    private static GryffindorStudent generateGryffindorStudent(String name) {
        return new GryffindorStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

private static RawenclawStudent generateRawenclawStudent(String name) {
        return new RawenclawStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
private static HufflepuffStudent generateHufflepuffStudent(String name) {
        return new HufflepuffStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
private static SlytherinStudent generateSlytherinStudent(String name) {
        return new SlytherinStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    }