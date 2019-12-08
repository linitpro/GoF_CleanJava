package AbstractMethod.Concrete.Drawing;

import AbstractMethod.Abstract.IApplication;
import AbstractMethod.Abstract.IDocument;

public class DrawingAppication implements IApplication {

    @Override
    public IDocument CreateDocument() {
        System.out.println("created drawing document");
        return new DrawingDocument();
    }

    @Override
    public IDocument OpenDocument() {
        System.out.println("opened drawing document");
        return new DrawingDocument();
    }
}
