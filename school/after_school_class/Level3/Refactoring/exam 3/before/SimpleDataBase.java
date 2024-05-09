package removecontrolflag.before;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SimpleDataBase {

    private Map<String, String> map = new HashMap<String, String>();

    public SimpleDataBase(Reader reader) throws IOException {
        
        // Scanner : 저장 공간이 작아서 입출력이 동시에 됨. - 속도가 느림
        // BufferedReader : Buffer = 임시 저장 공간 -> 저장 공간이 큼 - 한 번에 출력하기 때문에 속도가 빠름
        BufferedReader br = new BufferedReader(reader);

        // 무슨 변수인지는 모르겠지만 false
        boolean flag = false;
        String temp;

        while (!flag) {
            temp = br.readLine();
            if(temp == null) {
                flag = true;
            } else {
                // 무슨 변수인지는 모르겠지만 true
                boolean flag2 = true;

                // String + String 연산 : String값을 새로 만들어서 저장함 -> 비효율적임.
                // StringBuffer : 문자열을 필요할 때에만 저장하고 출력함 -> 효율적임.
                StringBuffer sb1 = new StringBuffer(); // 뭔지는 모르겠지만 저장 공간 2개
                StringBuffer sb2 = new StringBuffer();

                for (int i=0; i<temp.length(); i++) {
                    char temp2 = temp.charAt(i); // 뭔지는 모르겠지만 선언

                    // 어떤 조건인지는 모르겠지만 sb1와 sb2의 저장을 나눔.
                    if(flag2) {
                        if(temp2 == '=') {
                            flag2 = false;
                        } else {
                            sb1.append(temp2);
                        }
                    } else {
                        sb2.append(temp2);
                    }
                }
                String ss1 = sb1.toString();
                String ss2 = sb2.toString();
                map.put(ss1, ss2); // sb1과 sb2는 각각 Value와 Key 값이였음. (이제야 알 수 있음;;)
            }
        }
    }

    public Iterator<String> iterator() {
        return map.keySet().iterator();
    }

    public String getValue(String key) {
        return map.get(key);
    }

    @Override
    public String toString() {
        return map.toString();
    }
}
