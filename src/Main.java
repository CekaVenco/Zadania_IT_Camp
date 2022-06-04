public class Main {
    public static void main(String[] args) {
        int j = 5;
        int p = 3;
        int z = 3;

        System.out.println("Ilość jabłek: "+j + " Ilość pomarańczy: "+p + " Ilość montet przed zakupami: "+z);

        for (int i = z; 0 < z; z--) {
            if(j>p){
                p++;
            }
            else if(j<p){
                j++;
            }
            else{
                j++;
            }

        }
        System.out.println("Ilość jabłek: "+j + " Ilość pomarańczy: "+p + " Ilość montet po zakupach: "+z);
    }
}
