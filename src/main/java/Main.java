public class Main {
    public static void main(String[] args) {

        Person mom = new Person.Builder()
                .setName("Name")
                .setSurName("SurName")
                .setAge(21)
                .setCity("City")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Novice")
                .build();
    }
}
