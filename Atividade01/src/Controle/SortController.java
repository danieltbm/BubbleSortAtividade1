package Controle;
import Modelagem.SortModel;
import Visao.SortView;

public class SortController {
    private SortModel model;
    private SortView view;

    public SortController(SortModel model, SortView view) {
        this.model = model;
        this.view = view;
    }

    public void initNumbers() {
        int[] userInput = view.getUserInput();
        model.setNumbers(userInput);
    }

    public void sortNumbers() {
        model.bubbleSort();
        view.printSortedArray(model.getNumbers());
    }
}