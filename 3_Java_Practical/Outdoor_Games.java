package Games;
public class Outdoor_Games
{
    String name;
    String name_1;
    String name_2;
    public void Outdoor_Games_di(String name,String name_1,String name_2){
        this.name=name;
        this.name_1=name_1;
        this.name_2=name_2;
    }
    public void Displaying_Outdoor_Name(){
        System.out.println("Outdoor Game Player's Name are : ");
        System.out.println(name);
        System.out.println(name_1);
        System.out.println(name_2);
    }
}
