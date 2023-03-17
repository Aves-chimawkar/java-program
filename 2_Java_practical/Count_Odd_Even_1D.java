class Count_Odd_Even_1D
{
    public static void main(String args[])
    {
        int s[] = {1,2,3,5,34,45,42,89,43,4,6};  // 1-D Array.
        int Even_count = 0;
        int Odd_count = 0;
        int Even_count_2D = 0;
        int Odd_count_2D = 0;
        for(int i=0;i<s.length;i++){
            if(s[i]%2==0){
                Even_count+=1;
            }
            else
            {
                Odd_count+=1;
            }
        }
        System.out.println("1 D Array is : ");
        for(int i =0;i<s.length;i++){
            
              System.out.print(s[i]+" ");
        }
        System.out.println("\nEven Number's in 1D Array is : "+Even_count);
        System.out.println("Odd Number's in 1D Array is : "+Odd_count);
        System.out.println("-------------------------------------------");
                
                                                                      // 2-D Array
        int [][] nums =new int[2][2];
        nums[0][0] = 10;
        nums[0][1] = 17;
        nums[1][0] = 21;
        nums[1][1] = 32;
        for(int i=0;i<nums.length;i++){        
            for(int j=0;j<nums[i].length;j++){
                    if(nums[i][j]%2==0){
                                Even_count_2D+=1;
                        }
                    else
                        {
                                Odd_count_2D+=1;
                        }
                }
        }
        System.out.println("2 D Array is : ");
        for(int i =0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
               System.out.print(nums[i][j]+" ");
            }
        }
        System.out.println("\nOdd Number's in 2-D Array is : "+Odd_count_2D);
        System.out.println("Even Number's in 2-D Array is : "+Even_count_2D);
    }
}
