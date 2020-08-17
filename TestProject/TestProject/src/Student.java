public class Student extends Human {
    private String course = "";

    public Student(){
        super();
    };

    public Student(String name, int age){
        super(name, age);
    }
    public Student(String name, int age, String course){
        super(name, age);
        this.course = course;
    }

    public String getCourse(){
        return this.course;
    }

    public void introduce() {
        System.out.printf("Hello, I am %s, %d and I study %s\n", this.getName(), this.getAge(), this.getCourse());
    }



}