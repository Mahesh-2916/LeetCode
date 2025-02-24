/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 */
var join = function(arr1, arr2) {
    const result = {};
    for(let i=0; i<arr1.length; i++){
        result[arr1[i].id] = arr1[i]
    }
    for(let i=0; i<arr2.length; i++){
        if(result[arr2[i].id]){ 
            //if the keys is already in arr1 then we overlapped the value of arr2
            for(const key in arr2[i])
                result[arr2[i].id][key] = arr2[i][key];
        }
        else result[arr2[i].id] = arr2[i];
    }
    // As result is in format of object and we have to return array format and only value...
    return Object.values(result);
};