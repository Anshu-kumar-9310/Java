package Question94;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Testing {

    public static void main(String[] args) {
        System.out.println("welcome in the world of PriorityQueue.");
        // make a PriorityQueue of Students class with custom comparator
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // sort in descending order
                return o1.getGrade() - o2.getGrade();
            }
        });

        // add in queue
        queue.offer(new Student("Anshu", 'B'));
        queue.offer(new Student("Sachin",'C'));
        queue.offer(new Student("Ashish", 'A'));
        queue.offer(new Student("Rishi",'D'));
        queue.offer(new Student("Shivam", 'B'));
        queue.offer(new Student("Rohit",'D'));
        queue.offer(new Student("Sohil", 'A'));
        queue.offer(new Student("Saif",'C'));

        // get the queue
        System.out.println("Queue is: "+queue);

        // get the queue element
        // NOTE: in the case of PriorityQueue : Comparator only work when we fetch data
        // first sort data in descending order
        // for same grade PriorityQueue follow FIFO method-> FIRST IN FIRST OUT
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());


        // Answer:
//        Queue is: [Ashish : A, Shivam : B, Sohil : A, Saif : C, Sachin : C, Rohit : D, Anshu : B, Rishi : D]
//        Got Ashish : A
//        Got Sohil : A
//        Got Shivam : B
//        Got Anshu : B
//        Got Sachin : C
//        Got Saif : C
//        Got Rohit : D
//        Got Rishi : D
    }
}