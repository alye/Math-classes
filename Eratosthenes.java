import java.util.Scanner;


public class Eratosthenes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Enter upper value: \n");
		Scanner s=new Scanner(System.in);
		int value=s.nextInt();
		int [] answer = generate(value);
		
		System.out.println("The prime numbers between 2 and "+value+" are: \n");
		for(int i=0;i<answer.length;i++){
			System.out.print(answer[i]+"\t");
		}

	}

private static int [] generate(int n)
{
	short p=2;
	int count = 0;
	int[] list = new int[n-1];
	for(int i=2;i<=n;i++)				//populating the array
	{
		list[i-2]=i;
	}
	
	while(p*p <=n){
		for(int d=p*p;d<=n;d+=p){
			list[d-2]=0;
		}
		while(++p==0){}
		}
	for(int i=2;i<=n;i++)				// counting the no of prime numbers left back
	{
		if (list[i-2]!=0){
				count++;}
	}
	
	int [] ans = new int[count];		//creating an array to hold prime numbers
	
	for(int i=2, d=0;i<=n;i++)				//populating the answer array
	{
		if (list[i-2]!=0){
			ans[d]=list[i-2];
			d++;}
	}
	
	return ans;
		
}


}
