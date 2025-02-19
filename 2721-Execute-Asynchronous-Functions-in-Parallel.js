/**
 * @param {Array<Function>} functions
 * @return {Promise<any>}
 */
var promiseAll = function(functions) {
    // In this question we have given promises in array and we have to solve it without using promise.all method ... and give the output ...
    // In Short // return Promise.all(functions.map(fn => fn()));

    return new Promise((res, rej) =>{
        let arr = Array(functions.length);
        let waitinglen = functions.length;

        for(let i=0; i<functions.length; i++){
            functions[i]()
            .then( (result) =>{
                arr[i] = result;
                waitinglen--;
                if(waitinglen === 0) res(arr);
            }).catch(rej);
        }
    })
};

/**
 * const promise = promiseAll([() => new Promise(res => res(42))])
 * promise.then(console.log); // [42]
 */