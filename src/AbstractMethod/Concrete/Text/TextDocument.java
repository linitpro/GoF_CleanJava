package AbstractMethod.Concrete.Text;

import AbstractMethod.Abstract.IDocument;

import java.lang.annotation.Documented;

public class TextDocument implements IDocument {

    @Override
    public String getName() {
        return "document.text";
    }
}
