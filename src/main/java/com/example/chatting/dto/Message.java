package com.example.chatting.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {
    public enum MessageType {
        ENTER, COMM
    }

    private MessageType type;
    private String roomId;
    private String sender;
    private String message;
}
