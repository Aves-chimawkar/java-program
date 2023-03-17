import java.util.Hashtable;
class HashtableDemo{
    public static void main(String args[]){
        Hashtable<String,Integer> marks = new Hashtable<String, Integer>();
        marks.put("Alexa",90);
        marks.put("Henry",60);
        marks.put("Mike",80);
        marks.put("Cane",75);
        marks.put("David",90);
        System.out.println("The Hash table of Marks is : "+marks);
        int mark = marks.get("Alexa");
        System.out.println("The Marks of Alexa : "+mark);
        mark = marks.get("Mike");
        System.out.println("The Marks of Mike : "+mark);
        marks.remove("David");
        System.out.println("After Removing Element,The Hash table of Marks is : "+marks);
    }
}