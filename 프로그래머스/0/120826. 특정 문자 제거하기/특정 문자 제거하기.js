function solution(my_string, letter) {
    let regex = new RegExp(letter,"g")
    return my_string.replace(regex,"")
}