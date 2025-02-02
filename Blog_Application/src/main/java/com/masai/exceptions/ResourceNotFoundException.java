
package com.masai.exceptions;



public class ResourceNotFoundException extends Exception {

	
	private static final long serialVersionUID = 1L;

	String resourceName;
	String fieldName;
	Integer fieldValue;

	/**
	 * @param resourceName
	 * @param fieldName
	 * @param userId
	 */
	public ResourceNotFoundException(String resourceName, String fieldName, Integer userId) {
		super(String.format("%s Not Found With This %s : %s", resourceName, fieldName, userId));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = userId;
	}

}
