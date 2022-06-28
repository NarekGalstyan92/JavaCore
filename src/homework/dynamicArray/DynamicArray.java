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
    public void deleteByIndex(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    //Գրել մեթոդ add(int index, int value) որը տրված վելյուն կդնի տրված ինդեքսի տեղը,
    // իսկ էղած թիվը ու կողքի բոլոր թվերը կտանի աջ, ոչ մի թիվ չի կորի
    public void addNewValue(int index, int value) {
        if (array.length == size) {
            extend();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        size++;
    }

    //Գրել մեթոդ set անունով, որը կընդունի int index, int value և վալյուն կդնի
    // տրված ինդեքսի տեղը(կփոխարինի էղած արժեքին).
    public void set(int index, int value) {
        if (index >= 0 && index < size) {
            array[index] = value;
        }
    }

    // գրել մեթոդ isEmpty անունով, որը կվերադարձնի true եթե մեր DynamicArray-ի մեջ
    //չունենանք ոչ մի էլեմենտ, իսկ եթե ունենանք՝ false.
    public boolean isEmpty() {
        return size == 0;
    }

    //Գրել մեթոդ getByIndex անունով, որը կընդունի ինդեքս, և կվերադարձնի այդ ինդեքսի տակ ընկած թիվը, եթե չկա թող վերադարձնի 0;
    public int getByIndex(int inputtedIndex) { //կուզենայի switch-ով գրեի, բայց չստացվեց case-երը գրել
        if (inputtedIndex < 0 || inputtedIndex >= size) {
            System.out.println("Invalid index");
            return 0;
        }
        return array[inputtedIndex];
    }

    //Գրել մեթոդ getFirstIndexByValue, որը կընդունի int value, և եթե մեր մասիվի մեջ ունենք այդ թվից,
    // կվերադարձնի իր ինդեքսը. եթե շատ ունենք, պետք է վերադարձնել առաջինի ինդեքսը
    public int getFirstIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
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
