class Num {
    public static void main(String[] args) {
        int i = 0;

        while (i <= 100) {

            System.out.println(i++);
            i++;
        }

        i = 0;
        int sum = 0;
        while (i <= 100) {
            sum = sum + i++;
            i++;
        }
        System.out.println("Suma liczb: " + sum);
    }

}






