package model.exceptions;

public class DomainException extends Exception{
	private static final long serialVersionUID = 1L;
	
	/*É feito um construtor que recebe String como argumento, vai passar para o construtor da super classe
	   Isso é feito para permitir que possa instaciar na Exceção personalizada passando uma mensagem para ela
	   Essa mensagem vai ficar armazenada dentro da exceção
	 */
	
	public DomainException(String msg) {
		super(msg);
	}

}
