public class StringNumberPermutation
{
	String[] constant={"","abc", "def","ghi", "jkl","mno", "pqr","stu", "vwx","yz"};
	public void permutate(String s, int i, char[] output)
	{
		if(i==s.length())
		{
			System.out.println(String.valueOf(output));
			return;
		}
		else
		{
			int num=Integer.parseInt(String.valueOf(s.charAt(i)));
			//System.out.println(num);
			for(int j=0;j<constant[num].length();j++)
			{
				output[i]=constant[num].charAt(j);
				permutate(s,i+1,output);
			}
		}
	}

	public static void main(String args[])
	{
		StringNumberPermutation obj=new StringNumberPermutation();
		int maxItems=args[0].length();
		maxItems=maxItems*maxItems*maxItems;
		char[] output=new char[maxItems];
		obj.permutate(args[0],0,output);
	}
}