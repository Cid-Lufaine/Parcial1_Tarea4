package House;

public class Yard {
    private boolean grass;
    private int width;
    private int height;
    private String color;

    public Yard(){};

    public void set_grass(boolean grass) {this.grass = grass;}
    public void set_width(int width) {
        this.width = width;
    }
    public void set_height(int height) {
        this.height = height;
    }
    public void set_color(String color) {
        this.color = color;
    }


    public boolean get_grass(){return grass ;}
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
