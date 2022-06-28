package homework.dynamicArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(456);
        da.add(33);
        da.add(77);
        da.add(0);
        da.add(21);
        da.add(21);

        da.printArray();
        da.set(1, 30);
        da.printArray();
        System.out.println(da.getByIndex(3));
        da.printArray();
        System.out.println(da.getFirstIndexByValue(21));
        da.deleteByIndex(5);
        da.printArray();
        da.deleteByIndex(0);
        da.printArray();
        da.isEmpty();
    }
}
