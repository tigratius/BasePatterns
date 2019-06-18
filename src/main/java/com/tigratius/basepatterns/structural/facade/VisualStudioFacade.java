package main.java.com.tigratius.basepatterns.structural.facade;

public class VisualStudioFacade {
    TextEditor textEditor;
    Compiller compiller;
    CLR clr;

    public VisualStudioFacade()
    {
        this.textEditor = new TextEditor();
        this.compiller = new Compiller();
        this.clr = new CLR();
    }
    public void start()
    {
        textEditor.createCode();
        textEditor.save();
        compiller.compile();
        clr.execute();
    }
    public void stop()
    {
        clr.finish();
    }
}
