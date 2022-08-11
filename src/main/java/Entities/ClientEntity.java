package Entities;

public class ClientEntity {

    private int id;
    private long phoneNumber;
    private String address;

    public ClientEntity(int id, long phoneNumber, String address) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "{Клиент : " +
                "id=" + id +
                ", номер = " + phoneNumber +
                ", адрес = " + address +
                '}';
    }
}
