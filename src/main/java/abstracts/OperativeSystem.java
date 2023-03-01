package abstracts;

import interfaces.Style;

public abstract class OperativeSystem {

    protected Style style;

    public OperativeSystem(Style style) {
        this.style = style;
    }

    public abstract void build();

}
