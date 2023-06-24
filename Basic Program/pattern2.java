public class pattern2 {
    public static void main(String[] args)
    {
        int c=1;
        for(int i=1;i<6;i++)
        {
            for(int j=1;j<i;j++)
            {
                if(j%2!=0)
                {
                    System.out.print("  "+c+"  ");
                    ++c;
                }
                else
                {
                    System.out.print("  "+c+"  ");
                    --c;
                }
            }
            System.out.println();
        }
    }
    
}