package com.comeon.entities;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;

public class ActivityComment {

    private final String commentId;
    private String senderId;
    private String message;
    private Calendar data;
    private String actionId;

    public ActivityComment() {
        this.commentId = UUID.randomUUID().toString();
        this.data = new GregorianCalendar();
    }

    public ActivityComment(String senderId, String message, String actionId) {
        this.commentId = UUID.randomUUID().toString();
        this.senderId = senderId;
        this.message = message;
        this.actionId = actionId;
        this.data = new GregorianCalendar();
    }

    public ActivityComment(String commentId, String senderId, String message, String actionId) {
        this.commentId = commentId;
        this.senderId = senderId;
        this.message = message;
        this.actionId = actionId;
        this.data = new GregorianCalendar();
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

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }
}
