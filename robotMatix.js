function roboMoves(i,j,n)
{
	if(i==n && j==n)
	{
		return 1;
	}
	 else if(i>n || j>n)
	{
		return 0;
	}
	else
	{
		return roboMoves(i+1,j,n)+roboMoves(i,j+1,n);
	}
}


console.log(roboMoves(1,1,3));