package daew.programacion.estructurasdatos;

public class App 
{
    public static void main( String[] args )
    {
        /*
         * Estructuras de datos:
         * 
         * Vamos a necesitar interfaces (entender más o menos qué son). Simplificando, una interfaz es una "clase abstracta de métodos (públicos) abstractos".
         * Es decir, nunca se va a instanciar, y solo "obliga" a otras clases a implementar los métodos que la interfaz tenga.
         * 
         * Las estructuras de datos son maneras de almacenar, procesar, acceder y guardar datos. Hay 2 grandes distinciones dentro de 
         * las estructuras de datos (según su interfáz raíz): colecciones y mapeos.
         * 
         * "coleciones" son objetos que representan un grupo sin tamaño definido de elementos (otros objetos) que se pueden 
         * iterar (implementan la interfaz Iterable ver https://www.geeksforgeeks.org/iterable-interface-in-java/). Es la interfaz raíz de las colecciones basadas en List, Set, Queue (ver mapa de jerarquía)
         * 
         * Los mapeos (Maps) por otro lado van a almacenar los datos de manera key-value (no hay un orden, no son iterables, para acceder a un elemento
         * tengo que dar la key)
         * 
         * Según lo que pretendas hacer con los datos, conviene más usar un tipo de colección u otra. Hay que tener una idea general de qué 
         * te permite hacer cada una.
         * 
         * Por empezar por algún sitio, empezamos conociento qué me permite ahcewr la interfaz Collections (que hereda de Iterable, que lo que me
         * permite es recorrer elementos).
         * 
         * (Revisar si todos estos métodos siguen "vivos"). La interfaz Collections me da estos métodos:
         * 
         * (ver esto también: https://www.geeksforgeeks.org/collections-in-java-2/ https://www.javatpoint.com/collections-in-java, )
         * 
         * int size() --> devuelve tamaño de la collection
         * boolean isEmpty() --> true si está vacío
         * void clear() --> lo vacía
         * boolean contains(Object elemento) --> true si el elemento es parte de la colección
         * boolean containsAll(Collection<?> collection) --> true si collection es un subconjunto de elementos de la coleción
         * boolean add(E elemento) --> añade elemento y dice true si la colección se modifica (por ejemplo en Set no puedo tener duplicados)
         * boolean addAll(Collection<? extends E> collection) --> añade los elementos de collection y dice si ha cambiado
         * boolean remove(Object element) --> elimina el elemento y dice si la colección ha cambiado
         * boolean removeAll(Collection<?> collection) --> igual que el de arriba pero con subconjunto
         * boolean retainAll(Collection<?> collection) --> elimina de la colección lo que noi esté en collection
         * Iterator<E> iterator() --> de vuelve un iterador de la colección de tipo E
         * Object[] toArray() --> devuelve un arry de los elementos de la colección
         * (habrá más...)
         * 
         * Es decir, todas estos métodos son generales, pueden implementarlos cualquier cosa que esté por debajo de Collection
         * 
         * Interfaz List
         * Las clases que implementan esta interfaz representan colecciones que:
         * están ordenadas
         * pueden tener duplicados
         * puedo acceder por posición
         * 
         * Debajo de la interfaz List tenemos las clases ArrayList, LinkedList, Vector (en ppio deprecated) y Stack (que extiende Vector)
         *  
         */


         
    }
}
