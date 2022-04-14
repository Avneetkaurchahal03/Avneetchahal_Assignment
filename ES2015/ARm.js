function getNextArmstrong1(n) {
    var result = 0;
    if (n > 1000) {
        throw 'Error occured number is greater than 1000';
    }
    for (var i = 1; i <= n; i++) {
        var w = i;
        while (i > 0) {
            var remainder = i % 10;
            result += remainder * remainder * remainder;
            i /= 10;
        }
        if (result === w) {
            console.log(w);
            break;
        }
        result = 0;
    }
}
try {
    getNextArmstrong1(1153);
}
catch (e) {
    console.error(e);
}