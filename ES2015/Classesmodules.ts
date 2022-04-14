class Account{
    id;
    name;
    balance;
    constructor(id:number, name: string, balance: number){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    totalBalance(){
        return this.balance;
    }
}

class SavingAccount extends Account{
    constructor(id: number, name: string, balance: number, interest: number){
        super(id, name, balance = balance + (balance*interest)/100);
    }
}

class CurrentAccount extends Account{
    constructor(id: number, name: string, balance: number, cash_credit: number){
        super(id, name, balance = balance - cash_credit);
    }
}

let savingsAccount = new SavingAccount(1357, "Rajpreet", 300000, 5);
let currentAccount = new CurrentAccount(2468, "Rajpreet", 300000, 2500);
let savingsAccount1 = new SavingAccount(1246, "Seert", 500000, 4.75);
let currentAccount1 = new CurrentAccount(2579, "Seert", 500000, 100000);

console.log("Rajpreet saving" + " " +savingsAccount.totalBalance());
console.log("Rajpreet current" + " " +currentAccount.totalBalance());
console.log("Seert saving" + " " +savingsAccount1.totalBalance());
console.log("Seert current" + " " +currentAccount1.totalBalance());