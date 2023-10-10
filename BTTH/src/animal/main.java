package animal;





public class main {
    public static void main(String[] args) {
    Animal animal1=new Animal("pig");
    Dog dog1=new Dog("Chihuahua","Nâu");
    Dog dog2=new Dog("Chiba","Trắng");
    Cat cat=new Cat("Mun");
        System.out.println("Loại động vật mới được tạo là: "+animal1.getName());
        animal1.setName("Heo");
        System.out.println("Loại động vật mới được tạo, sau khi đổi tên là: "+animal1.getName());
        dog1.setName("Cỏ");
        System.out.println("Name: "+dog1.getName());
        System.out.println("Sound: "+dog1.makeSound());
        System.out.println("Color: "+dog1.getColor());
        cat.setName("Milu");
        System.out.println("Cat's Name: "+cat.getName());
        System.out.println("Cat's Sound: "+cat.makeSound());

    }


}
