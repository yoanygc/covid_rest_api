package org.business;

class ObjectNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ObjectNotFoundException(Long id) {
		super("Could not find this Item: Id=" + id);
	}
}
