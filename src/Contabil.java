public class Contabil {

    int numere[];

    int min;
    int max;

    public Contabil() {

    }

    public Contabil(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setNumere(int value[]) {
        numere = value;
    }

    public int[] getNumere() {
        return numere;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
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
