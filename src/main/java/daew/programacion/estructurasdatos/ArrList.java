package daew.programacion.estructurasdatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrList {

    /*
     * Cosas de ArrayList
     * 
     * (ver eswto también: https://www.geeksforgeeks.org/arraylist-in-java/)
     * 
     * es un array dinámico (no tiene tamaño fijo como un array, va
     * incrementanto/reduciendo según necesidades)
     * Permite nulls
     * Es computacionalmente más costoso que un arrya, pero en general, siempre es
     * mejor un arrayList a unb array por las facilidades de uso.
     * La complejidad computacional se empieza a notar cuando es muy grande
     * 
     * Importante: ArrayList no acepta tipos prmitivos, solo objewtos, por tanto, si
     * quiero un arrayList de tipos
     * primitivos necesito usar las WrapperClass
     * 
     * En ppio permite datos heteroigeneos (ver cómo)
     * 
     * El arrayList me da los siguientes métodos (seguramente más, ver aquí:
     * https://www.geeksforgeeks.org/arraylist-in-java/)
     * 
     * boolean add(int pos, E element) --> añade un elemento en la posición pos
     * boolean add(Object o) --> añade al final el objeto (comproibar que el retur
     * es boolean)
     * boolean addAll(int pos, Collection<? extends E> col) --> añade una coileccion
     * en la posicion indicada
     * boolean addAll(Collection) --> como el de arriba pero los planta al final
     * E get(int pos) --> devuelve el elemento E de la posicón por. Lanza
     * IndexOutOfBounds
     * int indexOf(Object o) --> devuelve el índice del objeto o
     * int lastIndexOf(Object o) --> ultimio índice donde se encuentrta el objeto o
     * y -1 si no existe
     * E remove(int pos) --> elimina el objeto de psocion pos del arrlist y lo
     * devuelve
     * E set(int pos, E elemento) --> cambia lo que hay en pos, y devuleve lo que
     * había
     * subList(pos1, pos2)
     * 
     * 
     * Pros:
     *  dinamismo de tamaño, facil de usar y muchos métodos útiles, rápido acceso a lementos, preserva orden, admite nulls
     * 
     * Cons:
     *  mas "lento" que arrays, requiere más memoria que arrays, si es muy grande, es lento en busqueda de elementos e inserción en medio
     * 
     */

    public static void metodoGuarro() {

        // Constructores de ArrayList

        // vacio
        List<Integer> arr1 = new ArrayList<>(); // crea un arraylist que va a tener Integers de momento vacío

        // con una collection inicial
        List<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 2, 3, 54, 1));

        // con un tamaño predeterinado (no tiene mucho sentido)
        List<String> arr3 = new ArrayList<>(5);

        // operaciones básicas con arrays: add element
        arr1.add(Integer.valueOf(4));
        arr1.add(3);
        arr1.add(1, 5);
        arr1.addAll(arr1);
        arr1.addAll(0, arr1);

        // cambiar elementos
        arr1.set(0,333);

        // eliminar elementos
        arr1.remove(333);
        arr1.remove(65); // si existe

        // iterar
        for(int i = 0; i < arr1.size(); i++){
            System.out.println(arr1.get(i));
        }

        for(Integer i: arr1){
            System.out.println(i);
        }

        // get
        int n = arr1.get(0);

        // ordenar (sort). ojo que aquí hay más de lo que parece, por ejemplo, si lo que hay son objetos sin un orden "natural". PDTE ver cómo se hace: https://www.geeksforgeeks.org/how-to-sort-arraylist-using-comparator/
        // hay que usar Collections.sort()
        Collections.sort(arr1); // ahora está ordenado

        // devolver tamaño
        arr2.size();

    }

    // ejercicios monguers:
    // https://www.w3resource.com/java-exercises/collection/index.php#arraylist

}
