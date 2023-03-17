class Positive_Negative_num
{
    public static void main(String args[]){
   
        int Numbers[]= {1,-1,2,-2,3,4,-3,5};
        int Negative_count=0;
        int Negative_count_2D=0;
        int Positive_count=0;
        int Positive_count_2D=0;

        for(int i=0;i<Numbers.length;i++)
        {
            if(Numbers[i]>=0){
             Positive_count+=1;
            }
            else
            {
                Negative_count+=1;
            }
        }
        System.out.println("1 D Array is : ");
        for(int i =0;i<Numbers.length;i++){
            
              System.out.print(Numbers[i]+" ");
        }
        System.out.println("\nNegative Number's in 1D Array is : "+Negative_count);
        System.out.println("Positive Number's in 1D Array is : "+Positive_count);
        System.out.println("-------------------------------------------");

        //                                                  2 D array
        int [][] nums =new int[2][2];
        nums[0][0] = -10;
        nums[0][1] = 17;
        nums[1][0] = 21;
        nums[1][1] = 32;
        for(int i=0;i<nums.length;i++){        
            for(int j=0;j<nums[i].length;j++){
                            if(nums[i][j]>=0){
                                Positive_count_2D+=1;
                            }
                            else
                            {
                                Negative_count_2D+=1;
                            }
            }
        }
        System.out.println("2 D Array is : ");
        for(int i =0;i<nums.length;i++){
              for(int j=0;j<nums[i].length;j++){
                           System.out.print(nums[i][j]+" ");
                         }
               }
        System.out.println("\nNegative Number's in 2-D Array is : "+Positive_count_2D);
        System.out.println("Positive Number's in 2-D Array is : "+Negative_count_2D);

    }
}