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
	}
}
