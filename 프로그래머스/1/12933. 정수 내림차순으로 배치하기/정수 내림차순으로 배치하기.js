function solution(n) {
    var answer = n.toString().split("");
    for(let i=0; i<answer.length; i++){
        answer[i] = parseInt(answer[i]);
    }
    answer.sort().reverse();
    return parseInt(answer.join(""));
}