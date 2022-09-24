public class Person {
    private final String name;
    private final String surName;
    private int age;
    private String city;

    private Person(Builder builder) {
        this.name = builder.name;
        this.surName = builder.surName;
        this.age = builder.age;
        this.city = builder.city;
    }

    public boolean hasAge() {return this.age >= 0;}

    public void happyBirthday() {this.age++;}

    public boolean hasAddress() {return this.city == null;}

    public String getCity() {return city;}

    public void setCity(String city) {this.city = city;}


    public static class Builder {
        // Необходимые параметры
        private String name;
        private String surName;
        // Необязательные параметры
        private int age = -1;
        private String city = null;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSurName(String surName) {
            this.surName = surName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
    public Builder newChildBuilder() {
        var b = new Builder();
        b.setSurName(this.surName);
        b.setCity(this.city);
        b.setAge(0);
        return b;
    }
}
