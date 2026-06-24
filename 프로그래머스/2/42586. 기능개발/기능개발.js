function solution(progresses, speeds) {
    var answer = [];
    let a=0;
    while(progresses.length>0){
        a=0;
        for(let i=0; i<progresses.length; i++){
            progresses[i] += speeds[i];
            console.log(progresses[i]);
        }
        while(true){
            if(progresses[0]>=100){
                progresses.shift();
                speeds.shift();
                a++;
            }
            else break;
            
        }
        if(a>0){
            answer.push(a);
        }
    }
    return answer;
}