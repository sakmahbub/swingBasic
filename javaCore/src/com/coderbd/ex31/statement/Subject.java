package com.coderbd.ex31.statement;

/**
 * Created by J2EE-33 on 9/16/2017.
 */
public class Subject {
    private String subjectName;
    private int mark;
    private String statusPass;
    private String statusFail;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getStatusPass() {
        return statusPass;
    }

    public void setStatusPass(String statusPass) {
        this.statusPass = statusPass;
    }

    public String getStatusFail() {
        return statusFail;
    }

    public void setStatusFail(String statusFail) {
        this.statusFail = statusFail;
    }
}
