package stack;

import java.util.Stack;

/*
Stack sınıfı Vector sınıfını miras alır(Vector sınıfından türetilmiştir.)
Stack (Yığın), Last In, First Out (LIFO - Son Giren İlk Çıkar) mantığıyla çalışan bir veri yapısıdır.
Yani en son eklenen eleman, ilk çıkarılır.

Java'da Stack sınıfı, java.util.Stack paketinde yer alır
ve push() -> stack'e eleman ekler,
pop() -> En üstteki elemanı çıkartır ve döndürür,
peek()-> En üstteki elemanı döndürür (silmez).
gibi metotlarla yönetilir.
isEmpty()-> Stack boşsa true, doluysa false döner.

 */
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //Eleman ekleme
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack'e eklendi : " + stack);

        //En üstteki elemanı gösterme
        System.out.println("Peek ile En üstteki elemanı gösterme: " + stack.peek());

        // En üstteki elemanı çıkarma (pop)
        System.out.println("Pop ile En üstteki elemanı çıkarma : " + stack.pop());

        //Stack boş mu kontrolü
        System.out.println("isEmpty ile boş mu kontrolü : " + stack.isEmpty());
    }
}
