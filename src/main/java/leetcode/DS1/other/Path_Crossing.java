package leetcode.DS1.other;

import java.util.HashSet;
import java.util.Set;

/*
https://leetcode.com/problems/path-crossing/

soln: https://leetcode.com/problems/path-crossing/solutions/709243/java-simple-and-straightforward-o-n-solution-using-hashset/

 */
public class Path_Crossing {

    public static boolean isPathCrossing(String path) {

        int x = 0, y = 0;
        Set<String> hset = new HashSet<>();
        hset.add(getPoint(0, 0));
        for (char c : path.toCharArray()) {
            if (c == 'E')
                x++;
            else if (c == 'W')
                x--;
            else if (c == 'N')
                y++;
            else if (c == 'S')
                y--;
            String point = getPoint(x, y);
            if (hset.contains(point))
                return true;
            else
                hset.add(point);
        }
        return false;
    }

    private static String getPoint(int x, int y) {
        return "(" + x + "," + y + ")";
    }

    public static void main(String[] args) {

        System.out.println(isPathCrossing("NES"));
        System.out.println(isPathCrossing("NESWW"));

    }
}
