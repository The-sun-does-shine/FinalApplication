package jnu.edu.cn.finalapplication.ui;

public class Time {
    public Time(String title, String date, int coverResourceId) {
        this.setTitle(title);
        this.setDate(date);
        this.setCoverResourceId(coverResourceId);
    }

    private String title;
    private String date;
    private int coverResourceId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCoverResourceId() {
        return coverResourceId;
    }

    public void setCoverResourceId(int coverResourceId) {
        this.coverResourceId = coverResourceId;
    }
}
