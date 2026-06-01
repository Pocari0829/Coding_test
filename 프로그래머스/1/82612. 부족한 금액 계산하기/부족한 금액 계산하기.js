function solution(price, money, count) {
    var answer = money;
    for(let i=1; i<=count; i++){
        answer -= price*i;
    }
    if(answer>=0){
        return 0;
    }
    return -answer;
}