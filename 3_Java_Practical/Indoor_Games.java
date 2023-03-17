package Games;
public class Indoor_Games
{
    String name;
    String name_1;
    String name_2;
    public void Indoor_Games_di(String name,String name_1,String name_2)
    {
        this.name=name;
        this.name_1=name_1;
        this.name_2=name_2;
    }
    public void Displaying_Indoor_Name(){
        System.out.println("Indoor Game Player's Name are : ");
        System.out.println(name);
        System.out.println(name_1);
        System.out.println(name_2);
    }
}

