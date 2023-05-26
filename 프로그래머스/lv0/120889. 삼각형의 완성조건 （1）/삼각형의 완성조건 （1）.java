import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
     int answer = 0;
		Arrays.sort(sides);
		System.out.println(Arrays.toString(sides));
		
		int max = sides[2];
		int min = sides[0] + sides[1];
		System.out.println("max="+max);
		System.out.println("min="+min);
		
		if (max < min) {
			answer = 1;
		} else {
			answer = 2;
		}

        return answer;
    }
}