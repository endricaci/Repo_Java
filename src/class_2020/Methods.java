package class_2020;

public class Methods {

    public static void main(String[] args) {

        String [] names = {"elena", "Endri", "Sport"};
        int indexOfName = findNameIndex(names, "endri");
        System.out.println(indexOfName);





    }

    public static int findNameIndex(String [] names, String namesToSearch) {
        int nameIndex = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(namesToSearch)) {
                nameIndex = i;
                break;
            }
        }
        return nameIndex;
    }
}
