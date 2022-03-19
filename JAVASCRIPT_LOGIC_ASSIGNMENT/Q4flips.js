function coinFlip() {
    return(Math.random() <=0.7) ? 'Heads' : 'Tails'; //ofc 0.3 is 30% (3/10)
}

var howManyTimes=prompt("please enter number of times head prompt");;
var countHeads=0; 
for (var i=0; i<howManyTimes;i++){
if (coinFlip()==='Heads'){
 countHeads++;
}
}
document.write("Heads appear "+(countHeads/howManyTimes)+"% of the time");