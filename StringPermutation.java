import java.util.*;
public class StringPermutation
{
	public ArrayList<String> getPerm(String input)
	{
		ArrayList<String> newWords=new ArrayList<String>();
		if(input==null)
		{
			return null;
		}
		else if(input.length()==0)
		{
			newWords.add("");
			return newWords;
		}
		char first=input.charAt(0);
		String remaining=input.substring(1);
		ArrayList<String> otherWords=this.getPerm(remaining);
		for (String word: otherWords)
		{
			for(int i=0;i<=word.length();i++)
			{
			String rotated=rotate(first, word,i);
			newWords.add(rotated);
			}
		}
		return newWords;
	} 

	public String rotate(char first, String word, int i)
	{
		String initial=word.substring(0,i);
		String back=word.substring(i);
		return initial+String.valueOf(first)+back;
	}

	public static void main(String args[])
	{
		StringPermutation obj=new StringPermutation();
		ArrayList<String> arrayList=obj.getPerm(args[0]);
		System.out.println(arrayList.size());
		for (String word: arrayList)
		{
			System.out.println(word);
		}

	}
}