package homework.dynamicArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(456);
        da.add(33);
        da.add(77);
        da.add(0);
        da.add(21);

        da.isEmpty();
        da.printArray();
        da.getByIndex(1);
        da.getFirstIndexByValue(77);
        da.set(1, 5600);
        da.addNewValue(3, 200000);
        da.delete(6);
    }
}
