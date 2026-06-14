function solution(s){
    let answer = [];
    for(let i of s){
        if(i==='('){
            answer.push(s);
        }
        if(i===')'){
            if(answer.length===0){
                return false;
            }
            answer.pop();
        }
    }
    if(answer.length>0){
            return false;
    }
    return true;
}