package srp2;

import java.util.List;

public class GradeCalculator {
    public double calculateAverage(List<Integer> grades) {
        double sum = 0;
        for (int g : grades) sum += g;
        return sum / grades.size();
    }
}
