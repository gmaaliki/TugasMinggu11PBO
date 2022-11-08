package tugasminggu11;

class GenericClass<T> {
    // variable of T type
    final private T data;

    public GenericClass(T data) {
        this.data = data;
    }
    
    <T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    // method that return T type variable
    public T getData() {
        return this.data;
    }
}

public class TugasMinggu11 {
    enum Warna {
        Merah,
        Kuning,
        Hijau
    }

    public static void main(String[] args) {
        Warna tesWarna = Warna.Merah;
        System.out.println("Aku suka warna " + tesWarna);
        GenericClass<String> tesKelas = new GenericClass<>("hai");
        tesKelas.genericDisplay(15.124);
    }
}
