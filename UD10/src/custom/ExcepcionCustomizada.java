package custom;

public class ExcepcionCustomizada extends Exception{
	
	private String codigo_error;
	
	public ExcepcionCustomizada(String codigo_error) {
		super();
		this.codigo_error = codigo_error;
	}
	
	public ExcepcionCustomizada() {
		super();
	}
	
	@Override
	public String getMessage() {

		/*String mensaje = "";
		switch(codigo_error) {
			case "crearException":
				mensaje = "Esto es un objeto Exception";
				break;
		}*/
		
		
		
		return codigo_error;
	}
}
