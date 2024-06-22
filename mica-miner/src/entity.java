public class entity {
    // Coordinates:
    private int[] coords;
    // Scalling:
    private float[] scale;
    // Rotation:
    private float orientation;
    private int[] axis_of_rotation;
    public collider collision;
    

    public entity(){

    }
    
    /* ==== Coordinate manipulation functions: ==== */
    public void set_x(int new_x){
        // Sets the x coordinate of your sprite to new_x
        this.coords[0] = new_x;
    }
    public void set_y(int new_y){
        // Sets the y coordinate of your sprite to new_y
        this.coords[1] = new_y;
    }
    public void set_coordinates(int new_x, int new_y){
        // Simultaneously changes the x and y coordinates of your sprite
        set_x(new_x);
        set_y(new_y);
    }
    public void set_coordinates(int[] new_coords){
        this.coords = new_coords;
    }
    public void increment_x(int increment_amount){
        set_x(this.coords[0] + increment_amount);
    }
    public void increment_y(int increment_amount){
        set_y(this.coords[1] + increment_amount);
    }



}
