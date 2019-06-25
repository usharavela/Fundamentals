package github;

public class Gender {
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[1]);
		if((args[0]).equals("male")) {
			if(n>1 && n<58)
				System.out.print("the percentage of interest is 9.2%.");
			if(n>58 && n<100)
				System.out.print("the percentage of interest is 10.5%.");
			}
		if((args[0]).equals("female")) {
			if(n>1 && n<58)
				System.out.print("the percentage of interest is 8.2%.");
			if(n>58 && n<100)
				System.out.print("the percentage of interest is 9.2%.");
	}

}
}