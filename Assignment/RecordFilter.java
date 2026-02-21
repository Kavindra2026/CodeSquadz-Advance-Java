import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;
import java.awt.event.*;
import java.util.*;

class RecordFilter extends JFrame implements KeyListener {
    JLabel lid;
    JTextField tb;
    JTable ta;
    Connection cn;
    int columns;
    JScrollPane sp;
    DefaultTableModel model;

    public RecordFilter() {
        setSize(600, 400);
        setResizable(true);
        setLayout(null);

        lid = new JLabel("Village/Name:");
        lid.setBounds(100, 50, 100, 27);
        add(lid);

        tb = new JTextField();
        tb.setBounds(210, 50, 150, 27);
        add(tb);
        tb.addKeyListener(this);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qr_client_db", "root", "root");

            Statement ps = cn.createStatement();
            ResultSet rst = ps.executeQuery("SELECT * FROM clients LIMIT 1");
            ResultSetMetaData metaData = rst.getMetaData();
            columns = metaData.getColumnCount();

            model = new DefaultTableModel();
            for (int i = 1; i <= columns; i++) {
                model.addColumn(metaData.getColumnName(i));
                System.out.println("Column found: " + metaData.getColumnName(i));
            }

            ta = new JTable(model);
            sp = new JScrollPane(ta);
            sp.setBounds(50, 100, 500, 200);
            add(sp);

            loadAllData();

        } catch (Exception ex) {
            System.out.println("Error in constructor: " + ex);
        }

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void loadAllData() {
        try {
            clearTable();
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM clients");
            ResultSet rst = ps.executeQuery();
            while (rst.next()) {
                Vector<String> row = new Vector<>();
                for (int i = 1; i <= columns; i++) {
                    row.add(rst.getString(i));
                }
                model.addRow(row);
            }
        } catch (Exception e) {
            System.out.println("Error loading all data: " + e);
        }
    }

    public void keyPressed(KeyEvent ke) {
    }

    public void keyTyped(KeyEvent ke) {
    }

    public void keyReleased(KeyEvent ke) {
        String str = tb.getText().trim();
        try {
            clearTable();
            PreparedStatement ps;

            if (str.isEmpty()) {
                ps = cn.prepareStatement("SELECT * FROM clients");
                System.out.println("Query: SELECT * FROM clients");
            } else {
                // change 'village' and 'name' if your DB has different column names!
                String query = "SELECT * FROM clients WHERE village LIKE ? OR client_name LIKE ?";
                ps = cn.prepareStatement(query);
                ps.setString(1, "%" + str + "%");
                ps.setString(2, "%" + str + "%");
                System.out.println("Running Query: " + query + " with value: %" + str + "%");
            }

            ResultSet rst = ps.executeQuery();
            boolean found = false;
            while (rst.next()) {
                found = true;
                Vector<String> row = new Vector<>();
                for (int i = 1; i <= columns; i++) {
                    row.add(rst.getString(i));
                }
                model.addRow(row);
            }

            if (!found) {
                System.out.println(" No matching record found for: " + str);
            }

        } catch (Exception ex) {
            System.out.println("Error in keyReleased: " + ex);
        }
    }

    void clearTable() {
        model.setRowCount(0);
    }

    public static void main(String[] args) {
        new RecordFilter();
    }
}
