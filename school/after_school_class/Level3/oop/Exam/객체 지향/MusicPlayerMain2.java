package oop;

public class MusicPlayerMain2 {

    public static void main(String[] args) {

        MusicPlayerData mp = new MusicPlayerData();

        // 뮤직 플레이어 켜기
        musicPlayerOn(mp);

        // 볼륨 증가
        musicPlayerVolumeUp(mp);

        // 볼륨 증가
        musicPlayerVolumeUp(mp);

        // 볼륨 감소
        musicPlayerVolumeDown(mp);

        // 현재 음악 플레이어 상태
        showStatus(mp);

        // 음악 플레이어 끄기
        musicPlayerOff(mp);
    }

    static void musicPlayerOn(MusicPlayerData mp) {
        mp.isOn = true;
        System.out.println("뮤직 플레이어를 시작합니다.");
    }

    static void musicPlayerOff(MusicPlayerData mp) {
        mp.isOn = false;
        System.out.println("뮤직 플레이어를 종료합니다.");
    }

    static void musicPlayerVolumeUp(MusicPlayerData mp) {
        mp.volume++;
        System.out.println("현재 볼륨 : " + mp.volume);
    }

    static void musicPlayerVolumeDown(MusicPlayerData mp) {
        mp.volume--;
        System.out.println("현재 볼륨 : " + mp.volume);
    }

    static void showStatus(MusicPlayerData mp) {
        if (mp.isOn) {
            System.out.println("음악 플레이어 On, 볼륨 : " + mp.volume);
        } else {
            System.out.println("음악 플레이어 Off");
        }
    }
}

/*
 * 각각의 기능을 메서드로 만든 덕분에 각각의 기능이 모듈화가 됨. 따라서 아래와 같은 장점이 생김.
 * 1. 중복 제거 : 로직의 중복이 제거됨. -> 같은 로직이 필요하면 해당 메서드를 여러번 호출하면 됨.
 * 2. 변경 영향 범위 : 기능을 수정할 때 해당 메서드 내부만 변경하면 됨.
 * 3. 메서드 이름 추가 : 메서드 이름을 통해 코드를 좀 더 쉽게 이해할 수 있음
 *
 * 모듈화 - 레고 블럭을 생각하면 편함.
 * 레고에서 필요한 블럭을 가져다 꼽아서 사용할 수 있듯이
 * 음악 플레이어의 기능이 필요하면 해당 기능을 메서드의 호출만으로 손쉽게 사용할 수 있음.
 * 이제 음악 플레이어와 관련된 메서드를 조립해서 프로그램을 작성할 수 있음.
 */
