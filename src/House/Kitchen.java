package House;


public class Kitchen {
    private boolean stove;
    private boolean sink;
    private int windows;
    private boolean refrigerator;
    private boolean oven;
    private int width;
    private int height;
    private String color;

    public Kitchen(){}

    public void set_stove(boolean stove){
        this.stove=stove;
    }
    public void set_sink(boolean sink) {
        this.sink = sink;
    }
    public void set_windows(int windows) {
        this.windows = windows;
    }
    public void set_refrigerator(boolean refrigerator) {this.refrigerator = refrigerator; }
    public void set_oven(boolean oven) {
        this.oven = oven;
    }
    public void set_width(int width) {
        this.width = width;
    }
    public void set_height(int height) {
        this.height = height;
    }
    public void set_color(String color) {
        this.color = color;
    }

    public boolean get_stove() {
        return stove;
    }
    public boolean get_sink() {
        return  sink;
    }
    public int get_windows() {
        return windows ;
    }
    public boolean get_refrigerator() {
        return refrigerator;
    }
    public boolean get_oven() {
        return oven;
    }
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
