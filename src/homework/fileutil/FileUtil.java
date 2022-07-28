package homework.fileutil;

import homework.fileutil.Commands;

import java.io.*;
import java.util.Scanner;

import static homework.fileutil.Commands.*;

public class FileUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            Commands.printCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case LOGOUT:
                    run = false;
                    break;
                case FILE_SEARCH:
                    fileSearch();
                    break;
                case CONTENT_SEARCH:
                    contentSearch();
                    break;
                case FIND_WORD_IN_LINE:
                    findLines();
                    break;
                case PRINT_ALL_FILES_SIZES:
                    printSizeOfPackage();
                    break;
                case CREATE_FILE_WITH_CONTENT:
                    createFileWithContent();
                    break;
                default:
                    System.out.println("Invalid command");
                    System.out.println();
            }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {  // this method works only if file name also contains extension
        System.out.println("please enter path");
        String path = scanner.nextLine();
        System.out.println("Please enter file name for search");
        String fileName = scanner.nextLine();

        File myFile = new File(path, fileName);

        System.out.println(myFile.exists());
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() {
        System.out.println("please enter path");
        String path = scanner.nextLine();
        System.out.println("Please enter keyword");
        String keyword = scanner.nextLine();

        findFile(path, keyword);


    }

    private static void findFile(String path, String keyword) {
        File directory = new File(path);
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        findFile(file.getAbsolutePath(), keyword);
                    } else {
                        if (file.getName().endsWith(".txt")) {
                            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                                String line = "";
                                while ((line = br.readLine()) != null) {
                                    if (line.contains(keyword)) {
                                        System.out.println(file.getAbsoluteFile());
                                        break;
                                    }
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("Please enter correct directory path \n");
        }
    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {
        System.out.println("please enter file path");
        String filePath = scanner.nextLine();
        System.out.println("Please enter keyword");
        String keyword = scanner.nextLine();

        File file = new File(filePath);
        if (file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line = "";
                int lineCount = 1;
                while ((line = br.readLine()) != null) {
                    if (line.contains(keyword)) {
                        line = line.replaceAll(keyword, "\u001B[33m" + keyword + "\u001B[0m \n");
                        System.out.println(lineCount + "->" + line);
                    }
                    lineCount++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("please enter directory path");
        String directoryPath = scanner.nextLine();

        File file = new File(directoryPath);
        long size = 0;
        if (file.exists() && file.isDirectory()) {
            File[] files = file.listFiles();
            size = 0;
            for (File file1 : files) {
                size += file1.length();
            }
        }
        System.out.println("Size of package: " + (size / (1024 * 1024) + "Mb \n"));

    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() {
        System.out.println("please enter directory path");
        String directoryPath = scanner.nextLine();
        System.out.println("Please enter file name");
        String fileName = scanner.nextLine();
        System.out.println("Please enter file content");
        String fileContent = scanner.nextLine();

        File directory = new File(directoryPath);
        if (directory.exists()) {
            fileName = fileName.endsWith(".txt") ? fileName : fileName + ".txt";
            File newFile = new File(directory, fileName);
            if (!newFile.exists()) {
                try {
                    newFile.createNewFile();
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))) {
                        bw.write(fileContent);
                        System.out.println("file \"" + fileName + "\" created successfully \n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Please enter file name that is not exist \n");
            }
        } else {
            System.out.println("Please enter correct directory. Your entered directory is already exist \n");
        }

    }

}
