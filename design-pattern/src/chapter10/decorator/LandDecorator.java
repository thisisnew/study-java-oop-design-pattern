package chapter10.decorator;

public class LandDecorator extends DisplayDecorator {
    public LandDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void draw() {
        super.draw();
        drawLand();
    }

    private void drawLand() {
        System.out.println("\t차선 표시");
    }
}
