package com.cn.hotel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // shortcut for @ToString, @EqualsAndHashCode, @Getter on all fields, @Setter on all non-final fields, and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class HotelRequest {

	private String name;
	private Long rating;
	private String city;
	
}
