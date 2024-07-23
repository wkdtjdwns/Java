# 문제: 인터페이스와 추상 클래스를 사용하여 카메라 시스템 구현

다음 조건을 만족하는 카메라 시스템을 구현하세요. 모든 코드는 하나의 파일에 작성할 필요는 없으며, 패키지 구조를 고려하여 작성하세요.

<br>

## 조건

1. **추상 클래스 Camera**
   
    - 패키지: `chap_08.camera`
  
    - **메소드**
      
        - `takePicture()`: 사진을 촬영합니다. (구현)
          
        - `recordVideo()`: 동영상을 녹화합니다. (구현)
          
        - `showMainFeature()`: 카메라의 주요 기능을 출력합니다. (추상 메소드)
          
3. **인터페이스 Detectable**
   
    - 패키지: `chap_08.detector`
      
    - **메소드**
      
        - `detect()`: 감지 기능을 수행합니다. (추상 메소드)
          
5. **인터페이스 Reportable**
   
    - 패키지: `chap_08.reporter`
      
    - **메소드**
      
        - `report()`: 신고 기능을 수행합니다. (추상 메소드)
          
7. **구현 클래스 FactoryCam**
   
    - 패키지: `chap_08.camera`
      
    - `Camera` 추상 클래스를 상속받고, `Detectable`과 `Reportable` 인터페이스를 구현합니다.

    - **추가 메소드**
      
        - `setDetector(Detectable detector)`: 감지기 객체를 설정합니다.
          
        - `setReporter(Reportable reporter)`: 리포터 객체를 설정합니다.
          
    - `showMainFeature()` 메소드는 "화재 감지"를 출력합니다.
      
    - `detect()` 메소드는 설정된 감지기의 `detect()` 메소드를 호출합니다
      
    - `report()` 메소드는 설정된 리포터의 `report()` 메소드를 호출합니다.
      
9. **구현 클래스 SpeedCam**
    
    - 패키지: `chap_08.camera`
      
    - `Camera` 추상 클래스를 상속받습니다.
      
    - **추가 메소드**
      
        - `setDetector(Detectable detector)`: 감지기 객체를 설정합니다.
          
        - `setReporter(Reportable reporter)`: 리포터 객체를 설정합니다.
          
    - `showMainFeature()` 메소드는 "속도 측정, 번호 인식"을 출력합니다.

    - `detect()` 메소드는 설정된 감지기의 `detect()` 메소드를 호출합니다.
      
    - `report()` 메소드는 설정된 리포터의 `report()` 메소드를 호출합니다.
      
11. **구현 클래스 AccidentDetector**
    
    - 패키지: `chap_08.detector`
      
    - `Detectable` 인터페이스를 구현합니다.
      
    - `detect()` 메소드는 "교통 사고를 감지합니다."를 출력합니다.
      
13. **구현 클래스 AdvancedFireDetector**
    
    - 패키지: `chap_08.detector`
      
    - `Detectable` 인터페이스를 구현합니다.
      
    - `detect()` 메소드는 "향상된 성능으로 화재를 감지합니다."를 출력합니다.
      
15. **구현 클래스 FireDetector**
    
    - 패키지: `chap_08.detector`
      
    - `Detectable` 인터페이스를 구현합니다.
      
    - `detect()` 메소드는 "일반 성능으로 화재를 감지합니다."를 출력합니다.
      
17. **구현 클래스 NormalReporter**
    
    - 패키지: `chap_08.reporter`
      
    - `Reportable` 인터페이스를 구현합니다.
      
    - `report()` 메소드는 "일반 화재 신고를 진행합니다."를 출력합니다.

19. **구현 클래스 VideoReporter**
    
    - 패키지: `chap_08.reporter`
      
    - `Reportable` 인터페이스를 구현합니다.
      
    - `report()` 메소드는 "직전 30초 영상과 함께 신고를 진행합니다."를 출력합니다.
      
21. **메인 클래스**
    
    - 패키지: `chap_08`
      
    - 클래스 이름: `_02_Interface`
      
    - **메소드**
      
        - `main(String[] args)`: 다음과 같은 작업을 수행합니다.
          
            - `NormalReporter`와 `VideoReporter` 객체를 생성하고 각각의 `report()` 메소드를 호출합니다.
              
            - `FireDetector`와 `AdvancedFireDetector` 객체를 생성하고 각각의 `detect()` 메소드를 호출합니다.
              
            - `FactoryCam` 객체를 생성하고 `AdvancedFireDetector`와 `VideoReporter` 객체를 설정한 후, `detect()`와 `report()` 메소드를 호출합니다.

<br>

## 예시 출력

```
일반 화재 신고를 진행합니다.
직전 30초 영상과 함께 신고를 진행합니다.
---------------------
일반 성능으로 화재를 감지합니다.
향상된 성능으로 화재를 감지합니다.
---------------------
향상된 성능으로 화재를 감지합니다.
직전 30초 영상과 함께 신고를 진행합니다.
```

위 조건을 만족하는 자바 프로그램을 작성하세요.
