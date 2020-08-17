public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Human bob = new Human("Bob", 15);
        bob.introduce();

        Student jake = new Student("Jake", 10, "Biology");
        jake.introduce();
    }
}
