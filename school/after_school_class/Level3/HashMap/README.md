# HashMap

- HashSet과는 다르게 key값을 찾아가서 다이렉트로 값을 가져옴.
- Python의 딕셔너리라고 생각하면 편함.
- 선언법 : `HashMap<Key의 자료형, Value의 자료형> 변수명 = new HashMap<>();`
    
    ---
    

## HashMap의 메소드들


### ValueType put(KeyType key, ValueType value)

---

- 해시맵에 데이터를 저장함.
- 첫 번째 매개변수는 해당 데이터의 key 값, 두 번째 매개변수는 해당 key에 해당하는 value 값임.
- 반환하는 값은 해시맵 내에 동일한 key에 해당하는 값이 있다면 그 key에 대한 value를 반환함.
    
    ---
    

### ValueType get(KeyType key)

---

- key값에 대한 value값을 반환함.
    
    ---
    

### ValueType getOrDefault(KeyType key, 0)

---

- key값에 대한 value값을 반환함.
- key값이 없으면 default값인 0을 반환힘.
    
    ---
    

### ValueType remove(KeyType key)

---

- 해시맵에서 key에 해당하는 데이터를 삭제함.
    
    ---
    

### boolean containsKey(KeyType key)

---

- 해시맵 안에 해당 key가 있다면 true, 없다면 false를 반환함.
    
    ---
    

### void clear()

---

- 해시맵 안의 모든 데이터를 삭제함.
    
    ---
    

### boolean isEmpty()

---

- 해시맵 안에 데이터가 없다면 true, 있다면 false를 반환함.
    
    ---
    

### int size()

---

- 해시맵 안에 있는 데이터의 개수를 반환힘.
