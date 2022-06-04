package homework.arrayutil;

public class CharArray {
    char[] chars = {'J', 'a', 'v', 'a', 'L', 'o', 'v', 'e'};
    char[] chars1 = {'J', 'a', 'v', 'a', 'L', 'o', 'l', 'y'};

    char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a', 'l', 'e'};


    int occure_o() {
        int count = 0;
        char c = 'o';
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        return count;
    }

    void venterChars() {

        for (int i = 0; i < chars.length; i = chars.length) {
            if (chars.length % 2 == 0) {
                int j = chars.length / 2 - 1;
                i = j;
            }
            System.out.print("Center chars are: " + "\"" + chars[i] + "\"" + " and ");
            if (chars.length % 2 == 0) {
                int k = chars.length / 2;
                i = k;
            }
            System.out.println("\"" + chars[i] + "\"");

        }
    }

    void lyCheck() {
        int lastIndex = chars1.length - 1;
        boolean lyresult = false;
        if (chars1[lastIndex - 1] == 'l' && chars1[lastIndex] == 'y') {
            lyresult = true;
            System.out.println("There is \"ly \" in there");
        } else {
            System.out.println("There is no \"ly \" in there");
        }
    }

    void checkBob() {
        boolean bobthere = false;
        for (int i = 0; i < bobArray.length; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                bobthere = true;
                break;
            }
        }
        System.out.println("BobThere is " + bobthere);
    }

    void gandz() {
        char[] text = {' ', ' ', 'H', 'o', 'r', 'q', 'u', 'r', 'i', ' ', 'G', 'a', 'n', 'd', 'z', ' ', ' '};
        System.out.print("Here is the text without spaces: ");
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }
        }
    }
}
