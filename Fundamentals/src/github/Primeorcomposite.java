package github;

public class Primeorcomposite {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int i,c=0;
if(args.length==0) {
	System.out.print("please enter integer number");
}
else {
	for(i=1;i<=n;i++)
	{
		if(n%i==0)
			c++;
	}
	
}
if(c==2)
	System.out.print(n+"prime number");
else if(c==n)
	System.out.print(n+" is neither prime nor composite number");
else if(c==1)
	System.out.print(n+" is neither prime nor composite number");
else
	System.out.print(n+" is not a prime number");

	}

}
