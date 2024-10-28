public class BubbleSortIllustration {
    public static void main(String[] args) {
        int[] list = new int[]{3, 4, 1, 5, 2};
        bubbleSort(list);
    }

    private static void printList(int[] list) {
        for (int number : list) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    System.out.println("Swap " + list[j] + " with " + list[j + 1]);
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;
                }
            }
            if (!needNextPass) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.print("List after the  " + i + "' sort: ");
            for (int value : list) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
