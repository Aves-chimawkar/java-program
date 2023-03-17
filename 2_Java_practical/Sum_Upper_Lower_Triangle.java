class Sum_Upper_Lower_Triangle
{
    public static void main(String args[])
    {                                    // 2 - D Array 
        int [][] Numbers = new int[3][3];
        Numbers[0][0]= 1;
        Numbers[0][1]=2;
        Numbers[0][2]= 3;
        Numbers[1][0]= 4;
        Numbers[1][1]= 5;
        Numbers[1][2]= 6;
        Numbers[2][0]= 7;
        Numbers[2][1]= 8;
        Numbers[2][2]= 9;
        System.out.println("The Given Matrix is : ");
        for(int i=0;i<=2;i++){
             for(int j=0;j<=2;j++){
                System.out.print("\t");
                System.out.print(Numbers[i][j]);
                System.out.print("  ");
            }
            System.out.println(" ");}
        System.out.println("-------------------------------------");
        int U_Left_sum=0;
        int n= Numbers.length;
        int U_Count = n-1;
        for(int i=0;i<n;i++){ 
            for(int j=0;j<=U_Count;j++){
                U_Left_sum= U_Left_sum+Numbers[i][j];  
            }
            U_Count--;
        }
        System.out.println("Sum of Upper Left Triangle  : "+U_Left_sum);
        int L_Left_sum=0;
        for(int i=0;i<Numbers.length;i++)
        {
            for(int j=0;j<=i;j++){
                L_Left_sum= L_Left_sum+(Numbers[i][j]);  
            }
        }
        System.out.println("Sum of lower Left Triangle  : "+L_Left_sum);
        System.out.println("-------------------------------------");
        int U_Right_sum=0;
        for(int i=2;i>=0;i--)
        {
            for(int j=2;j>=i ;j--){
                U_Right_sum= U_Right_sum+(Numbers[i][j]);  
            }
        }
        System.out.println("Sum of Upper Right Triangle  : "+U_Right_sum);
        int Count=0;
        int L_Right_sum=0;
        for(int i=2;i>=0;i--)
        {
            for(int j=2;j>=Count;j--){
                L_Right_sum= L_Right_sum+(Numbers[i][j]);  
            }
            Count++;}
        System.out.println("Sum of Lower Right Triangle  : "+L_Right_sum);
    }
}