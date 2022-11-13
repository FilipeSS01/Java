package House;
public class Doors {
    private String cor;
    private Boolean aberta;
    private Double dimensaoX;
    private Double dimensaoY;
    private Double dimensaoZ;

    // Gets
    public String getCor(){
        return this.cor;
    }
    public Boolean getAberta(){
        return this.aberta;
    }
    public Double getDimensaoX(){
        return this.dimensaoX;
    }
    public Double getDimensaoY(){
        return this.dimensaoY;
    }
    public Double getDimensaoZ(){
        return this.dimensaoZ;
    }
    // Sets
    public void setCor(String value){
        this.cor = value;
    }
    public void setAberta(Boolean value){
        this.aberta = value;
    }    
    public void setDimensaoX(Double value){
        this.dimensaoX = value;
    }
    public void setDimensaoY(Double value){
        this.dimensaoY = value;
    }
    public void setDimensaoZ(Double value){
        this.dimensaoZ = value;
    }

    // Metodos
    public void toggleDoors(){
        this.setAberta(!this.aberta);
    }
    public void paintDoors(String value){
        this.setCor(value);
    }
    public Boolean statusDoors() {
        return this.getAberta();
    }
}