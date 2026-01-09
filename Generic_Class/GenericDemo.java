// Generic class in java

class GenericClass1<T> {

    private T data;

    void setData(T data) {
        this.data = data;
    }

    T getData() {
        return data;
    }
}

class GenericDemo {

    public static void main(String[] args) {
        GenericClass1 obj = new GenericClass1();

        obj.setData(10);

        System.out.print(obj.getData()); 
    }
}
