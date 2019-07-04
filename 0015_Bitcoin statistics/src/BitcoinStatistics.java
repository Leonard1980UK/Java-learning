
import java.util.*;
import java.util.stream.*;

public class BitcoinStatistics {
    public static void main(String[] args) {
        double[][] data = {
                {423.0,5377.0,8527.0,7637.0,4531.0,4835.0,5598.0,7470.0,3577.0,2741.0,1580.0,4437.0,5134.0,9336.0,2378.0,4601.0,6001.0},
                {4693.0,5457.0,7746.0,2167.0,1899.0,1040.0,6957.0,2247.0,4410.0,551.0,6023.0,6271.0,8647.0,1589.0,132.0,3119.0},
                {5130.0,5554.0,8654.0,79.0,8521.0,5077.0,3112.0,8755.0,4091.0,2912.0,902.0,5356.0,8561.0,8461.0,2348.0},
                {3889.0,4073.0,9307.0,2532.0,5937.0,7263.0,5671.0,1001.0,1538.0,9951.0,82.0,5556.0,7172.0,2699.0,9879.0,8432.0},
                {3822.0,1683.0,9141.0,9505.0,6185.0,9214.0,2510.0,3244.0,6875.0,2872.0,6264.0,7655.0,749.0,3454.0,4042.0,1356.0,759.0}

        };
        double[][] res = getMinAvgMax(5,data);
        int index = 0;
        for (double[] period: res) {
            System.out.println("array "+ index + " = " + (int)period[0] + "," + (int)period[1] + "," + (int)period[2]);
            index++;
        }
    }

    /**
     *
     * @param discard
     * @param data
     * @return
     */
    public static double[][] getMinAvgMax(int discard, double[][] data) {
        double[][] result = new double[data.length + 1][3];
        int index = 0;
        DoubleStream  stream = DoubleStream.of();
        for (double period[]:data) {
            double[] discardedData = discardData(discard,period);
            result[index][0] = minValue(discardedData);
            result[index][1] = average(discardedData);
            result[index][2] = maxValue(discardedData);
            stream = DoubleStream.concat(stream, Arrays.stream(discardedData));
            index++;
        }
        double[] mergedData = stream.toArray();
        result[data.length][0] = minValue(mergedData);
        result[data.length][1] = average(mergedData);
        result[data.length][2] = maxValue(mergedData);

        return result;
    }

    /**
     *
     * @param data
     * @return
     */
    public static double minValue(double data[]){
        OptionalDouble min = Arrays.stream(data).min();
        if (min.isPresent()){
            return min.getAsDouble();
        }else {
            return 0.0;
        }
    }

    /**
     *
     * @param data
     * @return
     */
    public static double maxValue(double data[]){
        OptionalDouble max = Arrays.stream(data).max();
        if (max.isPresent()){
            return max.getAsDouble();
        }else {
            return 0.0;
        }
    }

    /**
     *
     * @param data
     * @return
     */
    public static double average(double data[]){
        double sum = Arrays.stream(data).sum();
        return sum/data.length;
    }

    /**
     *
     * @param discard
     * @param data
     * @return
     */
    public static double[] discardData(int discard, double[] data) {
        return Arrays.copyOfRange(data ,discard-1 ,data.length - discard );
    }

}
