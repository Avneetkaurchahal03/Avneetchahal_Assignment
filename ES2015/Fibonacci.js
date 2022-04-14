var fibonnacci = /** @class */ (function () {
    function fibonnacci() {
    }
    fibonnacci.prototype.next = function (previousNo, currentNo) {
        console.log(previousNo + currentNo);
    };
    return fibonnacci;
}());
var f = new fibonnacci();
f.next(2, 3);