const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
var start =0;
var count = 0;
rl.on('line', (line) => {
    var nums = line.split(' ');
    
    if(count>0 && start ==1 ){
        var a = parseFloat(nums[0]);
        var b = parseFloat(nums[1]);
        var ratio = (15/b);
        var minABPM = ratio*4*a;
        minABPM = minABPM - 60.0/b;
        var bpm = (60*a)/b;
        var maxABPM = 60/(b/a);
        maxABPM = maxABPM + 60.0/b;
        console.log((minABPM).toFixed(4) + " "+(bpm).toFixed(4) + " "+(maxABPM).toFixed(4));
        count --;
    }
    else if(count == 0 && start == 0){
        start =1;
        count = nums;
    }
    else{
        process.exit(0);
    }
});
