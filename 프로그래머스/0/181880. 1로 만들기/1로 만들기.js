function solution(num_list) {
    var answer = 0;
    for(let i of num_list){
        while(i!==1){
            if(i%2===1){
            i-=1;
            i/=2;
            console.log(i);
            answer++;
        }
        else {
            i/=2;
            answer++;
        }
        }
    }
    return answer;
}