public class Sandbox {

    public static String modifyString(String param) {
        param = "HAHAHAHAH";
        return param;
    }

    public static void addTwo(int num) {
        num = num + 2;
    }
    public static void main(String[] args) {
        String name = "codeup";
        System.out.println(name);
        name = modifyString(name);
        System.out.println(name);
        int seven = 7;
        System.out.println(seven);
        addTwo(seven);
        System.out.println(seven);
    }
}


