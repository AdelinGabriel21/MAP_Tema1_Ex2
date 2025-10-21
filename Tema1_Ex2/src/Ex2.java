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

    public int minNumber(int[] numbers){
        int min = Integer.MAX_VALUE;
        for(int num : numbers){
            if (num < min){
                min = num;
            }
        }

        return min;
    }
}
