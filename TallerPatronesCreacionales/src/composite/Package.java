public interface Package<T>{
    public Package<T> Agregar(Package Producto);
    public Package<T> remover(Package Producto);
    public int<T> contar();
    public  Package<T> getChildren();
}
