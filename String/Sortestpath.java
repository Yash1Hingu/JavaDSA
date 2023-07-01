package String;

public class Sortestpath {
    public static float getShortestPath(String str) {
        int x = 0,y = 0;
        for(int i = 0;i < str.length();i++) {
            char dir = str.charAt(i);
            if(dir == 'N') {
                // North
                y++;
            } else if(dir == 'S') {
                // South
                y--;
            } else if(dir == 'W') {
                // West
                x--;
            } else {
                // East
                x++;
            }
        }

        return (float) Math.sqrt((Math.pow(x,2)) + (Math.pow(y,2)));
    }
    public static void main(String args[]) {
        String str = "WNEENESENNN";
        System.out.println("Shortest Path From Origin is : " + getShortestPath(str));
    }
}
