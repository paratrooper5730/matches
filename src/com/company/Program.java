package com.company;
import javax.swing.*;

public class Program {
    public static void main (String [] args) {
        String playerguess = JOptionPane.showInputDialog("Сумма выбора Игрока : ");
        int playerguesstrue;
        while (1 == 1){
            if (playerguess.equals("1")){
                playerguesstrue = Integer.parseInt(playerguess);
                break;
            }
            else ; {
                JOptionPane.showMessageDialog(null, "Введите ЧИСЛО!!!!");
                playerguess = JOptionPane.showInputDialog("Сумма выбора Игрока : ");
            }
            System.out.println("Сумма выбора Игрока : " + playerguess);
        }
        System.out.println(playerguesstrue);
    }
}