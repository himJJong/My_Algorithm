//프로그래머스 나머지 1이 되는 수 찾기

class Solution {
    public int solution(int n) {

        int answer = 0;

        for(int i=2 ; i<n+1 ;i++){
            if(n%i==1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
