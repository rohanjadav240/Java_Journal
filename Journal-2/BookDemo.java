/* 10. Create a class namely Book to maintain Book details like id, name, quantity and author using singly linked list. Perform following operations on booklist:
a.Add book details in the begging of the list
b.Add book details at the end of the list
c. Add book detail at particular position
d. Remove first book detail from the list
e. Remove last book detail from the list
f. Display all book details in the list **/

import java.util.Scanner;

class Book {
    int id, qty;
    String name, author;
    Book next;

    Book(int id, String name, int qty, String author) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.author = author;
        this.next = null;
    }
}

class BookList {
    Book head = null;

    // a) Add at beginning
    void addFirst(int id, String name, int qty, String author) {
        Book newBook = new Book(id, name, qty, author);
        newBook.next = head;
        head = newBook;
    }

    // b) Add at end
    void addLast(int id, String name, int qty, String author) {
        Book newBook = new Book(id, name, qty, author);

        if (head == null) {
            head = newBook;
            return;
        }

        Book temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newBook;
    }

    // c) Add at particular position
    void addAtPosition(int pos, int id, String name, int qty, String author) {
        if (pos == 1) {
            addFirst(id, name, qty, author);
            return;
        }

        Book newBook = new Book(id, name, qty, author);
        Book temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newBook.next = temp.next;
        temp.next = newBook;
    }

    // d) Remove first
    void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // e) Remove last
    void removeLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        Book temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // f) Display
    void display() {
        Book temp = head;

        if (temp == null) {
            System.out.println("List is empty");
            return;
        }

        while (temp != null) {
            System.out.println("ID: " + temp.id +
                               " Name: " + temp.name +
                               " Qty: " + temp.qty +
                               " Author: " + temp.author);
            temp = temp.next;
        }
    }
}

class BookDemo {
    public static void main(String args[]) {

        BookList list = new BookList();

        list.addFirst(1, "Java", 10, "James Gosling");
        list.addLast(2, "Python", 8, "Guido Rossum");
        list.addAtPosition(2, 3, "C++", 5, "Bjarne Stroustrup");

        System.out.println("Book List:");
        list.display();

        list.removeFirst();
        System.out.println("\nAfter removing first book:");
        list.display();

        list.removeLast();
        System.out.println("\nAfter removing last book:");
        list.display();
    }
}