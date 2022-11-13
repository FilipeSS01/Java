public class House{
    private String cor;
    private Boolean door1;
    private Boolean door2;
    private Boolean door3;

    // Get Set
    public String getCor(){
        return this.cor;
    }
    public void setCor(String value){
        this.cor = value;
    }
    public Boolean getDoor1(){
        return this.door1;
    }
    public void setDoor1(Boolean value){
        this.door1 = value;
    }
    public Boolean getDoor2(){
        return this.door2;
    }
    public void setDoor2(Boolean value){
        this.door2 = value;
    }
    public Boolean getDoor3(){
        return this.door3;
    }
    public void setDoor3(Boolean value){
        this.door3 = value;
    }

    // Metodos
    public void paintHouse(String value){
        this.setCor(value);
    }
    public int doorsOpen(){
        int count = 0;
        count+= (this.getDoor1()) ? 1 : 0;
        count+= (this.getDoor2()) ? 1 : 0;
        count+= (this.getDoor1()) ? 1 : 0;
        return count;
    } 



}