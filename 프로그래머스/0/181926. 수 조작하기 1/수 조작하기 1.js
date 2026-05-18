function solution(n, control) {
    for(let i of control){
        if(i==="w"){
            n++;
        }else if(i==="s"){
            n--;
        }
        else if(i==="d"){
            n+=10;
        }
        else if(i==="a"){
            n-=10;
        }
    }
    return n;
}