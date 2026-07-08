class ForEachLinear {
    public static void main(String[] args) {
        String name = "Vedant";
        char target = 't';

        System.out.println(name.toCharArray());

        System.out.println(LinearSearch(name, target));
    }

    public static boolean LinearSearch(String name, char target) {

        if (name.length() == 0) {
            System.out.println("Enter Valid Name");
            return false;
        }

        for (char ch : name.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }

        return false;
    }
}