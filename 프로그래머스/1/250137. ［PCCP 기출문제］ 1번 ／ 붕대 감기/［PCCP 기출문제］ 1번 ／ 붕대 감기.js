function solution(bandage, health, attacks) {
    let stack=0;
    let attackIndex =0;
    let maxHealth=health;
    for(let i=0; i<=attacks[attacks.length-1][0]; i++){
        if(i===attacks[attackIndex][0]){
            health -=attacks[attackIndex][1];
            attackIndex++;
            stack =0;
            if(health<=0){
        return -1;
    }
        }
        else{
        stack++;
        if(stack===bandage[0]){
            health += bandage[2];
            stack =0;
        }
            health+=bandage[1];
        if(health>maxHealth){
            health = maxHealth;
        }
        }
    }
    
    return health;
}