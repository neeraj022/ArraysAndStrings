public class Sorting
{
	public static void main(String args[])
	{
		Sorting sorting=new Sorting();
		int[] input=new int[6];
		input[0]=9;
		input[1]=1;
		input[2]=3;
		input[3]=2;
		input[4]=7;
		input[5]=5;
		//sorting.bubbleSort(input);
		//sorting.insertionSort(input);
		//sorting.selectionSort(input);
		//int[] result=sorting.mergeSort(input);
		int[] result=sorting.quickSort(input);
		sorting.printArray(result);
	}

	public void bubbleSort(int[] input)
	{
		for(int j=0; j<input.length-1; j++)
		{
		for(int i=1; i<input.length;i++)
		{
			if(input[i]<input[i-1])
			{
				int temp=input[i];
				input[i]=input[i-1];
				input[i-1]=temp;
			}
		}
	}
	}

	public void selectionSort(int[] input)
	{
		for(int i=0;i<input.length-1;i++)
		{
			int min=input[i+1];
			int minIndex=i+1;
			for(int j=i+1; j<input.length;j++)
			{
				if(input[j]<min)
				{
					min=input[j];
					minIndex=j;
				}
			}
			if(min<input[i])
			{
				//swap these elements
				int temp=input[i];
				input[i]=input[minIndex];
				input[minIndex]=temp;
			}
		}
	}

	public void insertionSort(int[] input)
	{
		for(int i=0;i<input.length-1;i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(input[j]<input[j-1])
				{
					//swap elements
					int temp=input[j];
					input[j]=input[j-1];
					input[j-1]=temp;
				}
				else break;
			}
		}
	}

	public int[] quickSort(int[] input)
	{
		int inputlength=input.length;
		if(inputlength<=1)
		{
			return input;
		}
		int pivot=input[inputlength-1];
		// for(int d=0;d<inputlength;d++)
		// {
		// 	System.out.print(input[d]+" ");
		// }
		//System.out.println();
		//System.out.println("pivot for above array is: "+pivot);
		int i=0;
		int j=inputlength-2;
		while(i!=j)
		{
			if(input[i]<pivot)
			{
				i++;
			}
			else if(input[j]>pivot)
			{
				j--;
			}
			else if(input[i]>pivot && input[j]<pivot)
			{
				//exchange both
				int temp=input[i];
				input[i]=input[j];
				input[j]=temp;
			}
		}
				int temp=input[i];
				input[i]=pivot;
				input[inputlength-1]=temp;
				int[] array1=new int[i+1];
				int[] array2=new int[inputlength-i-1];
				//System.out.println("i is: "+i);
		for(int x=0;x<inputlength;x++)
		{
			if(x<=i)
			{
				array1[x]=input[x];
			}
			else
			{
				array2[x-i-1]=input[x];
			}
		}
		// for(int d=0;d<array1.length;d++)
		// {
		// 	System.out.print(array1[d]+" ");
		// }
		// System.out.println();
		// for(int d=0;d<array2.length;d++)
		// {
		// 	System.out.print(array2[d]+" ");
		// }
		// System.out.println();
		//sizes will be different
		array1=quickSort(array1);
		array2=quickSort(array2);
		return merge(array1, array2);
	}

	public int[] mergeSort(int[] input)
	{
		int n=input.length;
		if(n==1)
		{
			return input;
		}

		int[] array1=new int[n/2];
		int[] array2=new int[n/2];
		if(!(n%2==0))
		{
			array2=new int[(n/2)+1];
		}
		for(int i=0; i<n;i++)
		{
			if(i<n/2)
			{
				//insert into array1
				array1[i]=input[i];
			}
			else
			{
				array2[i-n/2]=input[i];
			}
		}
		array1=mergeSort(array1);
		array2=mergeSort(array2);
		return merge(array1, array2);
	}

	public int[] merge(int[] input1, int[] input2)
	{
		int input1length=input1.length;
		int input2length=input2.length;
		int[] result=new int[input1length+input2length];
		int resultCounter=0;
		int i=0;
		int j=0;
		while(i<input1length && j<input2length)
		{
			if(input1[i]<input2[j])
			{
				result[resultCounter++]=input1[i++];
			}
			else
			{
				result[resultCounter++]=input2[j++];
			}
		}
		if(i==input1length)
		{
			//copy array 2 into result
			while(j<input2length)
			{
				result[resultCounter++]=input2[j++];
			}
		}
		else if(j==input2length)
		{
			//copy array 1 into result
			while(i<input1length)
			{
				result[resultCounter++]=input1[i++];
			}
		}

		return result;

	}

	public void printArray(int[] input)
	{
		for(int i=0; i<input.length;i++)
		{
			System.out.print(input[i]+" ");
		}
		System.out.println();
	}
}