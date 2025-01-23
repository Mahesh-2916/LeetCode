/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
let args =[1,32,4,5,6,476,0];
var argumentsLength = function(...args) {
    return args.length;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */