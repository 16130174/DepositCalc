package Base;
/** Указываем на то, что класс принадлежит пакету */
import javax.swing.*;
/**  Подключаем библиотеки для создания графического интерфейса для программ  */
import javax.swing.border.EmptyBorder;
/** Импортируем библиотеку для создания пустой рамки, которая позволяет создать отступы вокруг панели */
import java.awt.*;
/** Импортируем библиотеки оконно-графического интерфейса */
import java.awt.event.*;
/** Импортируем библиотеку интерфейса ActionListener */
/**
 * Форма калькулятора работника
 * @author Тимофеев
 *
 */
public class Rab extends JFrame {
	/** Создаем класс, наследуемый от класса JFrame */
	private JPanel contentPane;
	/** Задаем переменную панели */
	private JLabel VDate, VSumm, VSrok, VStavka,VSummaNaKon;
	/** Задаем переменные JLabel */
	private JTextField tSumm,tSrok, tStavka, tSummNaKon;
	/** Задаем переменные текстовых полей */
	private JCheckBox Capitaliz;
	/** Задаем переменную чекбокса */
	private JButton Chet;
	/** Задаем переменную кнопки */
	/**
	 * Create the frame.
	 */
	public Rab() {
		/** Создаем форму калькулятора работника */
		setTitle("Калькулятор работника");
		/** Задаем название формы */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/** Определяем способ закрытия формы */
		setBounds(100, 100, 450, 370);
		/** Задаем расположение и размеры формы (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		contentPane = new JPanel();
		/**  Обьявляем форму */
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		/** Создаем граничные отступы (сверху, слева, снизу, справа) */
		setContentPane(contentPane);
		/** Заменяем панель содержимого окна, для возможности использование панелей класса JPanel */
		contentPane.setLayout(null);
		/** Запрещаем использование предусмотренного по умолчанию механизма управления размещения компонентнов
		 															* Используем для самостоятельного размещения компонентов */
		
		VDate = new JLabel("Введите даные о вкладчике:");
		/** Задаем название JLabel */
		VDate.setBounds(25, 11, 185, 24);
		/** Задаем расположение и размеры JLabel (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		contentPane.add(VDate);
		/** Добавляем JLabel на панель */
		
		VSumm = new JLabel("Сумма вклада, руб.");
		/** Задаем название JLabel */
		VSumm.setBounds(25, 46, 122, 24);
		/** Задаем расположение и размеры JLabel (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		contentPane.add(VSumm);
		/** Добавляем JLabel на панель */
		
		VSrok = new JLabel("Срок вложения, мес.");
		/** Задаем название JLabel */
		VSrok.setBounds(25, 101, 122, 24);
		/** Задаем расположение и размеры JLabel (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		contentPane.add(VSrok);
		/** Добавляем JLabel на панель */
		
		VStavka = new JLabel("Процентая ставка, %");
		/** Задаем название JLabel */
		VStavka.setBounds(25, 149, 122, 24);
		/** Задаем расположение и размеры JLabel (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		contentPane.add(VStavka);
		/** Добавляем JLabel на панель */
		
		tSumm = new JTextField();
		/** Объявляем текстовое поле */
		tSumm.setColumns(10);
		/** Задаем длину строки*/
		tSumm.setBounds(167, 46, 257, 24);
		/** Задаем расположение и размеры текстового поля (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		contentPane.add(tSumm);
		/** Добавляем текстовое поле на панель */
		tSumm.addKeyListener(new ExeptionHandler(this));
		/** Отслеживание нажатия кнопок */
		tSrok = new JTextField();
		/** Объявляем текстовое поле */
		tSrok.setColumns(10);
		/** Задаем длину строки*/
		tSrok.setBounds(165, 101, 259, 24);
		/** Задаем расположение и размеры текстового поля (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		contentPane.add(tSrok);
		/** Добавляем текстовое поле на панель */
		tSrok.addKeyListener(new ExeptionHandler(this));
		/** Отслеживание нажатия кнопок */
		
		
		tStavka = new JTextField();
		/** Объявляем текстовое поле */
		tStavka.setColumns(10);
		/** Задаем длину строки*/
		tStavka.setBounds(167, 149, 259, 24);
		/** Задаем расположение и размеры текстового поля (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		contentPane.add(tStavka);
		/** Добавляем текстовое поле на панель */
		tStavka.addKeyListener(new ExeptionHandler(this));
		/** Отслеживание нажатия кнопок */
		
		Capitaliz = new JCheckBox("Без ежемесячной капитализации");
		/** Задаем название чекбоксу */
		Capitaliz.setBounds(170, 182, 254, 23);
		/** Задаем расположение и размеры чекбокса (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		contentPane.add(Capitaliz);
		/** Добавляем чекбокс на панель */
		
		VSummaNaKon = new JLabel("Итоговая сумма на конец срока, руб");
		/** Объявляем JLabel */
		VSummaNaKon.setBounds(25, 280, 220, 36);
		/** Задаем расположение и размеры JLabel (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		contentPane.add(VSummaNaKon);
		/** Добавляем текстовое поле на панель */
		
		tSummNaKon = new JTextField();
		/** Объявляем текстовое поле */
		tSummNaKon.setColumns(10);
		/** Задаем длину строки*/
		tSummNaKon.setBounds(245, 280, 180, 36);
		/** Задаем расположение и размеры текстового поля (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		contentPane.add(tSummNaKon);
		/** Добавляем текстовое поле на панель */
		tSummNaKon.setEditable(false);
		/** Запрещаем ввод символов */
		
		Chet = new JButton("Вычислить");
		/** Задаем название кнопки */
		Chet.addActionListener(e -> {
			double s = Double.parseDouble((tSumm.getText( )));
			double sr = Double.parseDouble((tSrok.getText( )));
			double proc = Double.parseDouble((tStavka.getText( )));
			/** Преобразуем строку в число и присваиваем переменное это значение
			 * s -строка первоначальной суммы
			 * sr - строка срока вложения
			 * proc - строка процентной ставки */
			if  (Capitaliz.isSelected()==true) {
				/** Задаем условие при нажатии на чекбокс */
				tSummNaKon.setText(""+(Calculation.CalcWithCap(s,proc,sr)));
				/** Присваиваем текстовому полю полученное значение */
			}
			else {																	/** В случае, когда нажатие на чекбокс не производится */
				tSummNaKon.setText(""+(Calculation.CalcWithoutCap(s,proc,sr)));
				/** Присваиваем текстовому полю полученное значение */
			};
		});
		Chet.setForeground(Color.GRAY);
		/** Задаем цвет текста кнопки */
		Chet.setBackground(Color.WHITE);
		/** Определяем цвет кнопки */
		Chet.setFont(new Font("Tahoma", Font.PLAIN, 16));
		/** Задаем стиль шрифта, размер текста на кнопке */
		Chet.setBounds(131, 212, 163, 40);
		/** Задаем расположение и размеры кнопки (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		contentPane.add(Chet);
		/** Добавляем кнопку на панель */
	}

}
