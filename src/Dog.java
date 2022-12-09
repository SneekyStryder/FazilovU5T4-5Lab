public class Dog {

    private String name;
    private int age;
    private boolean sleeping;

    public Dog(String dogName, int dogAge) {
        name = dogName;
        age = dogAge;
        sleeping = false; // default value
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public boolean isSleeping() {  // naming convention for a boolean:
        // start getter with is rather than get
        return sleeping;
    }

    public void setSleeping(boolean newValue) {
        sleeping = newValue;
    }

    public String dogInfo() {
        return "name = " + name + ", age = " + age + ", sleeping = " + sleeping;
    }
}

