package com.LiteTravel.mybatis.pojo;

import javax.persistence.*;

@Table(name = "`travel_hotel`")
public class Hotel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_hotel.hotel_id
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    private Integer hotelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_hotel.hotel_name
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    private String hotelName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_hotel.hotel_min_price
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    private Integer hotelMinPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_hotel.hotel_manager_id
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    private Integer hotelManagerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_hotel.hotel_phone
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    private String hotelPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_hotel.hotel_reply_level
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    private Integer hotelReplyLevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_hotel.hotel_address
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    private Integer hotelAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_hotel.hotel_address_specific
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    private String hotelAddressSpecific;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_hotel.hotel_img_uri
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    private String hotelImgUri;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_hotel.hotel_reply_count
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    private Integer hotelReplyCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_hotel.hotel_description
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    private String hotelDescription;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_hotel.hotel_id
     *
     * @return the value of travel_hotel.hotel_id
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public Integer getHotelId() {
        return hotelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_hotel.hotel_id
     *
     * @param hotelId the value for travel_hotel.hotel_id
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_hotel.hotel_name
     *
     * @return the value of travel_hotel.hotel_name
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_hotel.hotel_name
     *
     * @param hotelName the value for travel_hotel.hotel_name
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName == null ? null : hotelName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_hotel.hotel_min_price
     *
     * @return the value of travel_hotel.hotel_min_price
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public Integer getHotelMinPrice() {
        return hotelMinPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_hotel.hotel_min_price
     *
     * @param hotelMinPrice the value for travel_hotel.hotel_min_price
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public void setHotelMinPrice(Integer hotelMinPrice) {
        this.hotelMinPrice = hotelMinPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_hotel.hotel_manager_id
     *
     * @return the value of travel_hotel.hotel_manager_id
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public Integer getHotelManagerId() {
        return hotelManagerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_hotel.hotel_manager_id
     *
     * @param hotelManagerId the value for travel_hotel.hotel_manager_id
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public void setHotelManagerId(Integer hotelManagerId) {
        this.hotelManagerId = hotelManagerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_hotel.hotel_phone
     *
     * @return the value of travel_hotel.hotel_phone
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public String getHotelPhone() {
        return hotelPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_hotel.hotel_phone
     *
     * @param hotelPhone the value for travel_hotel.hotel_phone
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public void setHotelPhone(String hotelPhone) {
        this.hotelPhone = hotelPhone == null ? null : hotelPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_hotel.hotel_reply_level
     *
     * @return the value of travel_hotel.hotel_reply_level
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public Integer getHotelReplyLevel() {
        return hotelReplyLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_hotel.hotel_reply_level
     *
     * @param hotelReplyLevel the value for travel_hotel.hotel_reply_level
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public void setHotelReplyLevel(Integer hotelReplyLevel) {
        this.hotelReplyLevel = hotelReplyLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_hotel.hotel_address
     *
     * @return the value of travel_hotel.hotel_address
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public Integer getHotelAddress() {
        return hotelAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_hotel.hotel_address
     *
     * @param hotelAddress the value for travel_hotel.hotel_address
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public void setHotelAddress(Integer hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_hotel.hotel_address_specific
     *
     * @return the value of travel_hotel.hotel_address_specific
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public String getHotelAddressSpecific() {
        return hotelAddressSpecific;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_hotel.hotel_address_specific
     *
     * @param hotelAddressSpecific the value for travel_hotel.hotel_address_specific
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public void setHotelAddressSpecific(String hotelAddressSpecific) {
        this.hotelAddressSpecific = hotelAddressSpecific == null ? null : hotelAddressSpecific.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_hotel.hotel_img_uri
     *
     * @return the value of travel_hotel.hotel_img_uri
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public String getHotelImgUri() {
        return hotelImgUri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_hotel.hotel_img_uri
     *
     * @param hotelImgUri the value for travel_hotel.hotel_img_uri
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public void setHotelImgUri(String hotelImgUri) {
        this.hotelImgUri = hotelImgUri == null ? null : hotelImgUri.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_hotel.hotel_reply_count
     *
     * @return the value of travel_hotel.hotel_reply_count
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public Integer getHotelReplyCount() {
        return hotelReplyCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_hotel.hotel_reply_count
     *
     * @param hotelReplyCount the value for travel_hotel.hotel_reply_count
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public void setHotelReplyCount(Integer hotelReplyCount) {
        this.hotelReplyCount = hotelReplyCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_hotel.hotel_description
     *
     * @return the value of travel_hotel.hotel_description
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public String getHotelDescription() {
        return hotelDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_hotel.hotel_description
     *
     * @param hotelDescription the value for travel_hotel.hotel_description
     *
     * @mbg.generated Mon Feb 24 17:39:19 CST 2020
     */
    public void setHotelDescription(String hotelDescription) {
        this.hotelDescription = hotelDescription == null ? null : hotelDescription.trim();
    }
}