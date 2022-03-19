class Rectangle {
    constructor(height, width) {
        this.height = height;
        this.width = width;
    }
    get getHeight(){
        return this.height;
    }
    get getWidth(){
        return this.width;
    }
}

var rectangle = new Rectangle(4, 5);
document.write("Rectangle Dimensions<br><br>Height: "+rectangle.getHeight);
document.write("<br>Width: "+rectangle.getWidth);

Rectangle.prototype.getArea = function() {
    return this.height * this.width
};

Rectangle.prototype.height = 50;
document.write("<br><br>Rectangle Area: " +rectangle.getArea());

rectangle = new Rectangle(20, 63);
document.write("<br><hr>Rectangle properties at Instance 1:<br>Height: "+rectangle.getHeight);
document.write("<br>Width: "+rectangle.getWidth);

Rectangle.prototype.height = 60;
document.write("<br><br>Rectangle Area: " +rectangle.height());
document.write("<br><br>Rectangle Area: " +rectangle.getArea());