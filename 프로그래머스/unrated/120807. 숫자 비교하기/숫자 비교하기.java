class Solution {
    public int solution(int num1, int num2) {
       
         if (num1 >= 0 && num1 <= 10000) {
            if(num2 >= 0 && num2 <= 10000){
                if(num1-num2 == 0) {
                    return 1;
                } else 
                    return -1;
              
            }
         }
        return 0;

    }
}