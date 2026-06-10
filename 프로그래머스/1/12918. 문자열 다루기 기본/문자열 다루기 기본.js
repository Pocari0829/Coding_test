function solution(s) {
    const  answer = /^\d{4}$|^\d{6}$/;
    return answer.test(s);
}