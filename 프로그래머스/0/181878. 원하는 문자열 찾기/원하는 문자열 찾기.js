function solution(myString, pat) {
    if(myString.toLowerCase().indexOf(pat.toLowerCase())>-1){
        return 1;
    }
    return 0;
}