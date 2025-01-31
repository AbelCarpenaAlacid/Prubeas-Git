package org.example.recetas;

public class Gachasmiguero {
    public static String catar(int ingrediente){
        if((ingrediente/15d) % 1==0){
            return "Gachamigas";
        }
        if((ingrediente/3d) % 1==0){
            return "Gacha";
        }
        if((ingrediente/5d) % 1==0){
            return "Migas";
        }
        return String.valueOf(ingrediente);
    }
}
