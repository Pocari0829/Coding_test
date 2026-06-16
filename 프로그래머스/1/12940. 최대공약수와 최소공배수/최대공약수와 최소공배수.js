function solution(n, m) {
    var answer = [];
    answer.push(euc(n,m));
    answer.push(n*m/answer[0]);
    return answer;
}
function euc(n,m){
    while(m!==0){
            let r = n%m;
    n = m;
    m = r;
    }
return n;
}