package Adapter;

import Adapter.Impl0.Impl0View;
import Adapter.Interfaces.IView;

public class Main {
    public static void main(String[] args) {
        IView view = new Impl0View();
        view.setView(2, 3, 10, 22);
        System.out.println("Hello world");
    }
}
