package House;

public class LivingRoom {
    private int windows;
    private boolean tv;
    private boolean homeTeather;
    private int width;
    private int height;
    private String color;
    public LivingRoom(){}


    public void set_windows(int windows) {
        this.windows = windows;
    }
    public void set_tv(boolean tv){this.tv = tv;}
    public void set_homeTeather( boolean homeTeather){this.homeTeather=homeTeather;};
    public void set_width(int width) {
        this.width = width;
    }
    public void set_height(int height) {
        this.height = height;
    }
    public void set_color(String color) {
        this.color = color;
    }


    public int get_windows() {return windows ;}
    public boolean get_tv(){return tv ;}
    public boolean get_homeTheater( ){return homeTeather ; };
    public int get_width() {
        return width;
    }
    public int get_height() {
        return height ;
    }
    public String get_color() {
        return color ;
    }
}
