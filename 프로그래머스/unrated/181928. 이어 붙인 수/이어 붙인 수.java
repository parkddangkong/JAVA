class Solution {
    public int solution(int[] num_list) {
         int answer = 0;
        int[] even = {}, odd= {};
        int even_num =0,odd_num=0;
        String eve="",od="";
        for(int i =0;i<num_list.length;i++) {
        	if(num_list[i]%2==0) {
        		even = new int[num_list[i]];
        		even[0] = num_list[i];
        		eve += even[0];
        	}
        	else {
        		odd = new int[num_list[i]];
        		odd[0] = num_list[i];
        		od += odd[0]; 
        	}
        }
        
        even_num = Integer.parseInt(eve);
        odd_num = Integer.parseInt(od);
        
        answer = even_num+odd_num;
        return answer;
    }
}