import java.util.*;
interface Stack1 { public void display();
}
class StringStack implements Stack1 { Stack<String> STACK = new Stack<String>();
public void display() {
STACK.push("Java");
STACK.push("Python");
STACK.push("C++");
STACK.push("Angular");
System.out.println("Stack After Pushing Element: " + STACK);
System.out.println("Popped element: " + STACK.pop());
System.out.println("Popped element: " + STACK.pop());
System.out.println("Stack After Popping Elements: " + STACK);
}
}
public class PopPush {
public static void main(String args[]) { StringStack st = new StringStack();
st.display();
}
}