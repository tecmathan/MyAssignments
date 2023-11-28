package week1.homeassignment;

public class CheckPrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n =12;
		boolean flag = false;
		for (i=2;i<n/2;i++)
		{
			if(n%i==0) {

				flag = true;
			}
		}
		if (flag==true){
			System.out.println("not prime");
		}
		else
		{
			System.out.println("Prime");

		}

	}
}
