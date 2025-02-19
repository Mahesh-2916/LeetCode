/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    let b = size
    let x =arr.length
    let a=0;
    let val = []
     if(arr.length==0)return arr 
    if(size>=x)return [arr]
    while(x>=b){
        let c = arr.slice(a,b)

        val.push(c)
           a=b;
        if(b+size>x && b!=x){
            c=arr.slice(b)
            val.push(c)
            break;
            console.log(b)
        }
        b=b+size;
        
    }
   
    
    return val
};