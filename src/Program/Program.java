package Program;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		//List'o kurimas
		List<Preke> prekes = new ArrayList<Preke>() {
			private static final long serialVersionUID = 1L;

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

		//Prekiu redagavimas
		prekes.forEach(p->p.setKodas(p.getKodas()+"1"));
		
		//Prekiu spausdinimas
		prekes.forEach(pr -> System.out.println(pr.getKodas()+" "+pr.getPavadinimas()+" "+pr.getKiekis()+" "+ pr.getKaina().doubleValue()));

	}

}
