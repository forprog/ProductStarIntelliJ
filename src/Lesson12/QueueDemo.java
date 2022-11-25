package Lesson12;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>();
        pq.add("aaa");
        pq.add("caa");
        pq.add("baa");
        pq.add("daa");
        pq.add("faa");

        System.out.println(pq.peek());
        System.out.println(pq.size());

        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }

        Queue<Person> persons = new PriorityQueue<>();
        persons.add(new Person("Vasya",21));
        persons.add(new Person("Kolya",18));
        persons.add(new Person("Anna",20));

        while (!persons.isEmpty()){
            System.out.println(persons.poll());
        }
    }
}