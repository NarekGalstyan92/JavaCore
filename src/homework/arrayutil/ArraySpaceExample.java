package homework.arrayutil;

//Ունենալու ենք char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '}; մասիվը,
//որի մեջ սկզբից և վերջից կարող է լինել ցանկացած քանակությամբ ' '-ներ(բացատներ) ։
//Պետք է ստեղծել նոր՝ char[] result մասիվ, որտեղ չեն լինի spaceArray-ի սկզբի և վերջի բացատները։
//Այսինքն մեր լոգիկայի արդյունքում որ տպենք result մասիվի բոլոր էլեմենտները՝
//կունենանք cat b i b (մեջտեղի սինվոլները մնալու են)

//Հուշում խնդիր 2-ին.
//Ձեզ պետք է հաշվել թե սկզբից քանի պռաբել կա, ու էդ թիվը մի փոփոխականի մեջ պահել,
//նույնը անել վերջից. Հաշվել թե քանի հատ կա պռաբել.
//Վերջից որ հանենք սկզբի պռաբելները կստանանք թազա մասիվի լենգթը.
// Դե սկիզբը ունինք, վերջը ունինք, կրանք հին մասիվի վրա ֆռռալ, ու քցել նորի մեջ


public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'h', 'o', 'r', ' ', 'q', 'u', 'r', 'i', ' ', 'g', 'a', 'n', ' ', 'd', 'z', ' ', ' '};
        int startIndex = 0;
        int endIndex = spaceArray.length- 1;
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
        char [] result = new char [length];
        int Index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            result [Index++] = spaceArray[i];

        }
        for (char c : result) {
            System.out.print(c);
        }
    }
}



