function solution(num_list) {
    var arr =  num_list.sort((a,b) =>{
        return a-b
    })
    var answer = [];
    for(let i=0; i<5; i++){
        answer.push(arr[i]);
    }
    return answer;
}