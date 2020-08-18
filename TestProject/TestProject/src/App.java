public class App {
    public static void main(String[] args) throws Exception {
        Human bob = new Human("Bob", 15);
        bob.introduce();

        Student jake = new Student("Jake", 10, "Biology");
        jake.introduce();

        Human xx = new Student("xavier", 22, "REP");
        xx.introduce();
    }
}
