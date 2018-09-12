package com.comeon.entities;

import java.util.Collection;
import java.util.UUID;

public class ActivityLibrary {

    private final String actionId;
    private String actionType;
    private String actionName;

    private Collection<ActivityApplication> activityApplications;

    public ActivityLibrary() {
        this.actionId = UUID.randomUUID().toString();
    }

    public ActivityLibrary(String actionType, String actionName) {
        this.actionId = UUID.randomUUID().toString();
        this.actionType = actionType;
        this.actionName = actionName;
    }

    public ActivityLibrary(String actionId, String actionType, String actionName) {
        this.actionId = actionId;
        this.actionType = actionType;
        this.actionName = actionName;
    }

    public String getActionId() {
        return actionId;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public Collection<ActivityApplication> getActivityApplications(){
        return activityApplications;
    }

    public void setActivityApplications(Collection<ActivityApplication> activityApplications){
        this.activityApplications = activityApplications;
    }
}
