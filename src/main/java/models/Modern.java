package models;

import interfaces.Style;

public class Modern implements Style {

    @Override
    public void draw() {
        System.out.println("===>>> with modern style");
    }

}
