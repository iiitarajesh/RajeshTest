package fromIntelIdea;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by IBM_ADMIN on 12/29/2016.
 */
@Entity
@Table(name = "STOCK" ,catalog = "rajeshDb",uniqueConstraints = {
        @UniqueConstraint(columnNames = "stockcode"),@UniqueConstraint(columnNames = "stockname")
})
public class Stock implements java.io.Serializable {

    private Integer stockId;
    private String stockCode;
    private String stockName;

    private Set<Category> categories= new HashSet<>();

    public Stock(){}

    public Stock(String stockCode, String stockName) {
        this.stockCode = stockCode;
        this.stockName = stockName;
    }

    public Stock(String stockCode, String stockName, Set<Category> categories) {
        this.stockCode = stockCode;
        this.stockName = stockName;
        this.categories = categories;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="STOCK_ID",unique = true,nullable = false)
    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    @Column(name = "STOCK_CODE",nullable = false, unique = true,length = 20)
    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    @Column(name = "STOCK_NAME",unique = true, nullable = false,length = 20)
    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    @ManyToMany(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name="STOCK_CATEGORY",catalog = "rajeshDb",joinColumns = {
            @JoinColumn(name = "STOCK_ID",nullable = false,updatable = false)},
            inverseJoinColumns = {@JoinColumn(name="CATEGORY_ID",nullable = false,updatable = false)})
    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
