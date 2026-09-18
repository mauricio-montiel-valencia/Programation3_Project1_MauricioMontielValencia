package Model;

import java.time.LocalDateTime;

public class TurnModel {


    private int number;
    private String type;        
    private int priority;       
    private LocalDateTime generationTime;
    private String status;      

    public TurnModel(int number, String type, int priority, LocalDateTime generationTime) {
        this.number = number;
        this.type = type;
        this.priority = priority;
        this.generationTime = generationTime;
        this.status = "waiting";
    }

    public int getNumber()                  { return number; }
    public String getType()                 { return type; }
    public int getPriority()                { return priority; }
    public LocalDateTime getGenerationTime(){ return generationTime; }
    public String getStatus()               { return status; }
    public void setStatus(String status)    { this.status = status; }

    @Override
    public String toString() {
        return String.format("%02d [%s] prio=%d", number, type, priority);
    }
}

