package stringdemo;

import java.util.stream.IntStream;

public class Testing {

	public static void main(String[] args) {
		String command = "JL | DL_BE_SVC_RB5 |  | false |\r\n" + 
				" @SetTV1(@DictAdd(Loop.temp1 ,Entry.key ,@UDFBESVCRB5(Entry.dictValue ,@DictSelectValue(HL_PI_PRD5:imp_svc_er_dict ,Entry.key ),@DictSelectValue(HL_PI_PRD5:empl_stat_annual_dict ,Entry.key ),@DictSelectValue(HL_PI_PRD5:earnings_dict ,Entry.key ),@DictSelectValue(HL_PI_PRD5:rb_wks_reported_dict ,Entry.key )))) | Loop.temp1 | @DictGenerateNew() | 0 | 0 | 0 | 0 | true | Dicitonary|17";
		String[] arr = command.split("\\|");
		
		
		/*
		 * try { int lenghOfArr = 3; System.out.println(arr[arr.length-1]);
		 * if(arr[arr.length-1].trim().equals("true") ||
		 * arr[arr.length-1].trim().equals("false")) { lenghOfArr = 2; }
		 * System.out.println(arr[arr.length-lenghOfArr]);
		 * 
		 * System.out.println(Boolean.parseBoolean(arr[arr.length-lenghOfArr-1]));
		 * }catch(Exception e) { System.out.println(e); }
		 */
		
		IntStream.range(6, arr.length-3).forEach(i -> {
			System.out.println(arr[i]);
		});

	}

}
