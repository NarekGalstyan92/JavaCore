package homework.arrayutil;

public class ArraySpace {
    char[] spaceArray = {' ', 'H', 'i', ' ', ' ', 'J', 'a', 'v', 'a', ' ', ':', ')', ' ', ' '};

    char[] space() {

        int startIndex = 0;
        int endIndex = spaceArray.length - 1;
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[startIndex] == ' ') {
                startIndex++;
            } else {
                break;
            }
        }
        for (int i = endIndex; i > 0; i--) {
            if (spaceArray[endIndex] == ' ') {
                endIndex--;
            } else {
                break;
            }
        }
        int length = endIndex - startIndex + 1;
        char[] result = new char[length];
        int index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            result[index++] = spaceArray[i];

        }
        for (char c : result) {
            System.out.print(c);
        }
        return result;
    }
}
