function solution(nums) {
    var answer = 0;
    let mypokemon = nums.length/2;
    const set = new Set(nums);
    let minimumpokemon = set.size;
    if(minimumpokemon < mypokemon) {
        return minimumpokemon;
    }else {
        return mypokemon;
    }
}