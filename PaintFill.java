public class PaintFill
{
	public void fill(int[][] input, int i, int j, int colorToBeFilled, int oldColor)
	{
		int xlength=input.length-1;
		int ylength=input[0].length;
		if(i<0 || j<0 || i>xlength || j> ylength-1)
		{
			//point is out of boundary
			return;
		}
		if(input[i][j]==oldColor)
		{
			input[i][j]=colorToBeFilled;

			//check for right move
			fill(input, i+1,j,colorToBeFilled,oldColor);
			//check for left move
			fill(input, i-1,j,colorToBeFilled,oldColor);
			//check for up move
			fill(input, i,j+1,colorToBeFilled,oldColor);
			//check for down move
			fill(input, i,j-1,colorToBeFilled,oldColor);
			//right diagonal up
			fill(input, i-1,j+1,colorToBeFilled,oldColor);
			//left diagonal up
			fill(input, i-1,j-1,colorToBeFilled,oldColor);
			//right diagonal down
			fill(input, i+1,j+1,colorToBeFilled,oldColor);
			//left diagonal down
			fill(input, i+1,j-1,colorToBeFilled,oldColor);
		}
		else
		{
			//stop coloring as dimensions have moved into some other color
			return;
		}
		
	}

	public static void main(String args[])
	{
		PaintFill obj=new PaintFill();
		int[][] input=new int[3][3];
		input[0][0]=3;
		input[1][1]=3;
		input[2][2]=3;
		input[0][2]=3;
		input[1][2]=3;
		obj.fill(input, 0,0 , 4, 3);
		for(int i=0;i<input.length;i++)
		{
			for(int j=0;j<input[0].length;j++)
			{
				System.out.print(input[i][j]+" ");
			}
			System.out.println();
		}
	}
}