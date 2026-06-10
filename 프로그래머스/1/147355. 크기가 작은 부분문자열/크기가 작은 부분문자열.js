function solution(t, p) {
    var answer = 0;
    console.log(+p);
    for(let i=0; i<=t.length-p.length; i++){
        console.log(+t.slice(i,p.length+i));
        if(+t.slice(i,p.length+i)<=+p)
           answer++;
    }
    return answer;
}