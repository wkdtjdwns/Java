package oop;

public class MusicPlayerMain4 {

    public static void main(String[] args) {

        MusicPlayer player = new MusicPlayer();

        // 뮤직 플레이어 켜기
        player.musicPlayerOn();

        // 볼륨 증가
        player.musicPlayerVolumeUp();

        // 볼륨 증가
        player.musicPlayerVolumeUp();

        // 볼륨 감소
        player.musicPlayerVolumeDown();

        // 현재 음악 플레이어 상태
        player.showStatus();

        // 음악 플레이어 끄기
        player.musicPlayerOff();
    }
}
