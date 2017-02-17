public class StringTest
{
	public static void main(String args[])
	{
		int[][] input=new int[3][3];
		int counter=1;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				input[i][j]=counter;
				counter++;
			}
		}
		rotateBy90(input);
		//System.out.println(replaceSpaces(args[0].toCharArray()));
		//System.out.println(checkForAnagrams(args[0], args[1]));
		//removeDuplicates(args[0]);
	}

	public static void removeDuplicates(String input)
	{
		char[] inputChar=input.toCharArray();
		boolean duplicate=false;
		int tail=0;
		for (int i=0;i<inputChar.length;i++)
		{
			char ichar=inputChar[i];
			for(int j=0;j<i;j++)
			{
				if(ichar==inputChar[j])
				{
					duplicate=true;
				}
			}
			if (!duplicate)
			{
				inputChar[tail]=inputChar[i];
				tail++;
			}
			duplicate=false;

		}
		System.out.println(inputChar);
		System.out.println(tail);
	}

	public static boolean checkForAnagrams(String input1, String input2)
	{
		int[] input1Array=new int[256];
		int[] input2Array=new int[256];
		for (int i=0;i<input1.length();i++)
		{
			input1Array[input1.charAt(i)]++;
		}
		for (int i=0;i<input2.length();i++)
		{
			input2Array[input2.charAt(i)]++;
		}
		for(int i=0;i<input1Array.length;i++)
		{
			if(input1Array[i]!=input2Array[i])
			{
				return false;
			}
		}
		return true;
	}

	public static char[] replaceSpaces(char[] input)
	{
		//replace all spaces with %20

		//Count all spaces
		int spaces=0;
		for (int i=0;i<input.length;i++)
		{
			if(input[i]==' ')
			{
				spaces++;
			}
		}
		//increase the size of input char array by number of spaces
		int newSize=input.length+spaces*2;
		char[] newInput=new char[newSize];
		for(int i=input.length-1; i>=0;i--)
		{
			if(input[i]==' ')
			{
				//insert %20
				newInput[newSize-1]='0';
				newInput[newSize-2]='2';
				newInput[newSize-3]='%';
				newSize=newSize-3;
			}
			else
			{
				newInput[newSize-1]=input[i];
				newSize=newSize-1;
			}
		}
		return newInput;
	}

	public static int[][] rotateBy90(int[][] input)
	{
		int n=input.length;
		for(int layer=0;layer<n/2;layer++)
		{
			for(int j=layer;j<n-1-layer;j++)
			{
				//save the top
				int top=input[layer][j];
				int right=input[layer][n-1-j];
				int bottom=input[n-1-layer][n-1-j];
				int left=input[n-1-j][layer];
				System.out.println(" top: "+top);
				System.out.println(" right: "+right);
				System.out.println(" bottom: "+bottom);
				System.out.println(" left: "+left);
			}
		}
		return input;
	}
}