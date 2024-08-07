class Solution {
    public int addDigits(int num) {
        int sum = 0;
      while(num>0){
          int lD = num%10;
          num /=10;
          sum += lD;
      } 
       if(sum<10){
           return sum;
       }else{
           return addDigits(sum);
       } 
    }
}