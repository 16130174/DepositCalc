package Base; /** Указываем на то, что класс принадлежит пакету */
 import java.awt.*; /** Импортируем библиотеки оконно - графического интерфейса */
 
 /**
  * Точка входа
  * @author Токарева
  *
  */
 public class Main {
 public static void main(String[] args) { /** Точка входа */
 EventQueue.invokeLater(new Runnable() { /** Запускаем форму из очереди потоков*/
 public void run() { /** Создание нового потока исполнения */
 try { /** Блок кода, где будут отслеживаться ошибки */
 new MenuForm().setVisible(true);/** Задаём видимость для фрейма */
 } catch (Exception e) { /** Перехват и обработка исключений */
 e.printStackTrace(); /** Печатает информацию относительно исключений (как оно произошло, в какой строчке кода) */
 				}
 			}
 		});
 	}
 
 }