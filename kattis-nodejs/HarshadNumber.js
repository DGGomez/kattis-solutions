const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.on('line', (line) => {
    var nums = parseInt(line,10);
    if(check(nums, line)){
        console.log(nums);
    }
    else{
        nums++;
        while(!check(nums,nums.toString(10))){
         nums++;   
        }
        console.log(nums);
    }
    process.exit(0);
});

function check(n,s){
    var div=0;
    for(var i =0; i<s.length; i++){
        div+=parseInt(s.substring(i,i+1), 10);
    }
    return n%div==0;
}
