public class Bai1 {
    public static void main(String[] args) {
        Bai1 bai1 = new Bai1();
        System.out.println(bai1.solution(".x..x"));
        System.out.println(bai1.solution("x.xxxxx.x"));
        System.out.println(bai1.solution("xx.xxx.."));
        System.out.println(bai1.solution("xxxx"));


    }

    int solution(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'x') {
                count++;
                i += 2;
            }
        }
        return count;
    }
}
