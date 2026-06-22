function solution(n_str) {
    var answer = [];
    let notZero = 0;
    for(let i of n_str){
        if(notZero===0 && i==="0"){
            continue;
        }
        else {
            notZero =1;
            answer.push(i);
        }
    }
    return answer.join("");
}