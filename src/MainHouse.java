

import House.Doors;
import House.House;

public class MainHouse{
    public static void main(String [] args){
        // Programa 1
        Doors door = new Doors();
        door.setAberta(true);
        door.setCor("Vermelha");
        door.setDimensaoX(10.0);
        door.setDimensaoY(10.0);
        door.setDimensaoZ(10.0);
        System.out.println("===================== Projeto 1 =========================");
        System.out.println("Cor: " + door.getCor());
        System.out.println(door.statusDoors() ? "Porta: Aberta" : "Porta: Fechada");
        System.out.println("Dimensão X: " + door.getDimensaoX());
        System.out.println("Dimensão Y: " + door.getDimensaoY());
        System.out.println("Dimensão Z: " + door.getDimensaoZ());

        door.paintDoors("Amarelo");
        door.toggleDoors();
        System.out.println("\nCor: " + door.getCor());
        System.out.println(door.statusDoors() ? "Porta: Aberta" : "Porta: Fechada");
        System.out.println("Dimensão X: " + door.getDimensaoX());
        System.out.println("Dimensão Y: " + door.getDimensaoY());
        System.out.println("Dimensão Z: " + door.getDimensaoZ());
        System.out.println("=========================================================\n");

        // Programa 2
        House house = new House();
        house.setCor("Rosa");
        house.setDoor1(true);
        house.setDoor2(false);
        house.setDoor3(false);

        house.paintHouse("Verde Neon");
        System.out.println("===================== Projeto 2 =========================");
        System.out.println("Cor: " + house.getCor());
        System.out.println("Portas abertas: " + house.doorsOpen());
        System.out.println("=========================================================");

    }
}