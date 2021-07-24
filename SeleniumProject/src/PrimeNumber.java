public class PrimeNumber {

    public static void main(String[] args)
    {
        int n=15;

        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.println("It is a prime number");
            }
            else
                System.out.println("Not a prime number");
            break;


        }

    }
}
