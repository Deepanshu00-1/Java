import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Beetle{
    public static void main(String[] args) {
        // Example coordinates of the beetle and honey spots
        List<int[]> points = new ArrayList<>(Arrays.asList(
            new int[]{1, 1, 1}, 
            new int[]{2, 2, 10}, 
            new int[]{5, 5, 5}, 
            new int[]{8, 8, 8}
        ));
        
        double totalDistance = 0.0;
        for (int i = 0; i < points.size() - 1; i++) {
            int[] p1 = points.get(i);
            int[] p2 = points.get(i + 1);
            
            if (sameFace(p1, p2)) {
                double radius = calculateDistance(p1, p2) / 2;
                double arcLength = calculateArcLength(radius);
                totalDistance += Math.round(arcLength * 100.0) / 100.0;
            } else {
                double shortestPath = calculateShortestPath(p1, p2);
                totalDistance += Math.round(shortestPath * 100.0) / 100.0;
            }
        }
        
        System.out.println("Total distance travelled by the beetle: " + totalDistance + " cm");
    }
    
    public static boolean sameFace(int[] p1, int[] p2) {
        return (p1[0] == p2[0] && p1[1] == p2[1]) || 
               (p1[1] == p2[1] && p1[2] == p2[2]) || 
               (p1[0] == p2[0] && p1[2] == p2[2]);
    }
    
    public static double calculateArcLength(double radius) {
        double angleInRadians = Math.PI / 3; // 60 degrees in radians
        return radius * angleInRadians;
    }
    
    public static double calculateDistance(int[] p1, int[] p2) {
        return Math.sqrt(Math.pow(p2[0] - p1[0], 2) +
                         Math.pow(p2[1] - p1[1], 2) +
                         Math.pow(p2[2] - p1[2], 2));
    }
    
    public static double calculateShortestPath(int[] p1, int[] p2) {
        // This method calculates the shortest path between two points on the surface of the cube.
        // As the beetle cannot travel along the bottom face (z=0), this simplifies the path calculation.
        // Adjust the formula based on the specific path required in your scenario.
        return calculateDistance(p1, p2); // Simplified for illustration purposes
    }
}
