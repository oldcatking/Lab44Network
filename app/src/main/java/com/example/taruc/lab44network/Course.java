package com.example.taruc.lab44network;

public class Course {
    private String code;
    private String Title;
    private String Credit;

    public Course() {
    }

    public Course(String code, String titel, String credit) {
        this.code = code;
        this.Title = Title;
        Credit = credit;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitel(String titel) {
        this.Title = titel;
    }

    public String getCredit() {
        return Credit;
    }

    public void setCredit(String credit) {
        Credit = credit;
    }
}
