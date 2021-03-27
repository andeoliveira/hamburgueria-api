package br.com.anderson.oliveira.hamburgueria.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataUtils {
	
	/**
	 * O método converte um localDateTime para String no formato pt_br
	 * @author anderson oliveira
	 * @param localDateTime
	 * @return string
	 */
	public static String dateTimeParaDataStringPT_BR(LocalDateTime localDateTime) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		String formatarData = localDateTime.format(formatter);
		return formatarData;
		
	}
}
