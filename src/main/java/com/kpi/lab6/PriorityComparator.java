package com.kpi.lab6;

import java.util.Comparator;

/**
 * Created by vlad on 02.04.17.
 */
public class PriorityComparator implements Comparator<QueuePerson> {
    public int compare(QueuePerson o1, QueuePerson o2) {
        if (o1.getPriority() > o2.getPriority())
            return 1;
        else if (o1.getPriority() < o2.getPriority())
            return -1;
        else
            return 0;
    }
}
