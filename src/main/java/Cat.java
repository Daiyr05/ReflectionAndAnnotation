public class Cat {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private void meow(){
        System.out.println("Meow!");
    }

    @VeryImportant
    public void eat(){
        System.out.println("Cat is eating");
    }
}
