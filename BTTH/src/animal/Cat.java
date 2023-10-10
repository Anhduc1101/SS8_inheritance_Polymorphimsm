package animal;

public class Cat extends Animal {
    //    private String type;
    public Cat(String name) {
        super(name);
    }

    public Cat() {
    }

    @Override
    public String makeSound() {
        return "meo meo" ;
    }
}
