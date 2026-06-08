function solution(n) {
    if(Math.sqrt(n)===Math.floor(Math.sqrt(n))){
        let a = Math.sqrt(n)+1;
        return a*a;
    }
    return -1;
}