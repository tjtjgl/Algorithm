class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n > 0 && n <= 1000){
            for(int i=1; i<=n; i++){
                answer += i%2 == 0 ? i : 0;
            }
            return answer;
        }
        
        return answer;
    }
}