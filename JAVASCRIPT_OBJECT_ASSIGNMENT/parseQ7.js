let bio = '{"firstName": "Avneet", "age": 22, "city": "Hoshiarpur"}';
let bioObject = JSON.parse(bio);
document.getElementById("json-parse").innerHTML = bioObject.firstName+" "+bioObject.age;