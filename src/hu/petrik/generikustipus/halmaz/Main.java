package hu.petrik.generikustipus.halmaz;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

       try {
//           BuszAtszallas atszallas_102_105=new BuszAtszallas("files/102.txt", "files/105.txt");
//           Halmaz<String> kozosMegallok_102_105=atszallas_102_105.kozosMegallok();
//           System.out.printf("%d megálló van, ahol a 102-es buszról a 105-ös buszra átszállhatunk. Ezek a megállók: %s", kozosMegallok_102_105.getSize(), kozosMegallok_102_105);
            Lotto lottoSzamok=new Lotto("files/lottosz.dat");
           boolean Van_v_Nincs=lottoSzamok.getLottoSzamok();
           System.out.printf("%s olyan szám amit nem húztak ki",lottoSzamok.getLottoSzamok()?"Van": "Nincs");
       }catch (FileNotFoundException e){
           System.out.println("Nem találhatóak a forrásfájlok");
       }
    }
}
