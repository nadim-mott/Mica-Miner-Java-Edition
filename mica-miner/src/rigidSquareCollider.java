public class rigidSquareCollider {
    private int[] coordinates;
    private int length;
    private int height;

    public boolean place_meeting(int x, int y, collider contact) {
        // TODO implement function
        for int
    }

    public boolean point_meeting(int x, int y) {
        if ((this.coordinates[0] <= x && x <= this.coordinates[0] + length && this.coordinates[1] <= y && y <= this.coordinates[1] + height)){
            return true;
        } else {
            return false;
        }
    } 

    public boolean point_meeting(int[] point){
        return point_meeting(point[0], point[1]);
    }

    public void react_to(collider contact) {
        // TODO Auto-generated method stub
        
    }
}
