function solution(cipher, code) {
    var answer = '';
    for(let i=0; i<=cipher.length; i++){
        if(i!==0 && i%code===0){
            answer += cipher.charAt(i-1);
        }
    }
    return answer;
}