class GenericsClass<T> {
    T item;
    GenericsClass(T item) {
        this.item = item;
    }
    public T getItem() {
        return this.item;
    }
    public void setItem(T item) {
        this.item = item;
    }
}

class First {
    public static void main (String[] args) {
        GenericsClass <Integer> intObj = new GenericsClass<Integer>(69);
        System.out.println(intObj.getItem());
        intObj.setItem(33);
        System.out.println(intObj.getItem());

        GenericsClass <String> stringObj = new GenericsClass<String>("First");
        System.out.println(stringObj.getItem());
        stringObj.setItem("Third");
        System.out.println(stringObj.getItem());
    }
}
