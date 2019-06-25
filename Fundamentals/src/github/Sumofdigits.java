package github;


public class Sumofdigits {
	public static void main(String args[])
    {
		int m=Integer.parseInt(args[0]);
        int n, sum = 0;
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("Sum of Digits:"+sum);
    }

}
