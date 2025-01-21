/**
 * Custom reduce function implementation.
 * @param {number[]} nums - Array of numbers to iterate over.
 * @param {Function} fn - Callback function to process each element.
 * @param {number} init - Initial value for the accumulator.
 * @return {number} - Final accumulated value.
 */

var reduce = (nums, fn, init) => {
    // Iteration (for-of loop): Loops through each element in the array.
    for (const num of nums) {
        // Callback function: 'fn' processes the current accumulator and array element.
        init = fn(init, num); // Immutability: 'init' is updated without modifying the array.
    }
    // Return statement: Returns the final accumulated value.
    return init;
};

/**
 * Example usage:
 */
const nums = [1, 2, 3, 4];
const sum = reduce(nums, (acc, curr) => acc + curr, 0); // Higher-order function: Passes a callback to 'reduce'.
console.log(sum); // Output: 10