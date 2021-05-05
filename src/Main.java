import jdk.jfr.StackTrace;

public class Main {

    public static void main(String[] args) {
        // 1. Create an empty stringBuffer
        StringBuffer string = new StringBuffer(200);
        string.append("blessing");
        System.out.println(string);
        string.insert(0, "good ");
        System.out.println(string);
        string.delete(1, 2);
        System.out.println(string);
        string.append(" be with you");
        System.out.println(string);
        int x = string.length();
        System.out.println(x);
        String str = "1234";

        int i = Integer.parseInt(str);
        System.out.println(i);

        int z = 2;
        z += z++ + ++z;
        System.out.println(z++);

    }






    }



























































































