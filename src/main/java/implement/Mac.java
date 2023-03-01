package implement;

import abstracts.OperativeSystem;
import interfaces.Style;

public class Mac extends OperativeSystem {

    public Mac(Style style) {
        super(style);
    }

    @Override
    public void build() {
        System.out.println("===>>> Build Mac application");
        style.draw();
    }

}
