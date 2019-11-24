// process.stdin.resume();
// process.stdin.setEncoding('utf-8');

// var input_ = "";

// process.stdin.on('data', function (data) {
//     input_ += data.toString().trim();
//     input_ += '\n';
// });
tokenize_string ('abc xyz "hero apna" again "heri apni" asdf asdf');
function tokenize_string(S) {
    let quotesIndex = [];
    for (let i=0;i<S.length;i++) {
        if(S.charAt(i)==='"') {
            quotesIndex.push(i);
        }
    }
    let halfCookedStringArr = [];
    for (let i = 1 ; i<quotesIndex.length; i++) {
        if (i%2 === 0) {
            halfCookedStringArr.push(S.substr(quotesIndex[i-1]+1, quotesIndex[i]-quotesIndex[i-1]-1));
        } else {
            halfCookedStringArr.push(S.substr(quotesIndex[i-1], quotesIndex[i]-quotesIndex[i-1]+1));
        }
    }
    //manual addition at the start and end
    if (quotesIndex[0]!==0) {
        halfCookedStringArr.unshift(S.substr(0, quotesIndex[0]));
    }
    if (quotesIndex[quotesIndex.length-1]!== S.length-1) {
        halfCookedStringArr.push(S.substr(quotesIndex[quotesIndex.length-1]+1));
    }

    let finalStringArr = []
    for (let el of halfCookedStringArr) {
        if(el.charAt(0)!=='"') {
            //split by space
            let splitTempArr = el.trim().split(' ');
            finalStringArr = [...finalStringArr, ...splitTempArr]
        } else {
            finalStringArr.push(el);
        }
        
    }
    console.log(finalStringArr);

}

// process.stdin.on('end', function () {
//     input_ = input_.replace(/\n$/, "");
//     input_ = input_.split("\n");
//     var S = input_.shift();

//     var out_ = tokenize_string( S);
//     	//process.stdout.write(out_.join('\n'));

//     process.exit();

// });
