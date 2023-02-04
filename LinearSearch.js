    //MAKE SURE YOU LINK THIS TO HTML OR RUN ON NODE.JS
let array = [5,3,4,6,22,77];
let target = 3;
console.log(array);
console.log(LinearSearch(array,target));
    // FUNCTION
function LinearSearch(arr,target) {
    for (let index = 0; index < arr.length; index++) {
       if ( arr[index] === target) {
        console.log("index found at "+index);
        return index;//for sack of tradition
       }
    }
    console.log("index not found");
    return -1;//for without log statement
}