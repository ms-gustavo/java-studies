package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
			
		
		LocalDate d01 = LocalDate.now();
		System.out.println("Data local: " + d01);
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("Data + hora local: " + d02);
		Instant d03 = Instant.now();
		System.out.println("Data + hora global com TZ: " + d03);
		LocalDate d04 = LocalDate.parse("2025-04-08");
		System.out.println("Horário em ISO 8601 para Date: " + d04);
		LocalDateTime d05 = LocalDateTime.parse("2025-04-08T12:00:01");
		System.out.println("Horário em ISO 8601 para Date com hora: " + d05);
		Instant d06 = Instant.parse("2025-04-08T12:00:01Z");
		System.out.println("Horário em ISO 8601 para Date com hora global GMT: " + d06);
		Instant d07 = Instant.parse("2025-04-08T12:00:01-03:00");
		System.out.println("Horário em ISO 8601 para Date com hora global GMT-3: " + d07);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		System.out.println("Data formato customizado: " + d08);
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d09 = LocalDateTime.parse("08/04/1995 01:30", fmt2);
		System.out.println("Data + horário em formato customizado: " + d09);
		
		LocalDate d10 = LocalDate.of(1995, 4, 8);
		System.out.println("Data isolado: " + d10);
		LocalDateTime d11 = LocalDateTime.of(1995, 4, 8, 1, 30);
		System.out.println("Data + horário isolado: " + d11);
		
		System.out.println("------- DATA HORA -> TEXTO ----------");
		LocalDate dh01 = LocalDate.parse("1995-04-08");
		LocalDateTime dh02 = LocalDateTime.parse("1995-04-08T01:30:01");
		Instant dh03 = Instant.parse("1995-04-08T01:30:01Z");
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("dh01 = " + dh01);
		System.out.println("dh01 = " + dh01.format(fmt3));
		System.out.println("dh01 = " + fmt3.format(dh01));
		System.out.println("dh01 = " + dh01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("dh02 = " + dh02);
		System.out.println("dh02 = " + dh02.format(fmt3));
		System.out.println("dh02 = " + dh02.format(fmt4));
		
		DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		System.out.println("dh03 Horário de Londres = " + dh03);
		System.out.println("dh03 Horário do Sistema do usuário (SP) = " + fmt5.format(dh03));
		
		DateTimeFormatter fmt6 = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println("dh02 = " + dh02.format(fmt6));
		DateTimeFormatter fmt7 = DateTimeFormatter.ISO_INSTANT;
		System.out.println("dh03 = " + fmt7.format(dh03));
		
		System.out.println("-------- OPERAÇÕES COM DATA-HORA -----------");
		
		LocalDate ld = LocalDate.parse("1995-04-08");
		LocalDateTime ldt = LocalDateTime.parse("1995-04-08T01:30:30");
		Instant ins = Instant.parse("1995-04-08T01:30:30Z");
		
		System.out.println("Converter data-hora Global para Local (Fornecer TZ)");
		LocalDate insToLd = LocalDate.ofInstant(ins, ZoneId.systemDefault());
		System.out.println("Instant para LocalDate considerando TZ do Sistema do Usuario = " + insToLd);
		LocalDate insToLdPT = LocalDate.ofInstant(ins, ZoneId.of("Portugal"));
		System.out.println("Instant para LocalDate considerando TZ de Portugal = " + insToLdPT);
		
		LocalDateTime insToLdt = LocalDateTime.ofInstant(ins, ZoneId.systemDefault());
		System.out.println("Instant para LocalDateTime considerando TZ do Sistema do Usuario = " + insToLdt);
		LocalDateTime insToLdtPT = LocalDateTime.ofInstant(ins, ZoneId.of("Portugal"));
		System.out.println("Instant para LocalDateTime considerando TZ do Sistema do Usuario = " + insToLdtPT);	
		System.out.println("--OBTER DADOS DE HORÁRIO LOCAL--");
		System.out.println("ld dia = " + ld.getDayOfMonth());
		System.out.println("ld mês = " + ld.getMonthValue());
		System.out.println("ld mês = " + ld.getMonth());
		System.out.println("ld ano = " + ld.getYear());
		System.out.println("ldt hora = " + ldt.getHour());
		System.out.println("ldt min = " + ldt.getMinute());
		System.out.println("ldt sec = " + ldt.getSecond());
		
		System.out.println("------------------- CÁLCULOS COM DATA-HORA --------------------");
		// Objeto DATA-HORA são imutaveis : Criar outro objeto alterado
		LocalDate calcld = LocalDate.parse("1995-04-08");
		LocalDateTime calcldt = LocalDateTime.parse("1995-04-08T01:30:30");
		Instant calcins = Instant.parse("1995-04-08T01:30:30Z");
		
		LocalDate pastWeekLocalDate = calcld.minusDays(7);
		LocalDate nextWeekLocalDate = calcld.plusDays(7);
		LocalDate nextYearLocalDate = calcld.plusYears(1);
		System.out.println("Local Date : " + calcld);
		System.out.println("Past Week Local Date: " + pastWeekLocalDate);
		System.out.println("Next Week Local Date: " + nextWeekLocalDate);
		System.out.println("Next Year Local Date: " + nextYearLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = calcldt.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = calcldt.plusDays(7);
		LocalDateTime nextYearLocalDateTime = calcldt.plusYears(1);
		LocalDateTime nextHourLocalDateTime = calcldt.plusHours(1);
		System.out.println("Local Date Time : " + calcldt);
		System.out.println("Past Week Local Date Time: " + pastWeekLocalDateTime);
		System.out.println("Next Week Local Date Time: " + nextWeekLocalDateTime);
		System.out.println("Next Year Local Date Time: " + nextYearLocalDateTime);
		System.out.println("Next Hour Local Date Time: " + nextHourLocalDateTime);
		
		Instant pastWeekInstant = calcins.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = calcins.plus(7, ChronoUnit.DAYS);
//		Instant nextYearInstant = calcins.plus(7, ChronoUnit.YEARS);
		Instant nextHourInstant = calcins.plus(1, ChronoUnit.HOURS);
		System.out.println("Instant : " + calcins);
		System.out.println("Past Week Instant: " + pastWeekInstant);
		System.out.println("Next Week Instant: " + nextWeekInstant);
//		System.out.println("Next Year Instant: " + nextYearInstant);
		System.out.println("Next Hour Instant: " + nextHourInstant);
		
		System.out.println("------ DURAÇÃO ENTRE DATAS --------");
		Duration t1 = Duration.between(pastWeekLocalDateTime, calcldt);
		System.out.println("Duração entre as datas LDT = " + t1.toDays());
		
		Duration t2 = Duration.between(pastWeekLocalDate.atTime(0, 0), calcld.atStartOfDay());
		System.out.println("Duração entre as datas LD = " + t2.toDays());
		
		Duration t3 = Duration.between(pastWeekInstant, calcins);
		System.out.println("Duração entre as datas Ins = " + t3.toDays());
		Duration t4 = Duration.between(calcins, pastWeekInstant);
		System.out.println("Duração entre as datas Ins = " + t4.toDays());
		
	}

}
