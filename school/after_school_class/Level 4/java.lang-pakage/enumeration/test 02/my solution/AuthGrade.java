package enumeration.test.ex2;

public enum AuthGrade {
    GUEST(1, "손님"),
    LOGIN(2, "로그인 회원"),
    ADMIN(3, "관리자");

    private final int level;
    private final String desc;
    private final String[] menus = { "메인화면", "이메일 관리 화면", "관리자 화면" };

    AuthGrade(int level, String desc) {
        this.level = level;
        this.desc = desc;
    }

    public int getLevel() {
        return level;
    }

    public String getDesc() {
        return desc;
    }

    public void printInfo() {
        System.out.println("==메뉴 목록==");
        System.out.println("당신의 등급은 " + desc);
        for (int i = 0; i < level; i++) {
            System.out.println("- " + menus[i]);
        }
    }
}
