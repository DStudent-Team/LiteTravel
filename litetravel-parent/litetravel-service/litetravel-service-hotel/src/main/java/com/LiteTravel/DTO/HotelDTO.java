package com.LiteTravel.DTO;

import lombok.Data;

import java.util.List;

@Data
public class HotelDTO {
    private Integer hotelId;
    private String hotelName;
    private Integer hotelMinPrice;
    private Integer hotelManagerId;
    private String hotelPhone;
    private Integer hotelReplyLevel;
    private Integer hotelAddress;
    private String hotelAddressString;
    private String hotelAddressSpecific;
    private String hotelImgUri;
    private Integer hotelReplyCount;
    private String hotelDescription;
    private List<RoomDTO> rooms;
}
