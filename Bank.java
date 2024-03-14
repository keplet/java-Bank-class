/*
 * @Author Keplet Saintil
 * Date: 13/03/2024
 * @Description: This is a project I started working on for my Java learning path.
 */
public class Bank {
    //Fields
    protected String     name;
    protected String     location;
    protected int        code;
    //Constructor
    public Bank(String name, String location, int code){
        this.name       = name;
        this.location   = location;
        this.code       = code;
    }
    //get bank name
    public void getBank(){
        System.out.println(this.name);
    }
    //get location
    public void getLocation(){
        System.out.println(this.location);
    }

}
