package Model;

import java.util.PriorityQueue;

public class TurnQueue {

    private static TurnQueue instance;
    private final PriorityQueue<TurnModel> queue;

    private TurnQueue() {
        queue = new PriorityQueue<>((t1, t2) -> {
            int cmp = Integer.compare(t1.getPriority(), t2.getPriority());
            if (cmp != 0) return cmp;                             
            return t1.getGenerationTime().compareTo(t2.getGenerationTime()); 
        });
    }

    public static TurnQueue getInstance() {
        if (instance == null) instance = new TurnQueue();
        return instance;
    }

    public synchronized void addTurn(TurnModel t) { queue.add(t); }
    public synchronized TurnModel pollNext()      { return queue.poll(); }
    public synchronized boolean isEmpty()    { return queue.isEmpty(); }
    public synchronized int size()           { return queue.size(); }
}