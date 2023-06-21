package chap_07;

public class _06_ClassMethod {

	public static void main(String[] args) {
		
		// 클래스명 변수명 = new 클래스명();
		BlackBox bbox = new BlackBox();
		
		// 이 값들은 다른 객체에서는 사용이 불가능하고 bbox 라는 변수에만 할당된 값임
		bbox.modelName = "까망이";
		bbox.resolution = "FHD";
		bbox.price = 10000;
		bbox.color = "Black";
		System.out.println(bbox.modelName);
		
		// 자동신고기능 개발전
		// 클래스 필드는 [클래스명.필드 (bbox 아님)]로 접근함 / 클래스 필드는 클래스 파일에서 바꾸는 것이지 인스턴스 파일에서 바꾸는 것이 아님
		System.out.println(BlackBox.canAutoReport);
//		BlackBox.canAutoReport = true;
		
		bbox.autoReport();
		
		bbox.insertMemoryCard(512);

		
		// 아무 숫자 : 모든 영상 / 1 : 일반 영상 / 2 : 이벤트 영상
		int fileCount = bbox.getVideoFileCount(0);
		System.out.println(fileCount);
		
		fileCount = bbox.getVideoFileCount(1);
		System.out.println(fileCount);

		fileCount = bbox.getVideoFileCount(2);
		System.out.println(fileCount);
		
		// 클래스 메소드
		// 고객센터 연결
		BlackBox.callServieceCenter();
	}
}
