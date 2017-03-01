function maxSum(input)
{
	var mim=[];
	for(item in input)
	{
		mim.push(input[item]);
	}
	for(var i=1;i<input.length;i++)
	{
		for(var j=0;j<=i;j++)
		{
			if(input[i]>input[j] && mim[j]+input[i]>mim[i])
			{
				mim[i]=mim[j]+input[i];
			}
		}
	}
	return mim;
}


var input=[2,3,4,101,9,10,15, 100,104,101];
var result=maxSum(input);
var max=result[0];
for(var i=0;i<result.length;i++)
{
	if(max<result[i])
	{
		max=result[i];
	}
}
console.log(max);