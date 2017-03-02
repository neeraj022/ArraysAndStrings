import java.util.*;
public class GreatestNextElement
{

	public int[] returnGreNextElement(int[] input)
	{
		Stack<Integer> myStack=new Stack<Integer>();
		myStack.push(0);
		//int currIndex=0;
		int[] result=new int[input.length];
		int popIndex=0;
		for(int i=1;i<input.length;i++)
		{
			popIndex=myStack.pop();
			while(!myStack.isEmpty() && input[i]>input[popIndex])
			{
				result[popIndex]=input[i];
				popIndex=myStack.pop();
			}
			if(input[i]>input[popIndex])
			{
				result[popIndex]=input[i];
			}
			else
			{
				myStack.push(popIndex);
			}
			myStack.push(i);
		}

		while(!myStack.isEmpty())
			{
				
				popIndex=myStack.pop();
				result[popIndex]=-1;
			}

			return result;
	}

	public static void main(String args[])
	{
		GreatestNextElement obj=new GreatestNextElement();
		int[] input={1,4,5,2,25,26};
		int[] result=obj.returnGreNextElement(input);
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+" ");
		}
	}

}