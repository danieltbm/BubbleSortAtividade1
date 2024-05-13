package Modelagem;

public class SortModel {
	private int[] numbers;

    public SortModel() {
        this.numbers = new int[10];
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
    
    public void bubbleSort() {
        int n = numbers.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(numbers[j-1] > numbers[j]){
                    temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    public int[] getNumbers() {
        return numbers;
    }
}