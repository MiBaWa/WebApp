package edu.fra.uas.chat.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private Long id;
    private String name;
    private List<Message> messages = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public Room() {
    }

    public Room(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    @JsonIgnore
    public void setMessage(Message message) {
        this.messages.add(message);
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @JsonIgnore
    public void setUser(User user) {
        this.users.add(user);
        ;
    }

}
