package chap_07;

public class _04_Method {

	public static void main(String[] args) {
		
		BlackBox b1 = new BlackBox();
		b1.modelName = "까망이";
		
//		클래스 메소드 호출
		b1.autoReport();
		// 자동신고 기능 업데이트 완료
		BlackBox.canAutoReport = true;
		b1.autoReport();
		
		b1.insertMemoryCard(512);
		
		// 전체 영상 : type = 0
		// 일반 영상 : type = 1
		// 이벤트 영상(충돌 감지) : type = 2
			
		int fileCount = b1.getVideoFileCount(0); // 전체 영상 갯수
		System.out.println("전체 영상 파일 수 : " + fileCount);
		
		fileCount = b1.getVideoFileCount(1); // 일반 영상 갯수
		System.out.println("일반 영상 파일 수 : " + fileCount);
		
		fileCount = b1.getVideoFileCount(2); // 이벤트 영상 갯수
		System.out.println("이벤트 영상 파일 수 : " + fileCount);
	}
}
