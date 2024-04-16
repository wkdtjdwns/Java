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
