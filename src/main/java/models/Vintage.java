package models;

import interfaces.Style;

public class Vintage implements Style {

    @Override
    public void draw() {
        System.out.println("===>>> with vintage style");
    }

}
