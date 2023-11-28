/*Requirements: 
- Declare An array for {3,2,11,4,6,7}; 
- Declare another array for {1,2,8,4,9,7};
- Declare for loop iterator from 0 to array length
- Declare a nested for another array from 0 to array length 
- Compare both the arrays using a conditional statement.
- Print the value from first array when there is a match */

package week2.day2.homeassignment;

public class ArayCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring two arrays
		int a[]={3,2,11,4,6,7};
		int b[]={1,2,8,4,9,7};
		
		// initialing for iteration
		int i,j;
		for(i=0;i<a.length;i++) {
			for (j = 0; j < b.length; j++) {
				if(a[i]==b[j])
				{
					System.out.println( "Compaing the given two array values and printing the matching array--" +b[j]);
				}

			}
		}

	}

}
