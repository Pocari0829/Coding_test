function solution(arr)
{
    let answer = [];
    for(let i of arr){
        answer.push(i);
        if(answer[answer.length-2]===answer[answer.length-1]){
            answer.pop();
        }
    }
    
    return answer;
}