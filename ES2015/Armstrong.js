function getNextArmstrong(n) {
    var result = 0;
    for (var i = n; i <= 154; i++) {
        var w = i;
        while (i != 0) {
            var remainder = i % 10;
            result += remainder * remainder * remainder;
            i /= 10;
        }
        if (result === w) {
            console.log(w);
            break;
        }
    }
}
getNextArmstrong(150);