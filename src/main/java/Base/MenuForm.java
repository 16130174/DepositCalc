package Base;								/** Указываем на то, что класс принадлежит пакету */
import javax.swing.*;						/**  Подключаем библиотеку для создания графического интерфейса для программ  */
import java.awt.*;							/** Импортируем библиотеки оконно - графического интерфейса */
import javax.swing.border.EmptyBorder;		/** Импортируем библиотеку для создания пустой рамки, которая позволяет создать отступы вокруг панели */
import java.awt.event.*;					/** Импортируем библиотеку интерфейсов ActionListener */

/**
 * Создаем класс меню
 * @author Портнов
 *
 */
public class MenuForm extends JFrame {				/** Создаем класс, наследуемый от класса JFrame */
	private JPanel contentPane;						/** Задаем переменную панели */
	private JTextField textField, textField_1;		/** Задаем переменные текстовых полей */
	private ActionListener e;						/** Задаем переменную для слушателя */
	String login="admin";							/** Задаем значения переменной логина для формы работника */
	String password="2007";							/** Задаем значения переменной пароля для формы работника */
	String login_kl="user"; 						/** Задаем значения переменной логина для формы клиента */
	String password_kl="7000";						/** Задаем значения переменной пароля для формы клиента */
	
	/**
	 * Создаем форму меню
	 */
	public MenuForm() {
		setTitle("Меню");									/** Обьявляем название формы */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		/** Определяем способ закрытия формы */
		setBounds(100, 100, 450, 300);						/** Задаем расположение и размеры формы (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		contentPane = new JPanel();							/**  Обьявляем форму */
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));	/** Создаем граничные отступы (сверху, слева, снизу, справа) */
		
		JLabel text = new JLabel("Введите логин:");			/** Задаем название JLabel */
		setContentPane(contentPane);						/** Заменяем панель содержимого окна, для возможности использование панелей класса JPanel */
		contentPane.setLayout(null);						/** Запрещаем использование предусмотренного по умолчанию механизма управления размещения компонентнов
		 														* Используем для самостоятельного размещения компонентов */
		
		JToggleButton Rab = new JToggleButton("Работник");	/** Задаем название кнопки-переключателя */
		Rab.setBounds(28, 23, 152, 49);						/** Задаем расположение и размеры кнопки-переключателя (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		contentPane.add(Rab);								/** Добавляем кнопку на панель */
		Rab.setBackground(new Color(200,250,250));			/** Задаем цвет кнопки-переключателя "Работник" */
		
		JToggleButton Klient = new JToggleButton("Клиент");	/** Задаем название кнопки-переключателя */
		Klient.setBounds(272, 23, 152, 49);					/** Задаем расположение и размеры кнопки-переключателя (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		contentPane.add(Klient);							/** Добавляем кнопку на панель */
		Klient.setBackground(new Color(200,250,250));		/** Задаем цвет кнопки-переключателя "Клиент" */
		ButtonGroup group = new ButtonGroup();				/** Задаем пременную для группы кнопок
		 														* Для кнопок добавленных в группу будет действовать правило, когда включается одна кнопка, остальные отклчаются */
		group.add(Rab);										/** Добавляем кнопку "Работник" в группу */
		group.add(Klient);									/** Добавляем кнопку "Клиент" в группу */
		
		JLabel label = new JLabel("Введите логин");			/** Задаем название JLabel */
		label.setBounds(28, 105, 152, 34);					/** Задаем расположение и размеры JLabel (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		contentPane.add(label);								/** Добавляем JLabel а панель */
		
		JLabel label_1 = new JLabel("Введите пароль");		/** Задаем название JLabel */
		label_1.setBounds(28, 165, 152, 34);				/** Задаем расположение и размеры JLabel (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		contentPane.add(label_1);							/** Добавляем JLabel а панель */
		
		textField = new JTextField();						/** Объявляем текстовое поле */
		textField.setBounds(247, 105, 177, 34);				/** Задаем расположение и размеры текстового поля (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		contentPane.add(textField);							/** Добавляем текстовое поле на панель */
		textField.setColumns(10);							/** Задаем длину строки*/
		
		textField_1 = new JTextField();						/** Объявляем текстовое поле */
		textField_1.setColumns(10);							/** Задаем длину строки*/
		textField_1.setBounds(247, 165, 177, 34);			/** Задаем расположение и размеры текстового поля (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		contentPane.add(textField_1);						/** Добавляем текстовое поле на панель */
		
		
		JButton btnNewButton = new JButton("Войти");						/** Задаем название кнопки */
		btnNewButton.addActionListener(new ActionListener() {				/** Добавляем слушателя на кнопку */
			public void actionPerformed(ActionEvent e) {					/** Создаем обработчик событий */
				if (Rab.isSelected()){										/** Условие нажатия кнопки */
					 if(textField.getText().equals(login)) {				/** Проверка совпадения значения введенного в текстовое поле значения login и заданной переменной */
							if(textField_1.getText( ).equals(password)) {	/** Проверка совпадения значения введенного в текстовое поле значения password и заданной переменной */
							new Rab().setVisible(true);						/** Открытие формы калькулятора работника */
							setVisible(false);								/** Отключаение видимости формы меню */
							}else {
								ExeptionHandler.ErrorMessage("Логин или пароль введены неверно!");
							textField.setText("");
							textField_1.setText("");						/** Поля ввода очищаются*/
							}
							
						}else {
							ExeptionHandler.ErrorMessage("Логин или пароль введены неверно!");	/** Иначе создается панель сообщающая об ошибке */
						textField.setText("");
						textField_1.setText("");							/** Поля ввода очищаются*/
						}
			}
			
				if (Klient.isSelected()) {										/** Условие нажатия кнопки */
					 if(textField.getText().equals(login_kl)) {					/** Проверка совпадения значения введенного в текстовое поле значения login и заданной переменной */
							if(textField_1.getText( ).equals(password_kl)) {	/** Проверка совпадения значения введенного в текстовое поле значения password и заданной переменной */
							new ClientForm().show(); 							/** Открытие формы калькулятора клиента */
							setVisible(false);									/** Отключаение видимости формы меню */
							}else {
								ExeptionHandler.ErrorMessage("Логин или пароль введены неверно!");			/** Иначе создается панель сообщающая об ошибке */
							textField.setText("");
							textField_1.setText("");							/** Поля ввода очищаются*/
							}
							
						} else {
						ExeptionHandler.ErrorMessage("Логин или пароль введены неверно!");				/** Иначе создается панель сообщающая об ошибке */
						textField.setText("");
						textField_1.setText("");								/** Поля ввода очищаются*/
						}
				}
			}
		});
		btnNewButton.setBounds(168, 210, 93, 34);								/** Задаем размер кнопки */
		btnNewButton.setBackground(new Color(150,70,130));						/** Определяем цвет кнопки */
		contentPane.add(btnNewButton);	/** Добавляем кнопку на панель */

	}
}
