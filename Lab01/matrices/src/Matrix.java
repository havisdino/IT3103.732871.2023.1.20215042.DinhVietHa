// Dinh Viet Ha 20215042
// Ex 6.6

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matrix {
    private final List<List<Integer>> value;

    Matrix(List<List<Integer>> value) {
        this.value = value;
    }

    public int[] size() {
        return new int[]{value.size(), value.get(0).size()};
    }

    public List<List<Integer>> getValue() {
        return value;
    }

    public Integer get(int row, int col) {
        return value.get(row).get(col);
    }

    public Matrix add(Matrix x) {
        // Assertion to ensure 2 matrices having the same size
        assert Arrays.equals(this.size(), x.size()) : "The 2 matrices should have the same size";

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < this.size()[0]; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < this.size()[1]; j++) {
                row.add(get(i, j) + x.get(i, j));
            }
            result.add(row);
        }
        return new Matrix(result);
    }
}
