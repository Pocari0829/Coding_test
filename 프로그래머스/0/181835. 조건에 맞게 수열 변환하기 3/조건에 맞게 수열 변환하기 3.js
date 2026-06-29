function solution(arr, k) {
    var answer = arr.map((a)=>{
        return k%2===0 ? a+k : a*k;
    });
    return answer;
}