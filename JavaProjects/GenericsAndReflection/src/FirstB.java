class FirstB {
    static <T> void genericDisplay (T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main(String[] args) {
        genericDisplay(13);

        genericDisplay("FirstB");

        genericDisplay(1.0);
    }
}
