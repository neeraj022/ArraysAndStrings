public class DistinctSubArray
{
	public String biggestArray(String input)
	{
		int[] indexArray=new int[255];
		for(int i=0;i<255;i++)
		{
			indexArray[i]=-1;
		}
		indexArray[input.charAt(0)]=0;
		int startId=0;
		int previousId=0;
		int currLen=1;
		int maxLen=1;
		for(int i=1;i<input.length();i++)
		{
			previousId=indexArray[input.charAt(i)];
			if(previousId==-1 || i-currLen>previousId)
			{
				currLen++;
			}
			else
			{
				if(currLen>maxLen)
				{
					maxLen=currLen;
					startId=i-maxLen;
				}
				currLen=i-previousId;
			}


			indexArray[(int)input.charAt(i)]=i;
		}

		return input.substring(startId, startId+maxLen);
	}

	public static void main(String[] args)
	{
		DistinctSubArray obj=new DistinctSubArray();
		System.out.println(obj.biggestArray(args[0]));
	}
}