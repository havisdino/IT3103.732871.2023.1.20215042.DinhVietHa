// Dinh Viet Ha 20215042
// Ex 6.6

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> a = new ArrayList<>();
        List<List<Integer>> b = new ArrayList<>();
        a.add(new ArrayList<>(List.of(1, 2, 3)));
        b.add(new ArrayList<>(List.of(4, 5, 6)));
        Matrix aMat = new Matrix(a);
        Matrix bMat = new Matrix(b);
        Matrix cMat = aMat.add(bMat);
        System.out.println(cMat.getValue());
    }
}