public class Sandbox {

    public static String sayHello(String name, String greeting) {
        return new String(greeting + ", " +  name + "!");
    }
    public static String sayHello(String name) {
        return sayHello("Hello", name);
    }
    public static String sayHello() {
        return sayHello("Hello", "You");
    }

    public static void main(String[] args) {
        System.out.println(sayHello());
        System.out.println(sayHello("Wrangell"));
        System.out.println(sayHello("Wrangell", "Salutations"));
    }
}


