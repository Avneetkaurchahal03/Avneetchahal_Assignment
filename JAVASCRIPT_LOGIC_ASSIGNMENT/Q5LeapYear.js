var year = prompt("please input a year to find out the next 20 leap years");
var counter = 20;

function leapyear(years, num) {
    //convert years to integer
    years = parseInt(years);

    var origNum = num;
    //add 1 to years just in case current year is leap year
    years++;
    //this string will hold all of the leap years
    var leapYears = '';
    
    while (num > 0) {
       
        if (years % 4 === 0 && (years % 100 !== 0 || ( years % 100 === 0 && years % 400 === 0))) {
            //if at the last year
            if (num === 1) {
                //add a period to end
                leapYears += years + ".";
            }
            else {
                //otherwise, add a comma and space for other years
                leapYears += years + ", ";
            }
            //increase years
            years++;
            //decrease num
            num--;
        }
        else {
            //if not a multiple of 4, just add to years
            years++;
        }
    }
    //returns sentence after while loop is done
    return "The next " + origNum + " leap years are " + leapYears;
}

//write to document the result of running leapyear
document.write(leapyear(year, counter));
//or
//alert result of running leapyear
//alert(leapyear(year, counter));