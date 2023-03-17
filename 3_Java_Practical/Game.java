import Games.*;
class Game{
    public static void main(String args[]) {
        Games.Indoor_Games pni = new Games.Indoor_Games();
        pni.Indoor_Games_di("Christen","Mikel","Huzaifa ");
        pni.Displaying_Indoor_Name();
        System.out.println("---------------------------");
        Games.Outdoor_Games pno = new Games.Outdoor_Games();
        pno.Outdoor_Games_di("Huzaifa","Messi","Ronaldo");
        pno.Displaying_Outdoor_Name(); 
    }
}