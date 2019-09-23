package com.lyf.web.pojo;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 实体类
 * @author Administrator
 *
 */
@Entity
@Table(name="tb_city")
public class City implements Serializable{

    @Id
    private String id;//ID
    private String name;
    private String ishot;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getIshot() {
        return ishot;
    }
    public void setIshot(String ishot) {
        this.ishot = ishot;
    }

}

