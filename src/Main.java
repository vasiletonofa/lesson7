import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int x = 2; // 0
        int y = 3; // 1
        int z = 2; // 2
        int f = 3; // 3
        int g = 2; // 4

//        System.out.println("listaDeVarsteAngajati[0]: " + listaDeVarsteAngajati[0]);
//        System.out.println("listaDeVarsteAngajati[1]: " + listaDeVarsteAngajati[1]);
//        System.out.println("listaDeVarsteAngajati[2]: " + listaDeVarsteAngajati[2]);
//        System.out.println(listaDeVarsteAngajati.length);
//
//        System.out.println("Primul element: " + listaDeVarsteAngajati[0]);  // listaDeVarsteAngajati[2]
//        System.out.println("Mijloc element: " + listaDeVarsteAngajati[listaDeVarsteAngajati.length / 2]);  // listaDeVarsteAngajati[2]
//        System.out.println("Ultimul element: " + listaDeVarsteAngajati[listaDeVarsteAngajati.length - 1]);  // listaDeVarsteAngajati[2]

        String listaNume[] = new String[6];
        listaNume[0] = "Ion";
        listaNume[1] = "Vasile";
        listaNume[2] = "Andrei";


//        System.out.println("listaNume[0]: " + listaNume[0]);
//        System.out.println("listaNume[1]: " + listaNume[1]);
//        System.out.println("listaNume[2]: " + listaNume[2]);


//        System.out.println(listaNume[0]);

        Contabil contabil2 = new Contabil();
        contabil2.setMin(-1);
        contabil2.setMax(3);

        int listaDeVarsteAngajati[] = {22, 2, 1, 50, 51, -3, 53, 54, 55};

        Contabil contabil = new Contabil();
        contabil.setNumere(new int[]{22, 2, 1, 50, 51, -3, 53, 54, 55});

        System.out.println("Min: " + contabil.calculeazaMinim());
        System.out.println("Max: " + contabil.calculeazaMax());

        int[][] val = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for(int i = 0; i < val.length; i++) {  // parcurge liniile
            for (int j = 0; j < val[i].length; j++) {  // parcurge coloanele
                System.out.print(val[i][j] + " ");
            }

            System.out.println();
        }

    }
}