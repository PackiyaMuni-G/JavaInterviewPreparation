package com.interviewpre.multithtread;
class Message {
    private String message;
    private boolean hasMessage = false;
    
    

    // Method for producing messages
    
    public synchronized void produce(String msg) {
        while (hasMessage) {
            try {
                wait(); // Wait if there's already a message
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Handle interrupt
            }
        }
        this.message = msg;
        hasMessage = true;
        System.out.println(msg + " produced");
        notify(); // Notify consumer that a message is available
    }

    // Method for consuming messages
    public synchronized String consume() {
        while (!hasMessage) {
            try {
                wait(); // Wait if there's no message
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Handle interrupt
            }
        }
        hasMessage = false;
        String consumedMessage = message;
        System.out.println(consumedMessage + " consumed");
        notify(); // Notify producer that the message has been consumed
        return message;
    }
}

public class WaitNotifyLambdaExample {
    public static void main(String[] args) {
        String[] messages = {"Hello", "World", "From", "main"};
        Message message = new Message();

        // Producer thread
        Thread producerThread = new Thread(() -> {
            for (String msg : messages) {
                message.produce(msg);
//              
                try {
                    Thread.sleep(500); // Simulate production time
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Handle interrupt
                }
            }
            message.produce("Done"); // Notify consumer to stop
        });

        // Consumer thread

Thread consumerThread = new Thread(() -> {
            String msg;
            while (!(msg = message.consume()).equals("Done")) {
    
                try {
                    Thread.sleep(300); // Simulate consumption time
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Handle interrupt
                }
            }
            System.out.println("Production finished.");
        });

        // Start threads
        producerThread.start();
        consumerThread.start();

        // Wait for threads to complete
        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Handle interrupt
        }
    }
}
