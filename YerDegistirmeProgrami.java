package org.example;

import java.util.HashSet;
import java.util.Set;

public class YerDegistirmeProgrami {

    public static void main(String[] args) {
        String ifade = "merhaba";

        Set<String> kelimeler = tumKelimeleriGetir(ifade);

        System.out.println("Girilen ifadenin harfleri yer değiştirilerek oluşturulabilecek kelimeler:");
        for (String kelime : kelimeler) {
            System.out.println(kelime);
        }
    }

    private static Set<String> tumKelimeleriGetir(String ifade) {
        Set<String> kelimeler = new HashSet<>();

        for (int i = 0; i < ifade.length(); i++) {
            for (int j = i + 1; j <= ifade.length(); j++) {
                char[] harfDizisi = ifade.toCharArray();
                degistir(harfDizisi, i, j);
                kelimeler.add(new String(harfDizisi));
            }
        }

        return kelimeler;
    }

    private static void degistir(char[] ifade, int i, int j) {
        char gecici = ifade[i];
        ifade[i] = ifade[j];
        ifade[j] = gecici;
    }
}
