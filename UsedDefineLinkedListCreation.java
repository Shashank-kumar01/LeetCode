package LinkedList;

import java.util.*;

public class UsedDefineLinkedListCreation {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedList {

        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtBgning(int value) {

            Node temp = new Node(value);
            if (head == null)
                head = tail = temp;

            else {
                temp.next = head;
                head = temp;
            }
            size++;

        }

        void insertAtEnd(int value) {

            Node temp = new Node(value);
            if (head == null) // list is empty first node is adding
                head = temp;

            else
                tail.next = temp; // list not empty node exits

            tail = temp;
            size++;
        }

        void insertAt(int indx, int value) {

            Node t = new Node(value);
            Node temp = head;

            if (indx < 0 || indx > size()) {
                System.out.println("Wrong index");
                return;
            }

            if (indx == size()) {
                insertAtEnd(value);
                return;
            }

            if (indx == 0) {
                insertAtBgning(value);
                return;
            }

            for (int i = 0; i < indx - 1; i++)
                temp = temp.next;

            t.next = temp.next;
            temp.next = t;
            size++;
        }

        int getAt(int indx) {
            Node temp = head;

            if (indx < 0 || indx >= size()) {
                System.out.println("Invalid index");
                return -1;
            }

            for (int i = 0; i < indx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAt(int indx) {

            Node temp = head;

            if (indx < 0 || indx >= size()) {
                System.out.println("Invalid index");
                return;
            }

            if (indx == 0) {
                head = head.next;

                if (head == null) // when deleting the only node so tail must point to null
                    tail = null;
                size--;
                return;
            }

            for (int i = 0; i < indx - 1; i++) {
                temp = temp.next;
            }

            if (temp.next == tail) // if indx is the last indx of list so tail must be shifted to the left
                tail = temp;

            temp.next = temp.next.next;
            size--;
        }

        void display() {

            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {

            return size;

            // Node temp = head;
            // int count = 0;
            // while (temp != null) {
            // count++;
            // temp = temp.next;
            // }
            // return count;
            // }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            linkedList l = new linkedList();

            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();

            System.out.println("Enter elements:");

            for (int i = 0; i < n; i++) {
                int value = sc.nextInt();
                l.insertAtEnd(value);
            }
            System.out.println("Linked List:");
            l.display();

            while (true) {

                System.out.println("\n1. Insert at Beginning");
                System.out.println("2. Insert at End");
                System.out.println("3. Insert at Index");
                System.out.println("4. Delete at Index");
                System.out.println("5. Get Element");
                System.out.println("6. Display");
                System.out.println("7. Size");
                System.out.println("8. Exit");

                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter value: ");
                        l.insertAtBgning(sc.nextInt());
                        break;

                    case 2:
                        System.out.print("Enter value: ");
                        l.insertAtEnd(sc.nextInt());
                        break;

                    case 3:
                        System.out.print("Enter index: ");
                        int index = sc.nextInt();
                        System.out.print("Enter value: ");
                        int value = sc.nextInt();
                        l.insertAt(index, value);
                        break;

                    case 4:
                        System.out.print("Enter index: ");
                        l.deleteAt(sc.nextInt());
                        break;

                    case 5:
                        System.out.print("Enter index: ");
                        System.out.println("Element = " + l.getAt(sc.nextInt()));
                        break;

                    case 6:
                        l.display();
                        break;

                    case 7:
                        System.out.println("Size = " + l.size());
                        break;

                    case 8:
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid Choice");
                }
            }

        }
    }
}
