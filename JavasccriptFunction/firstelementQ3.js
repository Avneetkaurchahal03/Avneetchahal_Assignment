function isEven(n){

    if(n%2==0){
        return true;
    }

    else{
        return false;
    }

}

function find(arr, fun){
    
    for(i=0;i<arr.length;i++){
        if(fun(arr[i])==true){
            return arr[i];
        }
    }

}
let inputArray = [];
var size = 5; //Maximum Array size

for(var i=0; i<size; i++) {
	
	//Taking Input from user
	inputArray[i] = prompt('Enter Element ' + (i+1));
}
document.write(find(inputArray, isEven));