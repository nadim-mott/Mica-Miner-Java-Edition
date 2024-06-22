public interface collider {
    public void react_to(collider contact);
    public boolean point_meeting(int x, int y);
    public boolean point_meeting(int[] point);

    
    
}