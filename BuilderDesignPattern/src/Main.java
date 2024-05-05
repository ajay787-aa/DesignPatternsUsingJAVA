public class Main {
    public static void main(String[] args) {
        //this pattern is mostly used when some fields of our class are final example
        //breed, gender,also this makes our code forward compatible

        Dog client1=new Dog.DogBuilder().setAge("22").setBreed("lab").setName("ajay").Builder();
        /*client1.setAge*/ //we cannot because of builder pattern
        client1.getAge(); //we can only read
    }
}