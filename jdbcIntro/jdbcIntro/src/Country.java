public class Country {

    //getter setter ve yapıcı blokta kullanılmak için encapsulation gereği private yapılır.
    private String code;
    private String name;
    private String continent;
    private String region;

    public Country(String code,String name,String continent,String region){
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;

    }
}
