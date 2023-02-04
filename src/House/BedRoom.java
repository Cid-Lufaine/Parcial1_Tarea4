package House;

public class BedRoom {
    private BedSize bedSize;
    private boolean tv;
    private int width;
    private int height;
    private String color;

    public BedRoom(){};

    public void set_BedSize(BedSize bedSize) {
        this.bedSize = bedSize;
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


    public BedSize get_BedSize() {return bedSize ;}
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
}
