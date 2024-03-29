package br.com.sp.softplayer.core.exceptions;

/**
 * This exception is used to mark (fatal) failures in infrastructure and system code. *
 * @author Christian Bauer <christian@hibernate.org>
 */
public class InfrastructureException
	extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InfrastructureException() {
	}

	public InfrastructureException(String message) {
		super(message);
	}

	public InfrastructureException(String message, Throwable cause) {
		super(message, cause);
	}

	public InfrastructureException(Throwable cause) {
		super(cause);
	}
	
	public String getNameException(){
		return InfrastructureException.class.getSimpleName();
	}
}
