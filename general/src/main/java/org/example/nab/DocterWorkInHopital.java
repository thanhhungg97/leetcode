import java.util.*;

public class DocterWorkInHopital {
    int solution(int[][] A) {

        Set<Integer> doctorSoFar = new HashSet<>();

        Set<Integer> doctorWorkMultipleHospital = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            Set<Integer> doctorInCurrentHospital = new HashSet<>();
            for (int j = 0; j < A[0].length; j++) {
                int currentDoctor = A[i][j];
                if (doctorInCurrentHospital.contains(A[i][j])) {
                    continue;
                }

                doctorInCurrentHospital.add(currentDoctor);

                if (doctorSoFar.contains(currentDoctor)) {
                    doctorWorkMultipleHospital.add(currentDoctor);
                } else {
                    doctorSoFar.add(currentDoctor);
                }

            }

        }


        return doctorWorkMultipleHospital.size();

    }

    public static void main(String[] args) {
        DocterWorkInHopital sut = new DocterWorkInHopital();

        System.out.println(sut.solution(new int[][]{{4, 3}, {5, 5}, {6, 2}}));
        System.out.println(sut.solution(new int[][]{{1, 2, 2}, {3, 1, 4}}));

    }
}
