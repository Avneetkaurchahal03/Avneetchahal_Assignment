class Rectangle{

    constructor(length, breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    get getLength(){
        return this.length;
    }

    get getBreadth(){
        return this.breadth;
    }

}
var rectangle = new Rectangle(7, 6);
document.write("Rectangle<br>Length: "+rectangle.getLength);
document.write("<br>Breadth: "+rectangle.getBreadth);

Rectangle.prototype.getArea = function() {
    return this.length * this.breadth
};

document.write("<br> AREA : " +rectangle.getArea());

rectangle = new Rectangle(76, 64);
document.write("<br><hr>Rectangle properties at Instance 1:<br>Length: "+rectangle.getLength);
document.write("<br>Breadth: "+rectangle.getBreadth);

Rectangle.prototype.getArea = function() {
    return this.length * this.breadth
};

document.write("<br> AREA :" +rectangle.getArea());


rectangle = new Rectangle(5, 4);
document.write("<br><hr>Rectangle properties at Instance 2:<br>Length: "+rectangle.getLength);
document.write("<br>Breadth: "+rectangle.getBreadth);

document.write("<br> AREA :" +rectangle.getArea());



rectangle = new Rectangle(75, 63);
document.write("<br><hr>Rectangle properties at Instance 3:<br>Length: "+rectangle.getLength);
document.write("<br>Breadth: "+rectangle.getBreadth);

document.write("<br> AREA :" +rectangle.getArea());


rectangle = new Rectangle(20, 63);
document.write("<br><hr>Rectangle properties at Instance 4:<br>Length: "+rectangle.getLength);
document.write("<br>Breadth: "+rectangle.getBreadth);

document.write("<br> AREA :" +rectangle.getArea());


var n=prompt("Enter Length: ");//enter length of rectangle
var m=prompt("Enter Breadth: ");//enter breadth of rectangle
rectangle = new Rectangle(n,m);
document.write("<br><hr>Rectangle properties at Instance 5:<br>Length: "+rectangle.getLength);
document.write("<br>Breadth: "+rectangle.getBreadth);

document.write("<br> AREA :" +rectangle.getArea());

