public class Contabil {

    int numere[] = new int[20];

    int min;
    int max;

    public Contabil(int value[]) {
        numere = value;
    }

    public void setNumere(int value[]) {
        numere = value;
    }

    public int[] getNumere() {
        return numere;
    }

    public int calculeazaMinim() {
        min = numere[0];

        for (int i = 0; i < numere.length; i++) {
            if(min > numere[i]) {
                min = numere[i];
            }
        }

        return min;
    }

    public int calculeazaMax() {
        max = numere[0];

        for (int i = 0; i < numere.length; i++) {
            if(max < numere[i]) {
                max = numere[i];
            }
        }

        return max;
    }
}
