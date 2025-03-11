//Given a route containing 4 directions(E,W,N,S)
//Find the shortest path to reach destination "WNEENESENNN"
// N ^  - y+1
// S    - y-1
// W <  - x-1
// E >  - x+1
public class ShortPathDirection {
    public static void main(String[] args) {
        String dest = "WNEENESENNN";
        shortestPath(dest);
    }

    public static void shortestPath(String dest) {
        int x = 0, y = 0;
        for (int i = 0; i < dest.length(); i++) {
            if (dest.charAt(i) == 'N') {
                y++;
            } else if (dest.charAt(i) == 'S') {
                y--;
            } else if (dest.charAt(i) == 'E') {
                x++;
            } else {
                x--;
            }
        }
        double sPath = Math.sqrt((x * x) + (y * y));
        System.out.println("The shortest path is : " + sPath);
    }
}
