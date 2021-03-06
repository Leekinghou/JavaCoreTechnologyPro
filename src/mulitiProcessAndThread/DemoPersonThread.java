package mulitiProcessAndThread;

public class DemoPersonThread {
    public static void main(String[] args) {


        Person p1 = new Person("小强");
        p1.setName("小民");
        p1.run();
        System.out.println(0/0);
        Person p2 = new Person("小富");
        p2.run();
    }
}
