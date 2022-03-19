var fullName = '({"firstName": "Avneet", "lastName": "Chahal"})';
var realObject = eval(fullName);
document.getElementById("eval-function").innerHTML = realObject.firstName+" "+realObject.lastName;