public class DogRunner {
    public static void main(String[] args) {

        Dog myDog = new Dog("Toby", 10);
        System.out.println(myDog.dogInfo());
        System.out.println(myDog.getName());
        System.out.println(myDog.getAge());
        System.out.println(myDog.isSleeping());

        myDog.setName("Tobias");
        myDog.setAge(11);
        myDog.setSleeping(true);
        System.out.println(myDog.dogInfo());
    }
}
