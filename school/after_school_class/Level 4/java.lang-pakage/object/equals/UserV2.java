package lang.object.equals;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        // 다운 캐스팅
        UserV2 user = (UserV2) obj;
        return id.equals(user.id);
    }
}
