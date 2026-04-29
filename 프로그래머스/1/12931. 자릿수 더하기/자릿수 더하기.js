function solution(n)
{
    let answer = 0;
    let str = n.toString();
    for(let i of str){
        answer+= +(i);
    }
    return answer;
}