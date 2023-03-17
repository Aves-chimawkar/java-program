interface Stack {
  void push(String value);
  void pop();
}

class StringStack implements Stack {
  String elements[] = new String[5];
  int index = 0;

  public void push(String value) {
    if (index < 5) {
      elements[index] = value;
      index++;
    }
  }

  public void pop() {
      index--;
      System.out.println("Popped: " + elements[index]);
      elements[index]="";

  }
  public void display(){
      for(int i=0;i<elements.length;i++){

       System.out.println(elements[i] );
    }
  }
}

class Stack_str {
  public static void main(String args[]) {
    StringStack stack = new StringStack();
    System.out.println("Array Before Popping Strings :");
    stack.push("Apple");
    stack.push("Banana");
    stack.push("Grapes");
    stack.push("Pineapple");
    stack.push("Watermelon");
    stack.display();
    System.out.println("-----------------------");
    System.out.println("Popped Strings are :");
    stack.pop();
    stack.pop();
    stack.pop();
    System.out.println("-----------------------");
    System.out.println("Array After Popping Strings are :");
    stack.display();
  }
}