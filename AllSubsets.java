import java.util.*;
public class AllSubsets
{
	public ArrayList<ArrayList<Integer>> getAllSubsets(ArrayList<Integer> input)
	{
		//since every element in the subset will have a choice of yes/no
		//so there would be 2 to power n subsets
		int max=1<<input.size();
		ArrayList<ArrayList<Integer>> allSubsets=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<max;i++)
		{
			ArrayList<Integer> newSubset=new ArrayList<Integer>();
			int k=i;
			int counter=0;
			while(k>0)
			{
				if((k&1)!=0)
				{
					//include this element in the set
					newSubset.add(input.get(counter));
				}
				counter++;
				k>>=1;
			}
			allSubsets.add(newSubset);
		}
		return allSubsets;
	}
	
	public static void main(String[] args)
	{
		AllSubsets object=new AllSubsets();
		ArrayList<Integer> input=new ArrayList<Integer>();
		input.add(new Integer(0));
		input.add(new Integer(5));
		input.add(new Integer(6));
		input.add(new Integer(8));
		input.add(new Integer(12));
		ArrayList<ArrayList<Integer>> result=object.getAllSubsets(input);
		for(int i=0; i<result.size();i++)
		{
			for(int j=0;j<result.get(i).size();j++)
			{
				System.out.print(result.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}


}