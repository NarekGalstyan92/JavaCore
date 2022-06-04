package homework.arrayutil;

public class CharArrayExample {
    public static void main(String[] args) {

//Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։
        System.out.println();

        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.print("the number of the character c in our array occurs " + count + " time(s)");

        System.out.println();
        System.out.println();

//պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        for (int i = 0; i < chars2.length; i = chars2.length) {
            if (chars2.length % 2 == 0) {
                int j = chars2.length / 2 - 1;
                i = j;
            }
            System.out.print("Center chars are: " + "\"" + chars2[i] + "\"" + " and ");
            if (chars2.length % 2 == 0) {
                int k = chars2.length / 2;
                i = k;
            }
            System.out.println("\"" + chars2[i] + "\"");
        }
        System.out.println();
//        Ունենք հետևյալ մասիվը՝՝
//char[] chars3 = {'j','a','v','a','l,'o','l', 'y'};
//պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false

        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        int lastIndex = chars3.length - 1;
        boolean lyResult = false;
        if (chars3[lastIndex - 1] == 'l' && chars3[lastIndex] == 'y') {
            lyResult = true;
        }
        System.out.println("The answer is " + lyResult);

        System.out.println();

        //Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
        //օր․ abcbob → true, b9b -> true, բայց ասենք bac-> false

        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a', 'l', 'e'};
        boolean bobThere = false;
        for (int i = 0; i < bobArray.length - 2; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                bobThere = true;
                break;
            }
        }
        System.out.println("BobThere is " + bobThere);
        System.out.println();

        //պետք է տպել մասսիվի այն սիմվոլները որոնք պռաբել չեն

        char[] text = {' ', ' ', 'h', 'o', 'r', 'q', 'u', 'r', 'i', '_', 'g', 'a', 'n', 'd', 'z', ' ', ' '};
        System.out.print("Here is the FINAL text I worked on 4 goddamn hours: ");
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }
        }
    }
}


