package fromIntelIdea;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by IBM_ADMIN on 12/29/2016.
 */
@Entity
@Table(name = "address")
public class Address {

    private Integer id;
    private String address;
    private String city;
    private String District;
    private String state;
    private String pincode;
    private Date version;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Date getVersion() {
        return version;
    }

    public void setVersion(Date version) {
        this.version = version;
    }
}
