//Applictaion - 101
//Form for Yearwise Students Registration Report
import java.awt.*;
import java.awt.event.*;
public class Type_Report_Form extends Frame implements ActionListener
{
    Label lb_pro, lb_title1, lb_title2, lb_year;
    CheckboxGroup cbg;
    Checkbox rb_on, rb_off, rb_pool, rb_online;
    Button but_generate, but_back;
    int rep1;
    Type_Report_Form(int rep)
    {
        rep1 = rep;
        setSize(1200,500);
        setVisible(true);
        setLayout(null);
        setTitle("Application - 6");
        setBackground(Color.PINK);
        lb_pro = new Label("Students Campus Placement Information System");
        lb_title1 = new Label("Reading Drive Type to Generate");
        if(rep == 21)
            lb_title2 = new Label("DriveType wise Confirmed Placement Drives Schedule Information Report");
        else if(rep == 22)
            lb_title2 = new Label("DriveType wise Orgaized Campus Drive Information Report");
        lb_year = new Label("Enter Drive Type");
        but_generate = new Button("Generate Report");
        but_back = new Button("Back to Reports Module");
        cbg = new CheckboxGroup();
        rb_on = new Checkbox("OnCampus", cbg, true);
        rb_off = new Checkbox("OffCampus", cbg, false);
        rb_pool = new Checkbox("PoolCampus", cbg, false);
        rb_online = new Checkbox("Online", cbg, false);
        but_generate.addActionListener(this);
        but_back.addActionListener(this);

        Font f1, f2, f3;
        f1 = new Font("arial black", Font.PLAIN, 34);
        f2 = new Font("arial", Font.BOLD, 28);
        f3 = new Font("arial", Font.BOLD, 22);

        lb_pro.setFont(f1);
        lb_title1.setFont(f2);
        lb_title2.setFont(f1);
        lb_year.setFont(f3);
        rb_on.setFont(f3);
        rb_off.setFont(f3);
        rb_pool.setFont(f3);
        rb_online.setFont(f3);
        but_generate.setFont(f3);
        but_back.setFont(f3);

        add(lb_pro);
        add(lb_title1);
        add(lb_title2);
        add(lb_year);
        add(rb_on);
        add(rb_off);
        add(rb_pool);
        add(rb_online);
        add(but_generate);
        add(but_back);

        lb_pro.setBounds(60, 100, 800, 40);
        lb_title1.setBounds(225, 150, 500, 30);
        lb_title2.setBounds(10, 225, 1200, 40);
        lb_year.setBounds(225, 320, 200, 25);
        rb_on.setBounds(450, 300, 200, 30);
        rb_off.setBounds(675, 300, 200, 30);
        rb_pool.setBounds(450, 330, 200, 30);
        rb_online.setBounds(675, 330, 200, 30);
        but_generate.setBounds(175, 400, 200, 30);
        but_back.setBounds(425, 400, 300, 30);

        
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == but_generate)
        {
        	String drtype = null;
        	if(rb_on.getState()== true)
        		drtype="OnCampus";
        	else if(rb_off.getState()== true)
        		drtype="OffCampus";
        	if(rb_pool.getState()== true)
        		drtype="PoolCampus";
        	if(rb_online.getState()== true)
        		drtype="Online";
            if(rep1 == 21)
                new Type_Sch_Report(drtype);
            else if(rep1 == 22)
                ;
            dispose();
        }
        else if(ae.getSource() == but_back)
        {
            dispose();
        }
    }
    
    public static void main(String args[])
    {
        Type_Report_Form prf_obj = new Type_Report_Form(21);
        prf_obj.addWindowListener
        (
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



