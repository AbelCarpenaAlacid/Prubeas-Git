package org.example.recetas;

public class Gachamiguer {
    public static String hayGachasmigas(int x){
        if((x/15d) % 1==0){
            return "Gachamigas";
        }
        if((x/3d) % 1==0){
            return "Gacha";
        }
        if((x/5d) % 1==0){
            return "Migas";
        }
        return String.valueOf(x);
    }
}
