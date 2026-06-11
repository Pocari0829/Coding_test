function solution(arr) {
    let minIndex = 0;
    for(let i in arr){
        if(arr[i]<arr[minIndex])
            minIndex = i;
    }
    arr.splice(minIndex,1);
    if(arr.length===0){
        return [-1];
    }
    return arr;
}