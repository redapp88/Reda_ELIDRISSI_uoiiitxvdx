package redaElidrissi_uoiiitxvdx.springTest.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;


public class SecurityConstants {
	
	@Autowired
	private static Environment environment;
	
	public static final String  SECRET="springTestCodespringTestCodespringTestCode123456789springTestCodespringTestCodespringTestCode123456789";
	public static final long EXPIRATION_TIME = 900_000000 ;
	public static final String TOKEN_PREFIX = "Bearer ";
	public static final String HEADER_STRING = "Authorization";

	
}
