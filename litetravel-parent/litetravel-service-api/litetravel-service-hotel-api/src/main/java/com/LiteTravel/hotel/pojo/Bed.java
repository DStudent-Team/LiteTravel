package com.LiteTravel.hotel.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "travel_bed")
public class Bed {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_bed.bed_id
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer bedId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_bed.bed_name
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    private String bedName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_bed.bed_size
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    private BigDecimal bedSize;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_bed.bed_id
     *
     * @return the value of travel_bed.bed_id
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public Integer getBedId() {
        return bedId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_bed.bed_id
     *
     * @param bedId the value for travel_bed.bed_id
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public void setBedId(Integer bedId) {
        this.bedId = bedId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_bed.bed_name
     *
     * @return the value of travel_bed.bed_name
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public String getBedName() {
        return bedName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_bed.bed_name
     *
     * @param bedName the value for travel_bed.bed_name
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public void setBedName(String bedName) {
        this.bedName = bedName == null ? null : bedName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_bed.bed_size
     *
     * @return the value of travel_bed.bed_size
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public BigDecimal getBedSize() {
        return bedSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_bed.bed_size
     *
     * @param bedSize the value for travel_bed.bed_size
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public void setBedSize(BigDecimal bedSize) {
        this.bedSize = bedSize;
    }
}