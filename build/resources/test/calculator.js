"use strict";

var add = function(a, b) {
    return a + b;
}

var sub = function(a, b) {
    return a - b;
}

var div = function(a, b) {
    if (a >= b) {
        return a / b;
    }
     else {
        return 0;
     }
}

var mult = function(a, b) {
    return a * b;
}

var square = function(a) {
    return a * a;
}