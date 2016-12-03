package com.firstapp.beans;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * Created by ritomar on 11/26/16.
 */
@XmlRootElement(name = "shop")
@XmlType(propOrder = {"name", "staffName"})
@JsonPropertyOrder({"name", "staffName"})
public class Shop {
    private String name;
    private List<String> staffName;

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public List<String> getStaffName() {
        return staffName;
    }

    public void setStaffName(List<String> staffName) {
        this.staffName = staffName;
    }
}
