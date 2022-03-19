function Sum (Number)
{
    var sum=0;
    for (var index=1;index<=Number;index++){
        if ( index%3==0 || index%5==0){
        sum=sum+index;
    }
}
    return sum;
    
}
var Number= parseInt(prompt('Enter the number'));
document.write(Sum(Number));