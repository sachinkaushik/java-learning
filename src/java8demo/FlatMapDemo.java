package java8demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {

	public static void main(String[] args) {
		String rowTx = "PPR|B2|Full structure derivation|FULL_STRUCTURE\r\nPPR|EL|Elig Date Call|ELIGDATES\r\nPPR|VS|Service Call for plans I & II|SV_RSLT\r\nPPR|ML|Service Call used for plans other than I & II|SV_RSLT2\r\nPPR|IR|Estimate Calculation Call (DBEST)|PENSCALC\r\nPPR|AA|Termination Flow Calculation Call (DBTRMC)|PENSCALC";
		String rowTx1 = "PPR|B2|Full structure derivation|FULL_STRUCTURE\r\nPPR|EL|Elig Date Call|ELIGDATES\r\nPPR|VS|Service Call for plans I & II|SV_RSLT\r\nPPR|ML|Service Call used for plans other than I & II|SV_RSLT2\r\nPPR|IR|Estimate Calculation Call (DBEST)|PENSCALC\r\nPPR|AA|Termination Flow Calculation Call (DBTRMC)|PENSCALC";

		List<Map> findFirst = Stream.of(rowTx.split("\r\n")).map(mapper).collect(Collectors.toList());

		findFirst.stream().forEach(System.out::println);

	}

}

interface Mapper extends Function {

	Object createJSONObject(String str);
}