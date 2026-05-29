function solution(food) {
    let answer = "";
    let i=1
    while(i<food.length){
        for(let j = 0; j<Math.floor(food[i]/2); j++){
            answer += i;
        }
        i++;
    }
    answer += 0;
    while(i>0){
        for(let j = 0; j<Math.floor(food[i]/2); j++){
            answer += i;
        }
        i--;
    }
    return answer;
}