public class PaqueteCompuesto<T>  implements Package  {


        Package[] children= new Array[];

        public PaqueteCompuesto()}{

        }

        public Package<T> componer(Package children){

            children.add(children);
        }
        @override 
        public Package<T> Agregar(Package Producto){
    
            //agrega el paquete compuesto a un paquete general puesto como arreglo
            Sistem.out.println("agregando paquetes compuesto");
            return Package<T>;
        }
    
        @override
        public Package<T> remover(Package Producto){
            //agrega el paquete compuesto a un paquete general
            Sistem.out.println("eliminando paquetes compuesto");
            return Package<T>;
        }
    
        @override
        public int<T> contar(){
            int contador=0;
            //cuenta los elementos de la coleccion en caso de ser 
            //un paquete simple devuelve su cantidad interna de productos
            return contador;
        @override
    
        }
        public  Package<T> getChildren(){
            Sistem.out.println("obteniedo paquetes compuesto");
            //obtiene los hijos de el paquete es decir los productos que 
            //estan dentro de paquete
            return Package<T>
    
        }
        
    
}
