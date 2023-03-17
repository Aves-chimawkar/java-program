class Sum_of_Rows
{
    public static void main(String args[])
    {
                                               // 2 - D Array 
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
        int sum=0;
        for(int i=0;i<Numbers.length;i++)
        {
            sum=0;  
            for(int j=0;j<Numbers[i].length;j++){
                sum= sum+(Numbers[i][j]);  
            }
            System.out.println("Sum of Row "+i+" : "+sum);
        }
    }
}