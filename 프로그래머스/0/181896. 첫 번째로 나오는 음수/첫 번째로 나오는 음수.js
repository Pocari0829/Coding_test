function solution(num_list) {
    var answer = 0;
    let havMin = false
    for(let i=0; i<num_list.length; i++){
        if(num_list[i]<0){
            answer = i;
            havMin = true
            break;
        }
    }
    if(havMin===false){
        return -1;
    }
    return answer;
}