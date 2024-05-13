package Visao;
import Controle.SortController;
import Modelagem.SortModel;

public class Main {
    public static void main(String[] args) {
        SortModel model = new SortModel();
        SortView view = new SortView();
        SortController controller = new SortController(model, view);

        controller.initNumbers();
        controller.sortNumbers();
    }
}