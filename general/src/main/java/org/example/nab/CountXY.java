public class CountXY {


    public int solution(String S) {
        int xLeft = 0;
        int yLeft = 0;
        int xRight = 0;
        int yRight = 0;


        for (char c : S.toCharArray()) {
            if (c == 'x') {
                xRight++;
            } else if (c == 'y') {
                yRight++;
            }
        }
        int result = 0;

        for (int i = 0; i < S.length() - 1; i++) {
            char c = S.charAt(i);
            if (c == 'x') {
                xLeft++;
                xRight--;
            } else if (c == 'y') {
                yLeft++;
                yRight--;
            }
            if (xLeft == yLeft || xRight == yRight) {
                result++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        CountXY bai4 = new CountXY();
        System.out.println(bai4.solution("ayxbx"));
        System.out.println(bai4.solution("xzzzy"));
        System.out.println(bai4.solution("toyxmy"));
        System.out.println(bai4.solution("apple"));


    }

}
