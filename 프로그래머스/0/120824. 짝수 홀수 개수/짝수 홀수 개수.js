function solution(num_list) {
    let odd=0;
    let even=0;
    for(let i of num_list){
        if(i%2==0){
            even++;
        }
        else odd++;
    }
    return [even,odd];
}