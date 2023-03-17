interface StringDemo {
    void check(String s1, String s2);
}
class StringCheck implements StringDemo {
    public void check(String s1, String s2) {
        if (s1==s2) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
    }
}
public class Str_Equal_not { 
    public static void main(String args[]) {
        StringDemo stringCheck = new StringCheck();
        System.out.println("Strings are: hello , world ");
        stringCheck.check("hello", "world");
        System.out.println("----------------------------");
        System.out.println("Strings are: hello , hello ");
        stringCheck.check("hello", "hello");
    }
}
