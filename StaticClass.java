package JavaTest;



public class StaticClass {
    private static int id;

    public static void increase(){
        id++;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
