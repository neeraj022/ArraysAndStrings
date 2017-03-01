function reverseBinary(input)
{
	var result=0;
	while(input!=0)
	{
		result=result<<1;
		result=result | (input&1) ;
		input=input>>1;
		//console.log(result);

	}
	return result;
}

var result=reverseBinary(6);
console.log(result);