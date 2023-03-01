package implement;

import abstracts.OperativeSystem;
import interfaces.Style;

public class Windows extends OperativeSystem {

    public Windows(Style style) {
        super(style);
    }

    @Override
    public void build() {
        System.out.println("===>>> Build Windows application");
        style.draw();
    }

}
