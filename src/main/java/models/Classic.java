package models;

import interfaces.Style;

public class Classic implements Style {

    @Override
    public void draw() {
        System.out.println("===>>> with classic style");
    }

}
