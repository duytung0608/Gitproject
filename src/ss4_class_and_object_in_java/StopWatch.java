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
        array = new double[100000];
        for (int i=0;i<array.length;i++) {
            array[i] = (Math.random() * ((100005-5) +1)) + 5 ;
        }
        for (int j=0;j<array.length-1;j++) {
            int min_idx = j;
            for (int k=j+1;k<array.length;k++) {
                if (array[k] < array[min_idx] ) {
                    min_idx = k;
                }
                double temp = array[min_idx];
                array[min_idx] = array[j];
                array[j] = temp;
            }
        }
        System.out.println("Array element: ");
        for (int m=0;m<=10;m++) {
            System.out.print(array[m] + "\t");
        }
        stopWatch.endTime();
        System.out.println(stopWatch.getElapsedTime());
    }
}
// chạy không thành công