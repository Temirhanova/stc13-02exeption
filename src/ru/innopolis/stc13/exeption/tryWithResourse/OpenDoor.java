package ru.innopolis.stc13.exeption.tryWithResourse;

public class OpenDoor implements AutoCloseable {
    public OpenDoor() {
        System.out.println("The door is open!");

    }

    public void swing() throws Exception {
        System.out.println("The door is closing");
        throw new SwingExeption("Some problems");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Door is cloused!");
    }
}
