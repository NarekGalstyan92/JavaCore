package homework.dynamicArray;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size++] = value;
    }

    //Գրել մեթոդ delete(int index) որ տանք ինդեքսը, այդ ինդեքսի տակ գտնվող թիվը
    // հեռացնի մասիվից. (նոր մասիվ պետք չէ սարքել)
    public void delete(int index) {
        if (index - 1 > size) {
            System.out.println("You can't delete anything from array without adding any value there");
        } else {
            System.out.print("Here is the array with deleted index: ");
            for (int i = 0; i < size; i++) {
                if (i != index) {
                    System.out.print(array[i] + " ");
                } else {
                    continue;
                }
            }
        }
        System.out.println();
    }

    //Գրել մեթոդ add(int index, int value) որը տրված վելյուն կդնի տրված ինդեքսի տեղը,
    // իսկ էղած թիվը ու կողքի բոլոր թվերը կտանի աջ, ոչ մի թիվ չի կորի
    public void addNewValue(int index, int value) {
        int[] changedArray = new int[size];
        System.out.print("Here is the array with added value: ");
        for (int i = 0; i < size; i++) {

        }
        System.out.println();
    }

    //Գրել մեթոդ set անունով, որը կընդունի int index, int value և վալյուն կդնի
    // տրված ինդեքսի տեղը(կփոխարինի էղած արժեքին).
    public void set(int index, int value) {
        if (size == 0) {
            System.out.println("You can't change anything in array without adding any value there");
        } else {
            int[] changedArray = array;
            System.out.print('\n' + "You just changed your created array and under index " + index + " now you have ");
            for (int i = 0; i < size; i++) {
                i = index;
                array[i] = value;
                System.out.println(array[i] + "." + '\n');
                break;
            }
            System.out.print("Here are the changed array elements: ");
            int j;
            for (j = 0; j < size; j++) {
                System.out.print(changedArray[j] + " ");
            }

        }
        System.out.println("\n");
    }

    boolean isEmpty() {
        boolean b = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == 0) {
                b = true;
                System.out.print("There is no elements in array");
                return b;
            } else {
                System.out.println("There are some elements in array");
                break;
            }
        }
        System.out.println();
        return b;
    }

    //Գրել մեթոդ getByIndex անունով, որը կընդունի ինդեքս, և կվերադարձնի այդ ինդեքսի տակ ընկած թիվը, եթե չկա թող վերադարձնի 0;
    public int getByIndex(int inputtedIndex) {
        for (int i = 0; i < size; i++) {
            if (inputtedIndex == 0) {
                System.out.println("Value under inputted index " + inputtedIndex + " is: " + array[0]);
                break;
            }
            if (inputtedIndex < 0) {
                System.out.println("You can't enter number less than 0");
                break;
            }
            if (inputtedIndex > size) {
                System.out.println("Try to enter a smaller value than you entered. You entered " + "\"" + inputtedIndex + "\"");
                break;
            } else {
                array[i] = inputtedIndex;
                int a = array[i];
                System.out.println("Value of inputted index is: " + array[a]);
                break;
            }
        }
        System.out.println();
        return inputtedIndex;
    }

    //Գրել մեթոդ getFirstIndexByValue, որը կընդունի int value, և եթե մեր մասիվի մեջ ունենք այդ թվից,
    // կվերադարձնի իր ինդեքսը. եթե շատ ունենք, պետք է վերադարձնել առաջինի ինդեքսը
    public int getFirstIndexByValue(int value) {
        int c = 0;
        int index = 0;
        for (int i = 0; i < size; i++) {
            c = array[i];
            if (value == c) {
                System.out.println("There is a match with your inputted value " + value + ".");

                break;
            }
        }
        if (value != c) {
            System.out.println("There isn't match with your inputted value " + value + ".");
        }

        return index;
    }

    public void printArray() {
        if (size == 0) {
            System.out.println("You haven't anything in your array.");
        } else {
            System.out.print("Your created array has selected values: ");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void extend() {
        int[] temp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }
}
