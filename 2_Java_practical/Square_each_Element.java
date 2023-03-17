class Square_each_Element
{
    public static void main(String args[])
    {
      
        int Numberss[]= {1,2,3,4,5};
        System.out.print("1 D Array is : ");
        for(int i =0;i<Numberss.length;i++){
                           System.out.print(Numberss[i]+" ");  }
        System.out.print("\nSquare of Each Element:\n ");
        for(int i=0;i<Numberss.length;i++)
        { System.out.println((Numberss[i]*Numberss[i])); }
        int [][] Numbers = new int[3][3];
        Numbers[0][0]= 1;
        Numbers[0][1]= 10;
        Numbers[0][2]= 20;
        Numbers[1][0]= 2;
        Numbers[1][1]= 30;
        Numbers[1][2]= 40;
        Numbers[2][0]= 3;
        Numbers[2][1]= 60;
        Numbers[2][2]= 90;
        System.out.print("2 D Array is : ");
        for(int i =0;i<Numbers.length;i++){
              for(int j=0;j<Numbers[i].length;j++){
                           System.out.print(Numbers[i][j]+" ");
                         }
               }
        System.out.print("\nSquare of Each Element:\n ");
        for(int i=0;i<Numbers.length;i++)
        { for(int j=0;j<Numbers[i].length;j++){
                    System.out.println((Numbers[i][j]*Numbers[i][j]));
            } }
    }
}