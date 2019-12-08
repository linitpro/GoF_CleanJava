package AbstractMethod;

import AbstractMethod.Abstract.IApplication;
import AbstractMethod.Abstract.IDocument;
import AbstractMethod.Concrete.Drawing.DrawingAppication;
import AbstractMethod.Concrete.Text.TextApplication;

public class Main {

    public static void main(String[] args){
        IApplication application = createDrawingAppication();
        IDocument document = application.CreateDocument();
        System.out.println(document.getName());

        application = createTextAppication();
        document = application.CreateDocument();
        System.out.println(document.getName());
    }

    public static IApplication createDrawingAppication()
    {
        return new DrawingAppication();
    }

    public static IApplication createTextAppication()
    {
        return new TextApplication();
    }
}
