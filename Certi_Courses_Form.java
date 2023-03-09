
//Application - 8
//Students Certified Courses Form
import java.awt.*;
import java.awt.event.*;
class Certi_Courses_Form extends Frame implements ActionListener
{
    Label lb_title, lb_empid, lb_srno, lb_crtitle, lb_crdur, lb_content, lb_result;
    TextField tf_prn, tf_srno, tf_crtitle, tf_crdur, tf_content, tf_result;
    Button but_new, but_save, but_back;
    Certi_Courses_Form()
    {
        setSize(1000, 700);
        setVisible(true);
        setLayout(null);
        setTitle("Application - 8");
        setBackground(Color.PINK);
        lb_title = new Label("Registered Students Certified Courses Data Retrieval Form");
        lb_empid = new Label("Student PRN");
        lb_srno = new Label("Course Sr. No.");
        lb_crtitle = new Label("Course Title");
        lb_crdur = new Label("Course Duration");
        lb_content = new Label("Highlighted Key Content");
        lb_result = new Label("Result (in %)");
        tf_prn = new TextField();
        tf_srno = new TextField();
        tf_crtitle = new TextField();
        tf_crdur = new TextField();
        tf_content = new TextField();
        tf_result = new TextField();
        but_new = new Button("Add New Course");
        but_save = new Button("Save Course Data");
        but_back = new Button("Back to Menu");
        but_new.addActionListener(this);
        but_save.addActionListener(this);
        but_back.addActionListener(this);

        Font f1, f2, f3;
        f1 = new Font("arial black", Font.PLAIN, 34);
        f2 = new Font("arial", Font.BOLD, 28);
        f3 = new Font("arial", Font.BOLD, 22);

        lb_title.setFont(f1);
        lb_empid.setFont(f2);
        tf_prn.setFont(f3);
        lb_srno.setFont(f2);
        tf_srno.setFont(f3);
        lb_crtitle.setFont(f2);
        tf_crtitle.setFont(f3);
        lb_crdur.setFont(f2);
        tf_crdur.setFont(f3);
        lb_content.setFont(f2);
        tf_content.setFont(f3);
        lb_result.setFont(f2);
        tf_result.setFont(f3);
        but_new.setFont(f2);
        but_save.setFont(f2);
        but_back.setFont(f2);

        add(lb_title);
        add(lb_empid);
        add(tf_prn);
        add(lb_srno);
        add(tf_srno);
        add(lb_crtitle);
        add(tf_crtitle);
        add(lb_crdur);
        add(tf_crdur);
        add(lb_content);
        add(tf_content);
        add(lb_result);
        add(tf_result);
        add(but_new);
        add(but_save);
        add(but_back);


        lb_title.setBounds(40, 100, 925, 40);
        lb_empid.setBounds(200, 200, 200, 30);
        tf_prn.setBounds(550, 200, 200, 30);
        lb_srno.setBounds(200, 250, 350, 30);
        tf_srno.setBounds(550, 250, 200, 30);
        lb_crtitle.setBounds(200, 300, 350, 30);
        tf_crtitle.setBounds(550, 300, 200, 30);
        lb_crdur.setBounds(200, 350, 350, 30);
        tf_crdur.setBounds(550, 350, 200, 30);
        lb_content.setBounds(200, 400, 350, 30);
        tf_content.setBounds(550, 400, 200, 30);
        lb_result.setBounds(200, 450, 350, 30);
        tf_result.setBounds(550, 450, 200, 30);
        but_new.setBounds(100, 550, 250, 30);
        but_save.setBounds(400, 550, 250, 30);
        but_back.setBounds(700, 550, 250, 30);
        
    }
    public void actionPerformed(ActionEvent ae)
    {

    }
    public static void main(String args[])
    {
        Certi_Courses_Form arf_obj = new Certi_Courses_Form();
        arf_obj.addWindowListener(
            new WindowAdapter()
            {
                public void windowClosing(WindowEvent we)
                {
                    System.exit(0);
                }
            }
        );
    }
}