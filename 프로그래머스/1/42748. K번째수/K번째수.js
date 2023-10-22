
2
3
4
5
6
7
8
9
10
11
12
function solution(array, commands) {
    let answer = [];
    let newArray;

    for (let i = 0; i < commands.length; i++) {
        newArray = [...array];
        newArray = newArray.slice(commands[i][0] - 1, commands[i][1]);
        newArray.sort((a, b) => a - b);;
        answer[i] = newArray[commands[i][2] - 1];
    }
    return answer;
}