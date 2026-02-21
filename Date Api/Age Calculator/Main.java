import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener {

    Main() {
        setLayout(new GridLayout(4, 1));

        selectAge = new JButton("Select Your Birthday");
        selectAge.addActionListener(this);
        selectAge.setBackground(Color.red);

        fol = new Font("Times New Roman", 1, 30);

        dateSelected = new JTextField(" ", 30);
        dateSelected.setFont(fol);
        dateSelected.setEditable(false);

        todaysDate = new JTextField("", 30);
        todaysDate.setFont(fol);
        todaysDate.setEditable(false);

        age = new JTextField(" ", 30);
        age.setFont(fol);
        age.setEditable(false);

        add(selectAge);
        add(dateSelected);
        add(todaysDate);
        add(age);

        age.setVisible(false);
        dateSelected.setVisible(false);
        todaysDate.setVisible(false);

        setTitle("Age Calculator");
        setSize(600, 600);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(3);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent actionevent) {
        if (actionevent.getSource() == selectAge) {
            child = new AgeCalculator(this);
            try {
                child.start();
            } catch (Exception exception) {
                System.out.println("ERRor");
            }
        }
    }

    public String calculate(int ai[], int ai1[]) {
        LocalDate localdate = LocalDate.of(ai1[2], ai1[1], ai1[0]);
        LocalDate localdate1 = LocalDate.of(ai[2], ai[1], ai[0]);
        Period period = Period.between(localdate, localdate1);

        int ai2[] = new int[3];
        ai2[0] = period.getDays();
        ai2[1] = period.getMonths();
        ai2[2] = period.getYears();

        if (ai2[0] >= 0 && ai2[1] >= 0 && ai2[2] >= 0) {
            if (ai2[0] == 0 && ai2[1] == 0) {
                String s = "<html><font color=#A62A2A>On your special day</font>, \nI wish you good luck. I hope this wonderful day will fill up your heart with joy and blessings, \nHave a fantastic birthday, celebrate the happiness on every day of your life. Happy Birthday!! \n\n from-HitRo.";
                JOptionPane.showMessageDialog(this, s, "Hpy BirthDay 2 You", -1);
            }
            return (new StringBuilder()).append("Year:").append(ai2[2]).append(" Month :").append(ai2[1])
                    .append(" Day:").append(ai2[0]).toString();
        } else {
            return "You Still Not Born";
        }
    }

    public void getResult(String s) {
        if (s.equals("")) {
            System.out.println("Please select a date");
        } else {
            Date date = new Date();
            String as[] = s.split("/");
            int ai[] = new int[3];
            int ai1[] = new int[as.length];

            for (int k = 0; k < as.length; k++) {
                ai1[k] = Integer.parseInt(as[k]);
            }

            GregorianCalendar gregoriancalendar = new GregorianCalendar();
            gregoriancalendar.setTime(date);
            ai[2] = gregoriancalendar.get(1);
            ai[1] = gregoriancalendar.get(2) + 1;
            ai[0] = gregoriancalendar.get(5);

            ai1[1]++; // Month adjustment

            String s1 = (new StringBuilder()).append(ai1[0]).append("/").append(ai1[1]).append("/").append(ai1[2])
                    .toString();
            dateSelected.setText((new StringBuilder()).append("Your BirthDay: ").append(s1).toString());

            String res = calculate(ai, ai1);
            age.setText((new StringBuilder()).append("Your age: ").append(res).toString());
            todaysDate.setText((new StringBuilder()).append("Todays Date: ").append(ai[0]).append("/").append(ai[1])
                    .append("/").append(ai[2]).toString());

            todaysDate.setVisible(true);
            age.setVisible(true);
            dateSelected.setVisible(true);
        }
    }

    JButton selectAge;
    JTextField dateSelected;
    JTextField todaysDate;
    JTextField age;
    Font fol;
    AgeCalculator child;
    static boolean stopFlag = false;

}