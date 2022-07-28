package homework.fileutil;

interface Commands {
    int LOGOUT = 0;
    int FILE_SEARCH = 1;
    int CONTENT_SEARCH = 2;
    int FIND_WORD_IN_LINE = 3;
    int PRINT_ALL_FILES_SIZES = 4;
    int CREATE_FILE_WITH_CONTENT = 5;

    static void printCommands() {
        System.out.println("Please input " + LOGOUT + " to exit");
        System.out.println("Please input " + FILE_SEARCH + " to search file in package");
        System.out.println("Please input " + CONTENT_SEARCH + " to print files with inputted content");
        System.out.println("Please input " + FIND_WORD_IN_LINE + " to find inputted words in lines");
        System.out.println("Please input " + PRINT_ALL_FILES_SIZES + " print all file sizes");
        System.out.println("Please input " + CREATE_FILE_WITH_CONTENT + " create file with inputted context");

    }
}
