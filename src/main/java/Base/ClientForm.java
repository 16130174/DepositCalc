package Base;
	/** Указываем на то, что класс принадлежит пакету */
import javax.swing.*;
	/** Подключаем библиотеку для создания графического интерфейса для программ  */
import javax.swing.border.EmptyBorder;
	/** Импортируем библиотеку для создания пустой рамки, которая позволяет создать отступы вокруг панели */
import java.awt.Color;
	/** Импортируем библиотеку цветов  */
import java.awt.Font;
	/** Импортируем библиотеку шрифтов */
import java.awt.event.*;
	/** Импортируем библиотеку интерфейсов ActionListener */
	/**
	* Форма для клиента
	* @author Мягков
	*
	*/
public class ClientForm extends JFrame {
	/** Создаем класс, наследуемый от класса JFrame */
	private JPanel Klien;
		/** Задаем переменную панели */
	private JLabel VSum,VSumKon,Vproc,Vsroc;
		/** Задаем переменные JLabel */
	private JTextField Summa, SummaKon, Sroc, Proc;
		/** Задаем переменные текстовых полей */
	private JButton Chet;
		/** Задаем переменную кнопки */

	public ClientForm() {

		setTitle("Калькулятор клиента");
			/** Обьявляем название формы */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			/** Определяем способ закрытия формы */
		setBounds(100, 100, 450, 300);
			/** Задаем расположение и размеры формы (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		Klien = new JPanel();
			/**  Обьявляем форму */
		Klien.setBorder(new EmptyBorder(5, 5, 5, 5));
			/** Создаем граничные отступы (сверху, слева, снизу, справа) */
		setContentPane(Klien);
			/** Заменяем панель содержимого окна, для возможности использование панелей класса JPanel */
		Klien.setLayout(null);
			/** Запрещаем использование предусмотренного по умолчанию механизма управления размещения компонентнов
			 * Используем для самостоятельного размещения компонентов */
		
		VSum = new JLabel("Введите перовначальную сумму вклада, руб.");
			/** Задаем название JLabel */
		VSum.setBounds(20, 11, 270, 24);
			/** Задаем расположение и размеры JLabel (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		Klien.add(VSum);
			/** Добавляем JLabel на панель */
		
		VSumKon = new JLabel("Введите желаемую сумму на конец срока, руб.");
			/** Задаем название JLabel */
		VSumKon.setBounds(20, 57, 280, 24);
			/** Задаем расположение и размеры JLabel (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		Klien.add(VSumKon);
			/** Добавляем JLabel на панель */
		
		Vproc = new JLabel("Введите процентную ставку, %");
			/** Задаем название JLabel */
		Vproc.setBounds(20, 103, 246, 24);
			/** Задаем расположение и размеры JLabel (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		Klien.add(Vproc);
			/** Добавляем JLabel на панель */
				Vsroc = new JLabel("Срок вашего вклада составит, мес.");
				/** Задаем название JLabel */
		Vsroc.setBounds(20, 211, 246, 24);
			/** Задаем расположение и размеры JLabel (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		Klien.add(Vsroc);
			/** Добавляем JLabel на панель */
		
		Chet = new JButton("Рассчитать");
			/** Задаем название кнопки */
		Chet.setBounds(118, 149, 164, 37);
			/** Задаем расположение и размеры кнопки (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		Klien.add(Chet);
			/** Добавляем кнопку на панель */
		
		Chet.addActionListener(e -> {
			try { 
			if ((Double.parseDouble(SummaKon.getText()))<Double.parseDouble(Summa.getText()))
					/** Ошибка несоблюдения условия "конечная сумма не должна превышать первоначальную  */	
				throw new Exception("Конечная сумма не должна быть меньше, чем первоначальная"); 

			Sroc.setText(""+(  Calculation.Calk(Double.parseDouble(SummaKon.getText()), 
					Double.parseDouble(Summa.getText()),
					Double.parseDouble(Proc.getText()))));
				/** Присваиваем текстовому полю результаты вычислений Calculation.Calk
				* Преобразуем строку в число  */
			}
			catch (Exception ex) {
					/** Обработка ошибки c выводом окна об ошибке*/
				JOptionPane.showMessageDialog(this,							
						ex.getMessage(),
						"Ошибка", 
						JOptionPane.ERROR_MESSAGE);
			}
		}
		);
		Chet.setForeground(Color.GREEN);
			/** Задаем цвет текста кнопки */
		Chet.setBackground(Color.DARK_GRAY);
			/** Определяем цвет кнопки */
		Chet.setFont(new Font("Tahoma", Font.PLAIN, 16));
			/** Задаем стиль шрифта, размер текста на кнопке */

		Summa = new JTextField();
			/** Объявляем текстовое поле */
		Summa.setBounds(294, 13, 130, 24);
			/** Задаем расположение и размеры текстового поля (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		Klien.add(Summa);
			/** Добавляем текстовое поле на панель */
		Summa.setColumns(10);
			/** Задаем длину строки*/
		
		Summa.addKeyListener(new ExeptionHandler(this));
			/** Отслеживание нажатия кнопок */

		
		SummaKon = new JTextField();
			/** Объявляем текстовое поле */
		SummaKon.setColumns(10);
			/** Задаем длину строки*/
		SummaKon.setBounds(294, 59, 130, 24);
			/** Задаем расположение и размеры текстового поля (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		Klien.add(SummaKon);
			/** Добавляем текстовое поле на панель */
		SummaKon.addKeyListener(new ExeptionHandler(this));
			
		Proc = new JTextField();
			/** Объявляем текстовое поле */
		Proc.setColumns(10);
			/** Задаем длину строки*/
		Proc.setBounds(286, 103, 138, 24);
			/** Задаем расположение и размеры текстового поля (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		Klien.add(Proc);
			/** Добавляем текстовое поле на панель */
		Proc.addKeyListener(new ExeptionHandler(this));
			/** Обработчик ошибок */
		
		Sroc = new JTextField();
			/** Объявляем текстовое поле */
		Sroc.setColumns(10);
			/** Задаем длину строки*/
		Sroc.setBounds(286, 211, 138, 24);
			/** Задаем расположение и размеры текстового поля (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		Klien.add(Sroc);
			/** Добавляем текстовое поле на панель */
		Sroc.setEditable(false);

				}
		
			}