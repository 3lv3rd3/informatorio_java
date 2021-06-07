package Lvl_2;

import java.util.ArrayList;
import java.util.List;

public class e5_resumenSemanal {

    public static void main(String[] args){

        List<Integer> hs = new ArrayList<>();
        hs.add(7);
        hs.add(6);
        hs.add(7);
        hs.add(8);
        hs.add(7);
        
        List<Integer> valor = new ArrayList<>();
        valor.add(350);
        valor.add(400);
        valor.add(450);
        valor.add(500);
        valor.add(800);

        List<Integer> total = hs.subList(0, 5);


        for (int i = 0; i < hs.size(); i++){

            total.set(i,(hs.get(i)*valor.get(i)));            
        }

        System.out.println("Subtotal de dinero semanal: " + (total));
        System.out.println("Total final: $" + (total.get(0)+total.get(1)+total.get(2)+total.get(3)+total.get(4)));

    }
    
}
