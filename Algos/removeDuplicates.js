//challenge: remove duplicates from the original array without creating a new one (doing it in place)
//HINT: research the javascript array .splice() method

function removeDupes(arr){
    for(let i=0;i<arr.length;i++){
        if(arr[i]===arr[i+1]){
            arr.splice(i,1)
        }
    }
    return arr
}


console.log(removeDupes([4,7,8,8,4,2,3])) //[4,7,8,2,3]