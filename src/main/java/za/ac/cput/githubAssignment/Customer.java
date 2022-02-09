package za.ac.cput.githubAssignment;

/**
 * @author: Chad Siegelaar - 218340982
 *
 */
public class Customer  {

    private String name, custGender;
    private int custId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustGender() {
        return custGender;
    }

    public void setCustGender(String custGender) {
        this.custGender = custGender;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", customer gender=" + custGender + ", customer Id=" + custId + '}';
    }


}
