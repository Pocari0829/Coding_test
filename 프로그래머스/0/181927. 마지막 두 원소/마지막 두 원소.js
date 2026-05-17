function solution(num_list) {
    let answer = num_list;
    let m = answer.length-1;
    let n = answer.length-2;
    if(answer[m]>answer[n]){
        answer.push(answer[m]-answer[n])
    }
    else {
        answer.push(answer[m]*2);
    }
    return answer;
}