package oop;

public class MusicPlayer {
    
    boolean isOn;
    int volume;
    
    void musicPlayerOn() {
        isOn = true;
        System.out.println("뮤직 플레이어를 시작합니다.");
    }

    void musicPlayerOff() {
        isOn = false;
        System.out.println("뮤직 플레이어를 종료합니다.");
    }

    void musicPlayerVolumeUp() {
        volume++;
        System.out.println("현재 볼륨 : " + volume);
    }

    void musicPlayerVolumeDown() {
        volume--;
        System.out.println("현재 볼륨 : " + volume);
    }

    void showStatus() {
        if (isOn) {
            System.out.println("음악 플레이어 On, 볼륨 : " + volume);
        } else {
            System.out.println("음악 플레이어 Off");
        }
    }
}

/*
 * 캡슐화
 * MusicPlayer를 보면 음악 플레이어를 구성하기 위한 속성과 기능이 마치 하나의 캡슐에 쌓여있는 것 같음.
 * 이렇게 속성 (필드, 멤버변수)과 기능 (메서드)을 하나로 묶어서 필요한 기능을 메서드를 통해 외부로 제공하는 것을 캡슐화라고 함.
 *
 * 필요한 곳에서는 가져다 사용하긴 하겠지만 안에 있는 구조는 직접 바꿀 수 없음.
 * -> 보안에 유리해짐.
 */
