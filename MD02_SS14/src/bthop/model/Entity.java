package bthop.model;

import java.io.Serializable;

public class Entity<ID > implements Serializable {
    public static final long serialVersionUID = 1L;
    protected ID id;
    public ID getId() {
        return id;
    }
    public void setId(ID id) {
        this.id = id;
    }
}
