public class ParenthesisPermutation
{
	public void printPar(int l, int r, char[] input, int counter)
	{
		//System.out.println(l+" "+r+" "+counter);
		if(l<0 || r<0)
		{
			//invalid string
			return;
		}
		else if(l==0 && r==0)
		{
			//print the string
			System.out.println(String.valueOf(input));
			return;
		}
		else
		{
			if(l>0)
			{
				input[counter]='(';
				printPar(l-1, r, input, counter+1);
			}
			if(r>0)
			{
				if(checkValid(input, counter))
				{
				//System.out.print(input);
				//System.out.println(" "+counter);
				input[counter]=')';
				printPar(l,r-1, input, counter+1);
				}
			}
		}
	}

	public boolean checkValid(char[] input, int counter)
	{
		int count=0;
		for(int i=0;i<counter;i++)
		{
			if(input[i]=='(')
			{
				count++;
			}
			else if(input[i]==')')
			{
				count--;
			}
		}
		return count>0? true: false;
	}


	public static void main(String args[])
	{
		System.out.println("compare to : "+("hero".compareTo("hero")));
		ParenthesisPermutation obj=new ParenthesisPermutation();
		int n=Integer.parseInt(args[0]);
		char[] input=new char[2*n];
		obj.printPar(n,n, input, 0);
	}
}