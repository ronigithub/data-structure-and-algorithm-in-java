package Others;

public class CoreJava {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello"); // create new objects in heap memory even the content same

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s3)); // true // equal method checking the value

        Object obj1 = new Object();
        Object obj2 = obj1;

        Object obj3 = new Object();

        System.out.println(obj1 == obj2); // true // same reference
        System.out.println(obj1 == obj3); // false // different reference
    }
}
