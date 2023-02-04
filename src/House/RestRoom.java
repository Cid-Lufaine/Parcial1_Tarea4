package House;

public class RestRoom {
    private boolean showerCabin;
    private int width;
    private int height;
    private String color;

    public RestRoom(){};

    public void set_showerCabin(boolean showerCabin) {this.showerCabin = showerCabin;}
    public void set_width(int width) {
        this.width = width;
    }
    public void set_height(int height) {
        this.height = height;
    }
    public void set_color(String color) {
        this.color = color;
    }


    public boolean get_showerCabin(){return showerCabin ;}
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
