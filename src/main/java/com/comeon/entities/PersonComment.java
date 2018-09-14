package com.comeon.entities;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;

public class PersonComment {

    private final String commentId;
    private String senderId;
    private String message;
    private Calendar data;
    private String toPersonId;

    public PersonComment() {
        this.commentId = UUID.randomUUID().toString();
        this.data = new GregorianCalendar();
    }

    public PersonComment(String senderId, String message, String actionId) {
        this.commentId = UUID.randomUUID().toString();
        this.senderId = senderId;
        this.message = message;
        this.data = new GregorianCalendar();
        this.toPersonId = actionId;
    }

    public PersonComment(String commentId, String senderId, String message, String actionId) {
        this.commentId = commentId;
        this.senderId = senderId;
        this.message = message;
        this.data = new GregorianCalendar();
        this.toPersonId = actionId;
    }

    public String getCommentId() {
        return commentId;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getToPersonId() {
        return toPersonId;
    }

    public void setToPersonId(String toPersonId) {
        this.toPersonId = toPersonId;
    }
}
