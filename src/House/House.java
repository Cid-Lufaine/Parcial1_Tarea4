package House;
public class House {
    private final int MAX_REST_ROOMS =10;
    private int next_rest_room;
    private final int MAX_BED_ROOMS =10;
    private int next_bed_room;
    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private LivingRoom livingRoom;
    private RestRoom []restRooms;
    private BedRoom []bedRooms;
    private Yard yard;
    public House(){
        restRooms= new RestRoom[MAX_REST_ROOMS];
        next_rest_room=0;
        bedRooms = new BedRoom[MAX_BED_ROOMS];
        next_bed_room=0;
    }
    public void set_Kitchen(Kitchen kitchen){this.kitchen=kitchen;}
    public void set_DiningRoom(DiningRoom diningRoom){this.diningRoom = diningRoom;}
    public void set_LivingRoom(LivingRoom livingRoom){this.livingRoom=livingRoom;}
    public void setBedRooms(BedRoom[] bedRooms) {this.bedRooms = bedRooms;}
    public void setRestRooms(RestRoom[] restRooms) {this.restRooms = restRooms;}
    public void set_Yard(Yard yard){this.yard=yard;}

    public Kitchen get_Kitchen(){return kitchen;}
    public DiningRoom get_DiningRoom() {return diningRoom;}
    public LivingRoom get_LivingRoom(){return livingRoom;}
    public BedRoom[] getBedRooms() {return bedRooms;}
    public RestRoom[] getRestRooms() {return restRooms;}
    public Yard getYard() {return yard;}

    public void addRoom(BedRoom bedRoom){
        if(next_bed_room<MAX_BED_ROOMS)
        {
            this.bedRooms[next_bed_room]=bedRoom;
            next_bed_room++;
        }
    }
    public void addRoom(RestRoom restRoom){
        if(next_rest_room<MAX_REST_ROOMS )
        {
            this.restRooms[next_rest_room ]=restRoom;
            next_rest_room++;
        }
    }
}
