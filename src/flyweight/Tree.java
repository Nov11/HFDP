package flyweight;

public class Tree {
    int x;
    int y;
    int age;
    void display(){
        System.out.println(x + " " + y + " " + age);
    }

    public Tree(int x, int y, int age){
        this.x = x;
        this.y = y;
        this.age = age;
    }
}
