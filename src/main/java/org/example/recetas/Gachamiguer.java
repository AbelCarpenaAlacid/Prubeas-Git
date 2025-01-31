package org.example.recetas;

public class Gachamiguer {
    public static void hayGachasmigas(){
        for(int x = 1; x <= 100; x++){
            if(x%15==0){
                System.out.println("Gachamiga");
                continue;
            }
            if(x%3==0){
                System.out.println("Gacha");
                continue;
            }
            if(x%5==0){
                System.out.println("Miga");
                continue;
            }
            System.out.println(x);
        }
    }
}
