public class Main {
    public static void main(String[] args) {

        Person mom = new Person.Builder()
                .setName("Name")
                .setSurName("SurName")
                .setAge(21)
                .setCity("City")
                .build();

        Person dad = new Person.Builder()
                .setName("DadName")
                .setSurName("DadSurName")
                .setAge(33)
                .setCity("DadCity")
                .build();

        Person son = mom.newChildBuilder()
                .setName("Novice")
                .setSurName("TEST")
                .build();
        System.out.println();
    }
}
