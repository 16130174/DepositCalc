package Base;											/** Указываем на то, что класс принадлежит пакету */
import java.awt.event.*;								/** Импортируем библиотеку интерфейса ActionListener */
import javax.swing.*;									/**  Подключаем библиотеки для создания графического интерфейса для программ  */
/** 
 * Обработчик ошибок ввода
 * @author ASUS
 *
 */
public class ExeptionHandler extends KeyAdapter {
	JFrame parent;
	boolean MessageOut = true;
	/**
	 * Обработчик ошибок ввода со скрытием окна ошибки
	 * @param parent - Родительское окно
	 * @param MessageOut - Отображение окна (true по умолчанию)
	 */
	public ExeptionHandler(JFrame parent, boolean MessageOut) {
		this.parent = parent;
		this.MessageOut = MessageOut;
	}
	/**
	 * Обработчик ошибок ввода с выводом окна об ошибке
	 * @param parent - Родительское окно
	 */
	public ExeptionHandler(JFrame parent) {
		this.parent = parent;
	}

	public void keyTyped(KeyEvent e) {														/** Метод вызывается, когда пользователь нажимает клавиши на клавитуре */
		      char c = e.getKeyChar();														/** Возвращает введенный с клавиатуры символ и присваивает его переменной с */
		      if ( ((c < '0') || (c > '9')) && (c!= KeyEvent.VK_BACK_SPACE)) {  			/** Указываем условия */
		    	 if (MessageOut)
				 JOptionPane.showMessageDialog(parent,
						 "Введен недопустимый символ!",
						 "Ошибка",
						 JOptionPane.ERROR_MESSAGE);										/** Выводим сообщение об ошибке, если введены символы, отличные от чисел */
		         e.consume();																/** игнорируем введенные буквы и пробел */
		      }
		   
		}
	/**
	 * Обработчик ошибок неверного логина или пароля
	 * @param Message - Сообщение об ошибке
	 */
	public static void ErrorMessage(String Message) {
		JOptionPane.showMessageDialog(new JPanel(), Message,
				"Ошибка",
				JOptionPane.ERROR_MESSAGE);				/** Иначе создается панель сообщающая об ошибке */
	}

}
