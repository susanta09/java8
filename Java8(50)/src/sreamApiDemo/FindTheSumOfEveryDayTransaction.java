package sreamApiDemo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class Transaction
{
	private LocalDate date;
	private Double amount;
	public Transaction(LocalDate date, Double amount) {
		super();
		this.date = date;
		this.amount = amount;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
}
public class FindTheSumOfEveryDayTransaction {
	public static void main(String[] args) {
		List<Transaction> tran=Arrays.asList(
				new Transaction(LocalDate.parse("2020-04-20"), 100.0),
				new Transaction(LocalDate.parse("2020-04-20"), 120.40),
				new Transaction(LocalDate.parse("2020-05-20"), 50.50),
				new Transaction(LocalDate.parse("2020-05-20"), 50.50),
				new Transaction(LocalDate.parse("2020-06-20"), 100.0));
		Map<LocalDate,Double>map=tran.stream()
				.collect(Collectors.groupingBy(Transaction::getDate,
						LinkedHashMap::new,
						Collectors.summingDouble(Transaction::getAmount)));
		map.forEach((date,sum)->{
			System.err.println(date+" : "+sum);
		});
	}
}
