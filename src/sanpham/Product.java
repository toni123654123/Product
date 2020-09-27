package sanpham;

public class Product {
    private Integer id;
    private String name;
    private String chatluong;

    public Product() {
    }

    public Product(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.chatluong = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChatluong() {

        return chatluong;
    }

    public void setChatluong(String chatluong) {

        this.chatluong = chatluong;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", chatluong='" + chatluong + '\'' +
                '}';
    }
}
