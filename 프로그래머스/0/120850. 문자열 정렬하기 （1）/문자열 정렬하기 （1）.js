function solution(my_string) {
    var answer = [];
    for(let i of my_string){
        if(!isNaN(i)){
            answer.push(parseInt(i));
        }
    }
    return answer.sort();
}