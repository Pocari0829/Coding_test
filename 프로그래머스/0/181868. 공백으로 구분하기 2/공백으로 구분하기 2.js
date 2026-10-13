function solution(my_string) {
    var answer = [];
    let str="";
    for(let char of my_string){
        if(char===" "){
            if(str!=="") answer.push(str);
            str = "";
        }
        else str += char;
    }
    if(str!==""){
        answer.push(str);
    }
    return answer;
}