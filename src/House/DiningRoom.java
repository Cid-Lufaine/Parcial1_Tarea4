package House;

public class DiningRoom {
    private int windows;
    private boolean tv;
    private int width;
    private int height;
    private String color;
    private int chairsCapacity;

    public DiningRoom(){};

    public void set_windows(int windows) {
        this.windows = windows;
    }
    public void set_tv(boolean tv){this.tv = tv;}
    public void set_width(int width) {
        this.width = width;
    }
    public void set_height(int height) {
        this.height = height;
    }
    public void set_color(String color) {
        this.color = color;
    }

    public void set_chairsCapacity(int chairsCapacity) {
        this.chairsCapacity = chairsCapacity;
    }

    public int get_windows() {return windows ;}
    public boolean get_tv(){return tv ;}
    public int get_width() {
        return width;
    }
    public int get_height() {
        return height ;
    }
    public String get_color() {
        return color ;
    }
    public int get_chairsCapacity() {
        return chairsCapacity ;
    }
}
