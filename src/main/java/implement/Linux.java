package implement;

import abstracts.OperativeSystem;
import interfaces.Style;

public class Linux extends OperativeSystem {

    public Linux(Style style) {
        super(style);
    }

    @Override
    public void build() {
        System.out.println("===>>> Build Linux application");
        style.draw();
    }

}
