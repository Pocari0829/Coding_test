function solution(s) {
    let answer = s.split("");
    answer.sort().reverse();
    return answer.join("");
}