public class Human {
    // class variables
    private String name = "";
    private int age = 0;

    // Constructor
    public Human() {};
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // getter and setter
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String newName){
        this.name = newName;
    }
    
    public void setAge(int newAge){
        this.age = newAge;
    }

    public void introduce(){
        System.out.printf("Hi! My name is %s and I am %d this year!\n", this.getName(), this.getAge());
    }

}