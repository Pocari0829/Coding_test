function solution(num_list) {
    var arr = num_list.sort((a,b) =>{
        return a-b;
    });
    console.log(arr);
    var answer = [];
    for(let i=5; i<arr.length; i++){
        answer.push(arr[i]);
    }
    return answer;
}