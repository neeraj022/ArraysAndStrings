//this recursive function calculates the power of a to b

function computePower(a,b)
{
	console.log('a is: '+a+' b is: '+b);
	if(b==0)
	{
		return 1;
	}
	else if(b==1)
	{
		return a;
	}
	else
	{
		if(b%2==0)
		{
			//b is even
			return computePower(a,parseInt(b/2)) * computePower(a,parseInt(b/2)) ;
		}
		else
		{
			//b is odd
			return computePower(a,parseInt(b/2)) * computePower(a,parseInt(b/2))*a ;
		}
	}
}




console.log(computePower(2,8));