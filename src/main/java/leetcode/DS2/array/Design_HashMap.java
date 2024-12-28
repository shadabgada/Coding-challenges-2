package leetcode.DS2.array;

import java.util.Arrays;

/*
https://leetcode.com/problems/design-hashmap/description/
solution: https://leetcode.com/problems/design-hashmap/solutions/1097755/js-python-java-c-updated-hash-array-solutions-w-explanation/
 */
public class Design_HashMap {

    int[] data;

    public Design_HashMap() {
        data = new int[1000000];
        Arrays.fill(data, -1);
    }

    public void put(int key, int value) {
        data[key] = value;
    }

    public int get(int key) {
        return data[key];
    }

    public void remove(int key) {
        data[key] = -1;
    }
}
