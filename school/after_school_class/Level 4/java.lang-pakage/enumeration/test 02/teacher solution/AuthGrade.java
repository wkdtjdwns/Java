package enumeration.test.ex1;

public enum AuthGrade {
    GUEST(1, "손님"),
    LOGIN(2, "로그인 회원"),
    ADMIN(3, "관리자");

    private final int level;
    private final String desc;

    AuthGrade(int level, String description) {
        this.level = level;
        this.desc = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDesc() {
        return desc;
    }
}
