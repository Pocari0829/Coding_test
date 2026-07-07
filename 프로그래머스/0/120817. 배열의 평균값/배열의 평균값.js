function solution(numbers) {
    var answer = numbers.reduce((a,sum)=>{
        return sum+=a;
    },0);
    return answer/numbers.length;
}