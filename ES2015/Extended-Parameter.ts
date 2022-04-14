var add = (val=10) => val; 
console.log(add());
console.log(add(20));


function userFriends(username: string, ...friends: string[]){
    console.log("username: ",username);
    console.log("friends: ",friends);

    for(let i in friends){
        console.log(friends[i]);
    }
}

userFriends('rachael','Ross','chandler','monica','joey','Phoebe','Mark');


function printCapitalNames(...names: string[]){
    console.log(names);
    
    for(let i in names)
        console.log(names[i].toUpperCase());
}

let capitalNames = ['rachael','Ross','chandler','monica','joey','Phoebe','Mark'];
printCapitalNames(...capitalNames);