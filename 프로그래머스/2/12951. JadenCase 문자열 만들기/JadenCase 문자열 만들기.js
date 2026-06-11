function solution(s) {
    let answer=[];
    for(let i in s){
        if(+i===0 || s.charAt(i-1)===' '){
            answer.push(s.charAt(i).toUpperCase());
        }
        else answer.push(s.charAt(i).toLowerCase());
    }
    return answer.join("");
}