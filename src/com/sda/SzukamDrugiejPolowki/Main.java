package com.sda.SzukamDrugiejPolowki;

public class Main {

    public static void main(String[] args) {
        int[] tab = {1, 2, 4, 6, 7};

        int p = tab.length;
        int x = 1; // szukany element
        int l = 1; //
        boolean ending = false;

        while (!ending) {
            if (l > p) {
                System.out.println("nie odnaleziono elementu o wartosci " + x);
                ending = true;
            }
            else {
                int s = (l + p - 1) / 2;  // ustawiamy srodkowy index tab
                if (tab[s] == x) {
                    System.out.println("Odnaleziono " + x + " pod indeksem " + s);
                    ending = true;
                }
                else if (tab[s] > x) {
                    p = s - 1;
                }
                else {
                    l = s + 1;
                }
            }
        }
    }
}
