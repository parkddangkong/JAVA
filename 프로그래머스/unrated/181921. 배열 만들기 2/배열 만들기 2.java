import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int l, int r) {
 ArrayList<Integer> list = new ArrayList<>();
         String[] bnum = {"1","2","3","4","6","7","8","9"};
         
         for(int i = l; i <= r; i++) {
         	String strI = String.valueOf(i);
         	boolean shouldAdd = true;

         	for(int j = 0; j < bnum.length; j++) {
         		if(strI.contains(bnum[j])) {
         			shouldAdd = false; // bnum의 요소가 포함되면 추가하지 않도록 표시하고 for-loop 중단
         			break;
         		}
         	}

         	if (shouldAdd) {
         		list.add(i);
         	}
         }
              if (list.isEmpty()) {
             return new int[] {-1};
         }

         return list.stream().mapToInt(Integer::intValue).toArray();
    }
}