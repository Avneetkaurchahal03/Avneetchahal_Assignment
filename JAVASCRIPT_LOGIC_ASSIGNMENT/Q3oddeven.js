function parity (Number)
{
    if(Number%2==0){
        return "Even";

    }
    else{
        return "Odd";
    }
}
  
var Number= parseInt(prompt('Enter the number'));
document.write(parity(Number));