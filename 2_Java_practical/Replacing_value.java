class Replacing_value
{
    public static void main(String args[])
    {
        int Number[] = {1,0,3,0,5,0,645,0,17};
        System.out.println("Before Replacing Array is : ");
        for(int i=0 ;i<Number.length;i++)
        {
            System.out.print(Number[i]+" , ");
        }
        for(int i=0;i<Number.length;i++)
        {
            if(Number[i]==0)
            {
                Number[i]= -1;
            }
        }
        System.out.println("\nAfter Replacing, The Array is : ");
        for(int i=0 ;i<Number.length;i++)
        {
            System.out.print(Number[i]+" , ");
        }
    }
}