package AbstractMethod.Concrete.Text;

import AbstractMethod.Abstract.IApplication;
import AbstractMethod.Abstract.IDocument;

public class TextApplication implements IApplication {
    @Override
    public IDocument CreateDocument() {
        System.out.println("created text document");
        return new TextDocument();
    }

    @Override
    public IDocument OpenDocument() {
        System.out.println("opened text document");
        return new TextDocument();
    }
}
