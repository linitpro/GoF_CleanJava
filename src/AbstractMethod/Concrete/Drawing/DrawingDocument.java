package AbstractMethod.Concrete.Drawing;

import AbstractMethod.Abstract.IDocument;

public class DrawingDocument implements IDocument {

    @Override
    public String getName() {
        return "document.drawing";
    }
}
