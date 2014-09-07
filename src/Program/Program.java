package Program;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Preke> prekes = new ArrayList<Preke>() {
			{
				add(new Preke() {
					{
						setKaina(new BigDecimal(10.15));
						setKiekis(5);
						setKodas("1");
						setPavadinimas("Preke1");
					}
				});

				add(new Preke() {
					{
						setKaina(new BigDecimal(10.15));
						setKiekis(5);
						setKodas("2");
						setPavadinimas("Preke2");
					}
				});

			}

		};

		prekes.forEach(pr -> System.out.println(pr.getKodas()+" "+pr.getPavadinimas()+" "+pr.getKiekis()+" "+ pr.getKaina().doubleValue()));

	}

}
