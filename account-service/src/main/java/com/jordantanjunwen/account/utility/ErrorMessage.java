package com.jordantanjunwen.account.utility;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {

	private Integer errorId;
	private String errorMessage;
	private Date timeStamp;
	
}
