//this function sorts the 0,1 array in O(n) time
function sort(input)
{
	var i=0;
	var j=input.length-1;
	while(i<j)
	{
		if(input[i]==0)
		{
			i++;
		}
		else if(input[j]==1)
		{
			j--;
		}
		else
		{
			//swap condition
			var temp=input[i];
			input[i]=input[j];
			input[j]=temp;
			i++;
			j--;
		}
	}

	return input;
}

function sortWith3Types(input)
{
	var i=0; //0's counter
	var j=input.length-1; //1's counter
	var k=input.length-1; //2's counter
	while(i<j && i<k)
	{
		if(input[i]==0)
		{
			i++;
		}
		else if(input[j]==1)
		{
			j--;
		}
		else if(input[k]==2)
		{
			k--;
		}
		else
		{
			//swap condition
			if(input[i]==1)
			{
				//swap with j
				var temp=input[i];
				input[i]=input[j];
				input[j]=temp;
			}
			else
			{
				//swap with k
				var temp=input[i];
				input[i]=input[k];
				input[k]=temp;

			}
		}
	}
	return input;
}

var input=[0,1,0,0,1,0,1,1,0,1,0];
console.log(sort(input));

var input1=[0,1,2,2,1,0,1,0,0,1,0];
console.log(sortWith3Types(input1));
