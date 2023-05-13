class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int amricano = 5500;
        int coffee = money / amricano < amricano ? money / amricano : 0;
        int coin = money % amricano;
//      answer = new int[]{coffee, amricano}; 이것도 됨
        answer[0] = coffee;	// 초기값을 설정해줬기 때문에 인덱스에 넣으면 됨
        answer[1] = coin;
        return answer;
    }
}