/**
 * 
 */
package com.masai.payloads;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class ApiResponse {

	private LocalDateTime timestamp;

	private String message;

	private boolean status;

}
