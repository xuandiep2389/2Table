package will.province.model;

import javax.persistence.*;

@Entity
@Table(name = "provinces")
public class Province {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String name;

//    @OneToMany(targetEntity = Customer.class)
//    private List<Customer> customers;

    public Province() {
    }

    public Province(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<Customer> getCustomers() {
//        return customers;
//    }
//
//    public void setCustomers(List<Customer> customers) {
//        this.customers = customers;
//    }
}