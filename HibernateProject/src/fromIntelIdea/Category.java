package fromIntelIdea;

import javax.persistence.*;
import java.util.*;

/**
 * Created by IBM_ADMIN on 12/29/2016.
 */
@Entity
@Table(name = "CATEGORY",catalog = "rajeshDb")
public class Category implements java.io.Serializable {
    private Integer categoryId;
    private String name;
    private  String desc;
    private Set<Stock> stockSet = new HashSet<>();

    public Category(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CATEGORY_ID",nullable = false,unique = true)
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
    @Column(name="CATEGORY_NAME",nullable = false,length = 15)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name="CATEGORY_DESC",nullable = false,length = 30)
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "categories")
    public Set<Stock> getStockSet() {
        return stockSet;
    }

    public void setStockSet(Set<Stock> stockSet) {
        this.stockSet = stockSet;
    }

    public Category(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public Category(String name, String desc, Set<Stock> stockSet) {
        this.name = name;
        this.desc = desc;
        this.stockSet = stockSet;
    }


}
