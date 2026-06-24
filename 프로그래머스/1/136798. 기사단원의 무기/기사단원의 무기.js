function solution(number, limit, power) {
    var answer = 0;
    let count = 0;
    for(let j=1; j<=number; j++){
        count =0;
        for (let i = 1; i <= Math.sqrt(j); i++) {
            if (j % i === 0) {
                count++; // i가 약수일 때 카운트
                if (i !== j / i) {
                    count++; // 대칭되는 짝꿍 약수도 카운트
                }
            }
        }
        if(count>limit){
            answer +=power;
        }
        else answer +=count;
    }
    
    return answer;
}