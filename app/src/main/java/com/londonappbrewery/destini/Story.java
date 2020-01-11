package com.londonappbrewery.destini;

public class Story {
    public int getText() {
        return text;
    }

    public void setText(int text) {
        this.text = text;
    }

    public int getTop_button_text() {
        return top_button_text;
    }

    public void setTop_button_text(int top_button_text) {
        this.top_button_text = top_button_text;
    }

    public int getBottom_button_text() {
        return bottom_button_text;
    }

    public void setBottom_button_text(int bottom_button_text) {
        this.bottom_button_text = bottom_button_text;
    }

    private int text;
    private int top_button_text;
    private int bottom_button_text;
    public Story(int text, int top_button_text, int bottom_button_text){
        this.text = text;
        this.top_button_text = top_button_text;
        this.bottom_button_text = bottom_button_text;
    }
}
