package example;

import abstracts.OperativeSystem;
import implement.Linux;
import implement.Mac;
import implement.Windows;
import interfaces.Style;
import models.Classic;
import models.Modern;
import models.Vintage;

public class Application {

    private OperativeSystem os;
    private Style style;

    public Application withStyle(int style) {
        switch (style) {
            case 1:
                this.style = new Vintage();
                break;
            case 2:
                this.style = new Modern();
                break;
            case 3:
                this.style = new Classic();
                break;
        }
        return this;
    }

    public Application andOs(int os) {
        switch (os) {
            case 1:
                this.os = new Windows(style);
                break;
            case 2:
                this.os = new Mac(style);
                break;
            case 3:
                this.os = new Linux(style);
                break;
        }
        return this;
    }

    public void build() {
        os.build();
    }
}

