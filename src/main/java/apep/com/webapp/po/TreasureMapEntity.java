package apep.com.webapp.po;

import javax.persistence.*;

/**
 * Created by MACHENIKE on 2017/12/17.
 */
@Entity
@Table(name = "treasure_map", schema = "", catalog = "mhxy")
public class TreasureMapEntity {
    private double x;
    private double y;
    private String item;
    private String address;
    private int id;

    @Basic
    @Column(name = "x", nullable = false, insertable = true, updatable = true, precision = 0)
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Basic
    @Column(name = "y", nullable = false, insertable = true, updatable = true, precision = 0)
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Basic
    @Column(name = "item", nullable = true, insertable = true, updatable = true, length = 9)
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Basic
    @Column(name = "address", nullable = true, insertable = true, updatable = true, length = 10)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TreasureMapEntity that = (TreasureMapEntity) o;

        if (Double.compare(that.x, x) != 0) return false;
        if (Double.compare(that.y, y) != 0) return false;
        if (id != that.id) return false;
        if (item != null ? !item.equals(that.item) : that.item != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (item != null ? item.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }
}
