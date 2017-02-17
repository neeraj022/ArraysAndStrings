public class Questions
{
	public static void main(String[] args)
	{
		int[] input1=new int[5];
		input1[0]=5;
		input1[1]=7;
		input1[2]=12;
		input1[3]=13;
		input1[4]=18;
		int[] input2=new int[7];
		input2[0]=1;
		input2[1]=3;
		input2[2]=4;
		input2[3]=7;
		input2[4]=9;
		input2[5]=14;
		input2[6]=20;
		int[] mergedArray=mergeSortedArrays(input1, input2);
		for(int i=0;i<mergedArray.length;i++)
		{
			System.out.print(mergedArray[i]+" ");
		}
		System.out.println("");

		System.out.println(reverseTheWordsButNotTheString("I am a boy"));
	}

	public static int[] mergeSortedArrays(int[] input1, int[] input2)
	{
		int i=0;
		int j=0;
		int newCounter=0;
		int[] result=new int[input1.length+input2.length];
		while(i<input1.length && j<input2.length)
		{
			if(input1[i]<=input2[j])
			{
			result[newCounter++]=input1[i++];
			}
			else
			{
			result[newCounter++]=input2[j++];
			}

		}
		if(i==input1.length)
		{
			while(j<input2.length)
			{
				result[newCounter++]=input2[j++];
			}
		}
		else if(j==input2.length)
		{
			while(i<input1.length)
			{
				result[newCounter++]=input1[i++];
			}
		}
		return result;
	}

	public static String reverseTheWordsButNotTheString(String input)
	{
		String finalString="";
		String[] splitArray=input.split(" ");
		for(int i=0; i<splitArray.length;i++)
		{
			finalString=finalString+reverseWord(splitArray[i])+" ";
		}
		return finalString.substring(0,input.length());
	}

	public static String reverseWord(String input)
	{
		if(input.length()<=1)
		{
			return input;
		}
		char[] inputArray=input.toCharArray();
		int i=0;
		int j=inputArray.length-1;
		while(i<=j)
		{
			char temp=inputArray[i];
			inputArray[i]=inputArray[j];
			inputArray[j]=temp;
			i++;
			j--;
		}
		return String.valueOf(inputArray);
	}
}