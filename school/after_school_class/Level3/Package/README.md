## 패키지의 사용 이유

```
💡 쇼핑몰 시스템 개발을 한다고 가정함
```

- **작은 프로그램 클래스**
    - **Order**
    - **User**
    - **Product**
    
    ---
    
- **큰 프로그램 클래스**
    - **User**
    - **UserManager**
    - **UserHistory**
    - **Product**
    - **ProductCatalog**
    - **ProductImage**
    - **Order**
    - **OrderService**
    - **OrderHistory**
    - **ShoppingCart**
    - **CartItem**
    - **Payment**
    - **등등**
    
    ---
    
- 이런 식으로 클래스의 틀을 나누고 싶어질 때 쓰는 것이 패키지임.
- 패키지는 폴더 디렉토리라고 생각하면 편함.
    
    ---
    
- **user**
    - **User**
    - **UserManager**
    - **UserHistory**
    
    ---
    
- **product**
    - **Product**
    - **ProductCatalog**
    - **ProductImage**
    - **등등**
    
    ---
    
- 위와 같이 비슷한 기능들을 모아두면 찾기도 편하고 보기도 편함.
    
    ---
    
- **패키지 주의사항**
    1. 패키지를 사용하는 경우 항상 코드 첫 줄에 패키지 이름을 적어줘야만 함.
    2. 패키지의 이름과 위치는 폴더(디렉토리) 위치와 같아야 함. (필수)
    3. 패키지의 이름은 모두 소문자를 사용함. (암묵적 룰)
    4. 패키지의 이름의 앞 부분에는 일반적으로 회사의 도메인 이름을 거꾸로 사용함.
        - `com.회사명.프로젝트이름`과 같이 사용함. (암묵적 룰)
        - 수많은 외부 라이브러리가 함께 사용되면 같은 패키지에 같은 클래스 이름이 존재할 수도 있음.
        - 이렇게 도메인 이름을 거꾸로 사용하면 이런 문제를 방지할 수 있음.
        - 오픈소스나 라이브러리를 직접 만들어서 외부에 제공한다면 위의 암묵적 룰을 꼭 지키는 것이 좋음.
        - 내가 만든 애플리케이션을 다른 곳에 공유하지 않고, 직접 배포한다면 보통 문제가 되지는 않음.
