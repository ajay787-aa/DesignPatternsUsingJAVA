public class Dog {
    private String name;
    private double amount;
    private String age;
    private String breed;

    public String getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    private Dog(DogBuilder builder){
        this.age=builder.getAge();
        this.name=builder.getName();
        this.breed=builder.getBreed();
        this.amount=builder.getAmount();

    }

    //we have to make this static since we cannot initialize dog class first.
    public static class DogBuilder{
        private String name;
        private double amount;
        private String age;
        private String breed;

        public String getName() {
            return name;
        }

        public double getAmount() {
            return amount;
        }

        public String getAge() {
            return age;
        }

        public String getBreed() {
            return breed;
        }

        public DogBuilder setName(String name){
            this.name=name;
            return this;
        }
        public DogBuilder setAge(String age){
            this.age=age;
            return this;
        }

        public DogBuilder setBreed(String breed){
            this.breed=breed;
            return this;
        }

        public Dog Builder(){
            return new Dog(this);
        }


    }

}
