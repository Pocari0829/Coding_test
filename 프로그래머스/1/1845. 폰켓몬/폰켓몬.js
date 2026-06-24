function solution(nums) {
    var phone = [];
    for(let i of nums){
        if(phone.indexOf(i)!==-1){
            continue;
        }
        phone.push(i);
        if(phone.length > nums.length/2){
            phone.pop();
            break;
        }
    }
    return phone.length;
}