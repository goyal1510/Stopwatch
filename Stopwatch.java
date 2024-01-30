public class Stopwatch {
    private long startTime;
    private long stopTime;
    private boolean running;

    public void start() {
        if (!running) {
            startTime = System.currentTimeMillis();
            running = true;
            System.out.println("Stopwatch started.");
        } else {
            System.out.println("Stopwatch is already running.");
        }
    }

    public void stop() {
        if (running) {
            stopTime = System.currentTimeMillis();
            running = false;
            System.out.println("Stopwatch stopped.");
        } else {
            System.out.println("Stopwatch is not running.");
        }
    }

    public long getElapsedTime() {
        if (running) {
            return System.currentTimeMillis() - startTime;
        } else {
            return stopTime - startTime;
        }
    }

    public void reset() {
        startTime = 0;
        stopTime = 0;
        running = false;
        System.out.println("Stopwatch reset.");
    }

    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        // Simulating some process...
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stopwatch.stop();
        System.out.println("Elapsed time: " + stopwatch.getElapsedTime() + " milliseconds");
        stopwatch.reset();
    }
}