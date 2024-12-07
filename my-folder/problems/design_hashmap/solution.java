class MyHashMap {
    private Map<Integer, Integer> MyHashMap;
    public MyHashMap() {
        
        MyHashMap = new HashMap<>(); 
    }
    
    public void put(int key, int value) {
        if(MyHashMap.containsKey(key)) MyHashMap.replace(key,value);
        else MyHashMap.put(key,value);
    }
    
    public int get(int key) {
        if(MyHashMap.containsKey(key)){
            return(MyHashMap.get(key));
        }
        return -1;
    }
    
    public void remove(int key) {
        if(MyHashMap.containsKey(key)) MyHashMap.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */