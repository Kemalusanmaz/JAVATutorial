public interface IEntityRepository<T extends IEntity > { //bu sayede IEntity'yi implement eden sınıfları sadece tip olarak verebilirz.

    void add(T entity);
    void delete(T entity);
    void update(T entity);
}
