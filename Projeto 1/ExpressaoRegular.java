public class ExpressaoRegular {
	public static void main(String[] args) {
		String[] s = new String[7];
		String cpf, num, pla, cond;

		/*
		s[0] = "701.563.548-48";
		s[1] = "9851-5482";
		s[2] = "84595-8954";
		s[3] = "894-451-512.84";
		s[4] = "GGG-6988";
		s[5] = "TRSD-4845";
		s[6] = "RRS-448";
		*/

		cpf = "\\d{3}.\\d{3}.\\d{3}-\\d{2}";
		num = "\\d{4}-\\d{4}|\\d{5}-\\d{4}";
		pla = "[A-Z]{3}-\\d{4}";

		cond = cpf + "|" + num + "|" + pla;

		for(String o : s)
			if(o.matches(cond))
				System.out.println(o + ": Accepetd.\n");
			else
				System.out.println(o + ": Rejected.\n");
	}
}
