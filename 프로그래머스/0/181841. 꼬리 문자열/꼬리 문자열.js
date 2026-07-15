function solution(str_list, ex) {
    let answer="";
    for(let i of str_list){
        if(i.indexOf(ex)>-1){
            continue;
        }
        answer += i;
    }
    return answer;
}