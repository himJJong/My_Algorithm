class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for(int i=0; i<arr.length;i++){
            sum+= arr[i];
        }
        answer=sum/arr.length;
        return answer;
    }
}

//프로그래머스 평균구하기
//변수의 자료형 주의
