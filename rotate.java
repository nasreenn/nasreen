import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n=7,k=3,a[]={1,2,3,4,5,6,7},j=1,temp;
		while(j<=k)
		{
		temp=a[n-1];	
		for(int i=n-1;i>0;i--)
		{
			a[i]=a[i-1];			
		}
		a[0]=temp;
		j++;
		}
		for(j=0;j<n;j++)
	    System.out.print(a[j]);
		s.close();
		

	}

}

    
