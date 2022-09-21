package ss4_class_and_object_in_java;


public class StopWatch {
    private double startTime,endTime;
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }
    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    public void endTime() {
        this.endTime = System.currentTimeMillis();
    }
    public double getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        double[] array;
        array = new double[10000];
        for (int i=0;i<array.length;i++) {
            array[i] = (Math.random() * ((100005-5) +1)) + 5 ;
        }
        for (int j=0;j<array.length-1;j++) {
            for (int k=j+1;k<array.length;k++) {
                int min_idex = j;
                if (array[k] < array[min_idex] ) {
                    min_idex = k;
                }
                double temp = array[min_idex];
                array[min_idex] = array[j];
                array[j] = temp;
            }
        }
        System.out.println("Array element: ");
        for (int m=0;m<=10;m++) {
            System.out.print(array[m] + "\t");
        }
        stopWatch.endTime();
        System.out.println("\n Total runtime: " + stopWatch.getElapsedTime() + " s");
    }
}
// chạy đã thành công