


        import java.util.Random;
        import java.util.Scanner;
        import java.util.ArrayList;
public class jakub
{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int znova2 = 0;
        int znova = 0;
        int znova1 = 0;

        ArrayList<String> tmajitel = new ArrayList<String>();
        ArrayList<Long> tcislo = new ArrayList<Long>();
        Random rng = new Random();



        System.out.print("koľko chceš čísiel");
        int aaa = myObj.nextInt();
for(;znova2==0;) {
    System.out.print("ak chceš zadať tel.č. ručne zadaj 1,ak chceš vytvoriť tel.č. náhodne zadaj 2 ");
    int bbb = myObj.nextInt();

    if (bbb == 1) {
        for (int a = 0; a < aaa;a++ ) {
            znova2 =1;
            System.out.println("zadaj majitela");
            String name = myObj.nextLine();
            tmajitel.add(name);



            System.out.println("zadaj cislo");
            Long cislo = myObj.nextLong();
            tcislo.add(cislo);
            System.out.println(cislo);
        }
    } else if (bbb == 2) {
        for (int a = 0; a < aaa;a++ ) {
            znova2 =1;
            System.out.println("zadaj majitela");
            String name = myObj.nextLine();
            tmajitel.add(name);


            
            String cisloS = "";
            for(int i = 0; i < 10; i ++)
                cisloS += rng.nextInt(10) ;
            Long cislo = Long.parseLong(cisloS);
            tcislo.add(cislo);


        }
    } else {
        znova2 = 0;
        System.out.println("neplatná operácia , skús to znova");
    }
}
        for (; znova == 0; ) {
            for (; znova1 == 0; ) {
                System.out.println("vyber čo chceš robiť s programom");
                System.out.println("ak chceš vypísať všetky čísla a majiteľov, napíš 1");
                System.out.println("ak chceš prepísať číslo a vypísať majiteľa, napíš 2");
                System.out.println("ak chceš pripísať majiteľa a jeho  číslo, napíš 3");
                System.out.println("ak chceš zmazať čísla a nove napísať, napíš 4");
                System.out.println("ak chceš vypísať konkrétneho majiteľa a jeho číslo ,napíč 5");
                int ccc = myObj.nextInt();


                switch (ccc) {
                    case 1:
                        znova1 = 1;
                        System.out.println(tmajitel);
                        System.out.println(tcislo);

                        break;
                    case 2:
                        znova1 = 1;
                        System.out.print("napíš index svojho čísla");
                        int abcd = myObj.nextInt();
                        tcislo.remove(abcd);
                        System.out.print("zadaj nové číslo");
                        int op = myObj.nextInt();
                        tcislo.set(abcd,(long) op );
                        System.out.println(op);
                        System.out.println(tmajitel.get(abcd));

                        break;
                    case 3:
                        znova1 = 1;
                        System.out.print("zadaj majitela");
                        String name = myObj.nextLine();
                        tmajitel.add(name);

                        System.out.print("zadaj cislo");
                        long cislo = myObj.nextInt();
                        tcislo.add(cislo);
                        break;
                    case 4:
                        znova1 = 1;
                        tcislo.clear();
                        for (int a = 0; a < aaa;a++ ) {
                            System.out.print("zadaj cislo");
                            Long cislo1 = myObj.nextLong();
                            tcislo.add(cislo1);
                        }
                    case 5:
                        znova1 = 1;
                            System.out.print("napíš index svojho majiteľa");
                            int abcde = myObj.nextInt();
                            System.out.println(tmajitel.get(abcde));
                            System.out.println(tcislo.get(abcde));
                        break;
                    default:
                        System.out.print("nesprávna operácia skús to znova");
                        znova1 = 0;
                        break;
                }
            }
            System.out.print("ak chceš ešte pracovať s programom stlač 1 , ak nie stlač hoci ake íné číslo");

    int ddd = myObj.nextInt();
        if (ddd == 1) {znova = 0; }
        else znova = 1;
    }
    { System.out.println("koniec");}


    }
}