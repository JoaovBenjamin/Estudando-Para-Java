import java.util.Arrays;

public class Vetor4 {
    public static void main(String[] args) {
        int vet [] = {3,7,6,1,9,4,2};
        for (int v:vet) {
            System.out.print(v + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet,3);
        System.out.println("Encontrei o valor na posição: "+p);

    }
}
