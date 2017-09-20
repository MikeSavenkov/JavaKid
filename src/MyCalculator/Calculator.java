package MyCalculator;

/**
 * Created by fazer on 14.04.2016.
 */
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Calculator {
     // Объявление всех компонентов калькулятора
    JPanel windowContent;

    JFormattedTextField displayField;
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton buttonPoint;
    JButton buttonEqual;
    JPanel p1;

    //add
    JButton buttonPlus;
    JButton buttonMinus;
    JButton buttonDivision;
    JButton buttonMultiplication;
    JPanel p2;
    //add


    // В конструкторе создаются все компоненты
     // и добавляются на фрейм с помощью комбинации
     // BorderLayout и GridLayout
    Calculator(){

        windowContent = new JPanel();
        //Задаем схему для этой панели
        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);
        //Создаем и отображаем поле
        //Добавляем его в северную область окна
        //right alignment
        displayField = new JFormattedTextField();
        displayField.setHorizontalAlignment(JTextField.RIGHT);

        windowContent.add("North",displayField);



        //Создаем кнопки, используя конструктор
        //класса JButton, который принимает текст
        //кнопки в качестве параметра

        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");

        //add
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonDivision = new JButton("/");
        buttonMultiplication = new JButton("*");
        //add

        //Создаем панель с GridLayout
        //которая содержит 12 кнопок - 10 кнопок с числами
        //и кнопки с точкой и знаком равно
        p1 = new JPanel();
        GridLayout gl = new GridLayout(4,3);
        p1.setLayout(gl);


        //add
        p2 = new JPanel();
        GridLayout gl1 = new GridLayout(4, 1);
        p2.setLayout(gl1);
        //add


        //Добавляем кнопки на панель p1
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(button0);
        p1.add(buttonPoint);
        p1.add(buttonEqual);


        //add
        p2.add(buttonPlus);
        p2.add(buttonMinus);
        p2.add(buttonDivision);
        p2.add(buttonMultiplication);
        //add



        //Помещаем панель p1 и p2 в центральную область окна
        windowContent.add("Center",p1);
        windowContent.add("East",p2);
        //Создаем фрейм и задаем его основную панель
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);



        //делаем размер окна достаточным
        //для того, чтобы вместить все компноненты
        frame.pack();
        //отображаем окно
        frame.setVisible(true);

    }




    public static void main(String [] args){
        Calculator calc = new Calculator();
    }

}
