package classExam;

// 파라미터로 정수 배열(intArray)를 받고 배열의 모든 값을 리턴해주는 메소드 computerAverage()를 작성하시오

class AverageFinder
{
    // 인스턴스 메소드
    double computerAverage(int[] intArray)
    {
        double sum = 0.0;

        // for - each을 사용해서 평균을 구함
        for (int num : intArray)
        {
            sum += num;
        }

        return sum / intArray.length;
    }

}

public class Ex01 {
    public static void main(String[] args) {
        // 테스트

        // 인스턴스 변수에 접근하려면 클래스를 인스턴스화 해주어야 함
        AverageFinder averageFinder = new AverageFinder();

        int[] testArray1 = {3, 7, 3};
        int[] testArray2 = {3, 6, 13};
        int[] testArray3 = {3, 6, 9, 12, 15};
        int[] testArray4 = {3, 9};
        int[] testArray5 = {3, 7, 3, 35, 2, 0};

        System.out.println(averageFinder.computerAverage(testArray1));
        System.out.println(averageFinder.computerAverage(testArray2));
        System.out.println(averageFinder.computerAverage(testArray3));
        System.out.println(averageFinder.computerAverage(testArray4));
        System.out.println(averageFinder.computerAverage(testArray5));
    }
}
