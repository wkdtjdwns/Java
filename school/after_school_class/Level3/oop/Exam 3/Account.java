package oop_exam;

public class Account {
    int balance;

    void deposit(int amount) {
        this.balance += amount;
    }

    void withdraw(int amount) {

        if (this.balance < amount) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        this.balance -= amount;
    }
}
