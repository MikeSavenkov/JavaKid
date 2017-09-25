package MyCalculator;

/**
 * Created by fazer on 14.04.2016.
 */
import javax.swing.*;
import java.awt.*;

public class Calculator {
     // Объявление всех компонентов калькулятора
    JPanel windowContent;

    JFormattedTextField displayField;

    Button numButtons[];


    JButton buttonPoint;
    JButton buttonEqual;
    JPanel p1;

    //add
    JButton buttonPlus;
    JButton buttonMinus;
    JButton buttonDivision;
    JButton buttonMultiplication;
    JPanel p2;



    // В конструкторе создаются все компоненты
     // и добавляются на фрейм с помощью комбинации
     // BorderLayout и GridLayout
    Calculator(){

        Button[] numButtons = new Button[10];


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


        for (int i = 1; i < 10; i++) {

            numButtons[i] = new Button(String.valueOf(i));
            p1.add(numButtons[i]);
            if (i == 9) {
                numButtons[0] = new Button("0");
                p1.add(numButtons[0]);
            }


        }

        p1.add(buttonPoint);
        p1.add(buttonEqual);


        //add
        p2.add(buttonPlus);
        p2.add(buttonMinus);
        p2.add(buttonDivision);
        p2.add(buttonMultiplication);


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
