package week2.day2.homeassignment;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "changeme";
		char arr[] = text.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if(i%2!=0) 
			{
				System.out.println(Character.toUpperCase(arr[i]));
			}
			else
				System.out.println((arr[i]));
		}
	}

}
