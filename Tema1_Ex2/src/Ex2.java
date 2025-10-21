public class Ex2 {
    public int maxNumber(int[] numbers){
        int max = 0;
        for(int num : numbers){
            if (num > max){
                max = num;
            }
        }

        return max;
    }
}
