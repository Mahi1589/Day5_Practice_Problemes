package com.bridgelabzpracticeproblem;

public class FlipCoin {
    public static void main(String[] args) {
        System.out.println("enter number of times flip coin");
        double flipcoin = Math.floor(Math.random() * 10) % 2;
      if ( flipcoin < 0.5){
          System.out.println("coin is tails");
      } else {
          System.out.println("coin is heads");
      }

    }
}
