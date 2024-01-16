package ra.bt3;

public class StopWatch {
    private  long startTime;
    private  long endTime ;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {

        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public long getElapsedTime(){
        return endTime -startTime;
    }
    public  void stop(){
        endTime = System.currentTimeMillis();
    }

}