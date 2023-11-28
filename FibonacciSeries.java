package week1.homeassignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range =10, firstNum=0, secondNum=1, sum,i;
		System.out.println(firstNum);
		for (i=firstNum;i<=range;i++) {
			sum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;
			System.out.println(sum);
		}
	}

}
