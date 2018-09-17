package Base;
	/** Указываем на то, что класс принадлежит пакету */
	/**
	 * Класс для вычислений депозитного вклада
	 * @author Мягков
	 *
	 */
public class Calculation {
	/**
	* Функция для расчета депозитного вклада
	* @param sk - Желаемая сумма на конец срока	
	* @param s - Первоначальная сумма
	* @param st - Процентная ставка
	* @return - Возвращает результат вычислений
	*/
	public static double Calk( double sk,double s,double st) {
			 return 12*(sk-s)/((st/100)*s);
			 	/** Формула для расчет срока вложения */
		}
	/**
	 * 
	 * @param Cap_sel -Ежемесячная капитализация 
	 * @param s - Сумма вклада
	 * @param p - Процентная ставка
	 * @param sr - Срок вложения
	 * @return - Возвращает результат вычислений
	 */
	public static double CalcWithoutCap(double s,double p,double sr) { 
		 
			  return s+(((s*p*sr)/100)/12);
			  	/** Формула для расчета без капитализации */
		  }
	public static double CalcWithCap(double s,double p,double sr) {			
		
		return s*Math.pow(1+sr*p/12/100, sr);  }
				/** Формула для расчета с капитализацией */
		
	
}