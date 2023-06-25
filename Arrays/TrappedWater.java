package Arrays;
public class TrappedWater {
    public static int trappedWater(int heigth[]) {
        int n = heigth.length;
        int tw = 0;

        // left - max boundry
        int leftBoundry[] = new int[n];
        leftBoundry[0] = heigth[0];
        for(int i = 1;i < n;i++) {
            leftBoundry[i] = Math.max(heigth[i],leftBoundry[i-1]);
        }

        // right - max boundry
        int rightBoundry[] = new int[n];
        rightBoundry[n-1] = heigth[n-1];
        for(int i = n-2;i >= 0;i--) {
            rightBoundry[i] = Math.max(heigth[i],rightBoundry[i+1]);
        }

        // water level = min ( left max boundry and right max boundry )
        for(int i = 0;i < n;i++) {
            int waterLevel = Math.min(leftBoundry[i],rightBoundry[i]);
            if(waterLevel < heigth[i]) {
                continue;
            }
            // trapped water = water level - height
            tw += (waterLevel - heigth[i]);
        }

        return tw;
    }
    public static void main(String args[]) {
        int water[] = {5,2,0,6,3,2,8};
        int trappedwater = trappedWater(water);
        System.out.println("Water Trapped : "+trappedwater);
    }
}
