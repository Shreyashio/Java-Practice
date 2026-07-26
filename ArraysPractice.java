public class ArraysPractice {
    public static int linearSearch(String menu[],String key) {
        for(int i=0; i<menu.length; i++) {
            if(menu[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String menu[] = {"dosa", "Idli", "Gulabjamun", "Rasgulla", "Kachori"};
        String key = "dosa";

        int index = linearSearch(menu, key);
        if(index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("The Item in the menu is at index: "+ index);
        }
    }
}
