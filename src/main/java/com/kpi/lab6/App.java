package com.kpi.lab6;

import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * Created by vlad on 02.04.17.
 */
public class App {

    public static void main(String[] args) {
        AddressValue addressValue1 = new AddressValue("Kiev", "Kreshatyk", "68", 68);
        AddressValue addressValue2 = new AddressValue("Kiev", "Podol", "62", 6);
        AddressValue addressValue3 = new AddressValue("Kiev", "Independence", "61", 8);
        AddressValue addressValue4 = new AddressValue("Kiev", "Holovka", "64", 4);
        AddressValue addressValue5 = new AddressValue("Kiev", "Peremohy", "65", 0);

        QueuePerson queuePerson1 = new QueuePerson("Ivanov", "Ivan", "Ivanovich", addressValue1, 0);
        QueuePerson queuePerson2 = new QueuePerson("Ivanova", "Ivanna", "Ivanovna", addressValue2, 2);
        QueuePerson queuePerson3 = new QueuePerson("Vasin", "Vasya", "Ivanovich", addressValue3, 0);
        QueuePerson queuePerson4 = new QueuePerson("Ivanov", "Ivan", "Ivanovich", addressValue4, 1);
        QueuePerson queuePerson5 = new QueuePerson("Vasina", "Vasilisa", "Vasiliyevna", addressValue4, 3);

        TreeSet<QueuePerson> treeSet = new TreeSet<QueuePerson>();


        treeSet.add(queuePerson1);
        treeSet.add(queuePerson2);
        treeSet.add(queuePerson3);
        treeSet.add(queuePerson4);
        treeSet.add(queuePerson5);


        PriorityComparator priorityComparator = new PriorityComparator();
        LinkedList<QueuePerson> linkedList = new LinkedList(treeSet);

        Collections.sort(linkedList, priorityComparator);

        for(QueuePerson i : linkedList) {
            System.out.println(i.getName() + " " + i.getSurname() + " " + i.getMiddlename()+ " " + i.getAddress().getStreet()+ " " +i.getPriority());
        }

    }
}
