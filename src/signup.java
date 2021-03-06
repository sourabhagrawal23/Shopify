import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

/**
 *
 * @author Sourabh
 */
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    public signup() {
   
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        reference_caps = new javax.swing.JLabel();
        caps = new javax.swing.JLabel();
        caps1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pb1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jpt7 = new javax.swing.JTextField();
        jpt2 = new javax.swing.JTextField();
        jpt3 = new javax.swing.JTextField();
        jpt4 = new javax.swing.JTextField();
        jpt5 = new javax.swing.JTextField();
        jpt6 = new javax.swing.JTextField();
        jrb2 = new javax.swing.JRadioButton();
        jrb1 = new javax.swing.JRadioButton();
        jcb1 = new javax.swing.JComboBox();
        jpt1 = new javax.swing.JTextField();
        jpt8 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jpt9 = new javax.swing.JTextArea();
        signup_btn = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jrb3 = new javax.swing.JRadioButton();
        jrb4 = new javax.swing.JRadioButton();
        dc1 = new com.toedter.calendar.JDateChooser();
        jpt51 = new javax.swing.JLabel();
        jpt31 = new javax.swing.JLabel();
        jpt41 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SECURE SIGNUP @SASOFTECH");
        setMinimumSize(new java.awt.Dimension(1366, 725));
        setResizable(false);
        setState(1);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reference_caps.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reference_caps.setForeground(new java.awt.Color(235, 222, 17));
        reference_caps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphics-exclamation-mark-939991.gif"))); // NOI18N
        getContentPane().add(reference_caps, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 50, 60));

        caps.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        caps.setForeground(new java.awt.Color(235, 222, 17));
        getContentPane().add(caps, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 190, 160, 20));

        caps1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphics-exclamation-mark-939991.gif"))); // NOI18N
        caps1.setToolTipText("TURN CAPS LOCK OFF ");
        caps1.setContentAreaFilled(false);
        caps1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        caps1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caps1ActionPerformed(evt);
            }
        });
        getContentPane().add(caps1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 180, 190, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("                                                            shopping  habits  sorted  out  .....");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 490, 40));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Copyright © SASOFTECH TECHNOLOGY SOLUTIONS. All rights reserved.");
        jLabel6.setMaximumSize(new java.awt.Dimension(1366, 17));
        jLabel6.setMinimumSize(new java.awt.Dimension(1366, 17));
        jLabel6.setOpaque(true);
        jLabel6.setPreferredSize(new java.awt.Dimension(1366, 17));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 1366, 30));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("SIGN UP");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, -1, 30));

        pb1.setBackground(new java.awt.Color(30, 172, 219));
        pb1.setForeground(new java.awt.Color(0, 0, 0));
        pb1.setBorderPainted(false);
        getContentPane().add(pb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 1910, 20));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PLEASE PROVIDE SPECIFIED DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(255, 255, 255)));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, 40));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("First Name :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 40));

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Last Name :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 40));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 40));

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Phone No :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 40));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Date Of Birth");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, 40));

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Pincode :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 40));

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Gender :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 40));

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("State :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, 40));

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("City :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, 40));

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("UserName :");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 40));

        jpt7.setBackground(new java.awt.Color(204, 204, 204));
        jpt7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jpt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 190, 20));

        jpt2.setBackground(new java.awt.Color(204, 204, 204));
        jpt2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jpt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 220, 20));

        jpt3.setBackground(new java.awt.Color(204, 204, 204));
        jpt3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jpt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 220, 20));

        jpt4.setBackground(new java.awt.Color(204, 204, 204));
        jpt4.setColumns(10);
        jpt4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpt4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpt4KeyTyped(evt);
            }
        });
        jPanel1.add(jpt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 220, 20));

        jpt5.setBackground(new java.awt.Color(204, 204, 204));
        jpt5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpt5ActionPerformed(evt);
            }
        });
        jPanel1.add(jpt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 220, 20));

        jpt6.setBackground(new java.awt.Color(204, 204, 204));
        jpt6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpt6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpt6KeyTyped(evt);
            }
        });
        jPanel1.add(jpt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 220, 20));

        buttonGroup1.add(jrb2);
        jrb2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jrb2.setForeground(new java.awt.Color(255, 255, 255));
        jrb2.setText("Female");
        jrb2.setOpaque(false);
        jPanel1.add(jrb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        buttonGroup1.add(jrb1);
        jrb1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jrb1.setForeground(new java.awt.Color(255, 255, 255));
        jrb1.setText("Male");
        jrb1.setOpaque(false);
        jPanel1.add(jrb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 70, -1));

        jcb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ANDHRA PRADESH", "ARUNACHAL PRADESH", "ASSAM", "BIHAR", "CHANDIGARH", "CHHATTISGARH", "GOA", "GUJARAT", "HARYANA", "HIMACHAL PRADESH", "JAMMU & KASHMIR", "JHARKHAND", "KARNATAKA", "KERALA", "MADHYA PRADESH", "MAHARASHTRA", "MANIPUR", "MEGHALAYA", "MIZORAM", "NAGALAND", "ODISHA", "PUNJAB", "RAJASTHAN", "SIKKIM", "TAMIL NADU", "TELANGANA", "TRIPURA", "UTTAR PRADESH", "UTTARAKHAND", "WEST BENGAL" }));
        jPanel1.add(jcb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 190, -1));

        jpt1.setBackground(new java.awt.Color(204, 204, 204));
        jpt1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jpt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 220, 20));

        jpt8.setBackground(new java.awt.Color(204, 204, 204));
        jpt8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jpt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 190, -1));

        jpt9.setBackground(new java.awt.Color(204, 204, 204));
        jpt9.setColumns(20);
        jpt9.setLineWrap(true);
        jpt9.setRows(5);
        jpt9.setWrapStyleWord(true);
        jpt9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(jpt9);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 190, 50));

        signup_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/signupbutton.gif"))); // NOI18N
        signup_btn.setContentAreaFilled(false);
        signup_btn.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        signup_btn.setIconTextGap(0);
        signup_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_btnActionPerformed(evt);
            }
        });
        jPanel1.add(signup_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, -1, 160));

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Address :");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, -1, 40));

        buttonGroup1.add(jrb3);
        jrb3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jrb3.setForeground(new java.awt.Color(255, 255, 255));
        jrb3.setText("Male");
        jrb3.setOpaque(false);
        jPanel1.add(jrb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 70, -1));

        buttonGroup1.add(jrb4);
        jrb4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jrb4.setForeground(new java.awt.Color(255, 255, 255));
        jrb4.setText("Female");
        jrb4.setOpaque(false);
        jPanel1.add(jrb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));
        jPanel1.add(dc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 190, -1));

        jpt51.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jpt51.setForeground(new java.awt.Color(235, 222, 17));
        jPanel1.add(jpt51, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 220, 20));

        jpt31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jpt31.setForeground(new java.awt.Color(235, 222, 17));
        jPanel1.add(jpt31, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 220, 20));

        jpt41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jpt41.setForeground(new java.awt.Color(235, 222, 17));
        jPanel1.add(jpt41, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 220, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 880, 420));

        jLabel20.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 27)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(233, 232, 232));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squarespinner.gif"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 510, 70, 120));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back_main.png"))); // NOI18N
        jButton6.setToolTipText("PREVIOUS PAGE");
        jButton6.setContentAreaFilled(false);
        jButton6.setHideActionText(true);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/back_main_glow.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, 170, 80));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home.png"))); // NOI18N
        jButton7.setToolTipText("HOME");
        jButton7.setContentAreaFilled(false);
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/home2.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 120));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/head2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, -20, 390, 180));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/head1.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, -20, 390, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1870, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signup_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_btnActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobilesr","root","opjs");
            Statement stmt=con.createStatement();
            Statement stmt1=con.createStatement();
            String fn,ln,em,un,gen="",city,add,pass,state,dob;
            String pn,pc;
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
            fn=jpt1.getText();
            ln=jpt2.getText();
            em=jpt3.getText();
            pn=jpt4.getText();
            un=jpt5.getText();
            pc=jpt6.getText();
            city=jpt7.getText();
            pass=new String(jpt8.getPassword());
            dc1.setCalendar(Calendar.getInstance());
            dob=(String)sdf.format(dc1.getDate());          
            add=jpt9.getText();
            if(jrb1.isSelected()==true){
                gen="M";
            }
            else if(jrb2.isSelected()==true){
                gen="F";
            }
            state=(String) jcb1.getSelectedItem();

            if(fn==""||ln==""||em==""||pn==""||un==""||pc==""||city==""||pass==""||add==""||gen==""||state==""||dob.isEmpty()){
                JOptionPane.showMessageDialog(null,"ALL THE FIELDS ARE REQUIRED");
                signup_btn.setEnabled(false);
            }

            else{
                int conf=JOptionPane.showConfirmDialog(null,"First Name :" +fn+" Last Name :" +ln+" email :"+em+" Phone No :" +pn+" UserName :"+un+" Pincode :"+pc+" Gender :"+gen+" City :"+city+" Address :"+add+" Password :"+pass+" State :"+state+" DOB :","Confirmation",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);                
                if(conf==JOptionPane.YES_NO_OPTION){
                    Date dte = null;
                    Time tme=null;
                    String dsql="select curdate(),curtime() ;";
                    ResultSet drs=stmt.executeQuery(dsql);
                    while(drs.first()){
                        dte=drs.getDate(1);
                        tme=drs.getTime(2);
                        break;
                    }
                    String sql="insert into customers values('"+fn+"','"+ln+"','"+em+"','"+pn+"','"+un+"','"+pc+"','"+gen+"','"+state+"','"+city+"','"+pass+"','"+dob+"','"+add+"','"+dte+"','"+tme+"');";
                    stmt.executeUpdate(sql);
                    jLabel20.setVisible(true);
                    JOptionPane.showMessageDialog( this,"SIGNED UP SUCCESSFULLY");                   
                    new login1().setVisible(true);
                    dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Please Check the Details");
                }    
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"ALL THE FIELDS ARE REQUIRED","ERROR",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_signup_btnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        pb1.setVisible(false);  
Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_CAPS_LOCK, true);
jLabel20.setVisible(false);
reference_caps.setVisible(false);
 //CAPS LOCK LABEL UPDATION STARTS HERE
        caps.setVisible(true);
        caps1.setVisible(true);
        Thread t = new Thread(new Runnable(){
            private int counter = 0;
            public void run() {
                while (true){
                    counter++;
                    SwingUtilities.invokeLater(new Runnable(){
                        public void run() {
                                boolean isOn = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
                                 if(isOn==true){ 
                                     caps1.setIcon(reference_caps.getIcon());
                                     caps.setText("CAPS LOCK IS ON");
                                 }
                                 else if(isOn==false){
                                     caps1.setIcon(null);
                                     caps.setText("");         
                                 }
                        }
                    });
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.start();
        //CAPS LOCK LABEL UPDATION ENDS HERE

         //USERNAME PHONE AND EMAIL VALIDATION STARTS HERE
       Thread t1 = new Thread(new Runnable(){
            private int counter1 = 0;
            public void run() {
                while (true){
                    counter1++;
                    SwingUtilities.invokeLater(new Runnable(){
                        public void run() {
                            if (counter1 % 2 == 0){
                            try{
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobilesr","root","opjs");
                                Statement stmt=con.createStatement();
                                String qry="select email,phoneno,username from customers;";
                                ResultSet res=stmt.executeQuery(qry);
                                String em,un;
                                String pn;      
                                em=jpt3.getText();           
                                pn=jpt4.getText();
                                un=jpt5.getText();
                                int flag1 = 0,flag2 = 0,flag3 = 0;
                                Border border=BorderFactory.createLineBorder(Color.red, 2, rootPaneCheckingEnabled);
                                while(res.next()){
                                    if(em.equalsIgnoreCase(res.getString(1))){
                                          jpt31.setText("EMAIL ALREADY EXISTS");
                                          jpt3.setBorder(border);
                                          flag1=1;
                                          signup_btn.setEnabled(false);
                                    }
                                    if(pn.equals(res.getString(2))){
                                          jpt41.setText("PHONE NO ALREADY EXISTS");
                                          jpt4.setBorder(border);
                                          flag2=1;
                                          signup_btn.setEnabled(false);
                                    }
                                    if(un.equalsIgnoreCase(res.getString(3))){
                                          jpt51.setText("USERNAME ALREADY EXISTS");
                                          jpt5.setBorder(border);
                                          flag3=1;
                                          signup_btn.setEnabled(false);
                                    }
                                    
                                }
                                if(flag1!=1){
                                    signup_btn.setEnabled(true);
                                      jpt31.setText(null);
                                      jpt3.setBorder(jpt1.getBorder());
                                }
                                if(flag2!=1){
                                    signup_btn.setEnabled(true);
                                      jpt41.setText(null);
                                      jpt4.setBorder(jpt1.getBorder());
                                }
                                if(flag3!=1){
                                    signup_btn.setEnabled(true);
                                      jpt51.setText(null);
                                      jpt5.setBorder(jpt1.getBorder());
                                }
                                res.close();
                                con.close();
                                stmt.close();
                            }
                            catch(Exception e){
                                JOptionPane.showMessageDialog(null,e.getMessage());
//                                JOptionPane.showMessageDialog(null,"SORRY!! AN ERROR CREPT");
                            }
                            counter1 = 0;
                            } 
                            else {
                            }
                        }
                    });
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();
         
        //USERNAME PHONE AND EMAIL VALIDATION ENDS HERE
    }//GEN-LAST:event_formWindowOpened

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dispose();
        new login_options().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();
        new index().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void caps1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caps1ActionPerformed
        Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_CAPS_LOCK, false);
    }//GEN-LAST:event_caps1ActionPerformed

    private void jpt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpt5ActionPerformed

    private void jpt4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpt4KeyTyped
  if(jpt4.getText().length()>9&&!(evt.getKeyChar()==KeyEvent.VK_DELETE||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)) {
            getToolkit().beep();
            evt.consume();
         }
    }//GEN-LAST:event_jpt4KeyTyped

    private void jpt6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpt6KeyTyped
       if(jpt6.getText().length()>5&&!(evt.getKeyChar()==KeyEvent.VK_DELETE||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)) {
            getToolkit().beep();
            evt.consume();
         }
    }//GEN-LAST:event_jpt6KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel caps;
    private javax.swing.JButton caps1;
    private com.toedter.calendar.JDateChooser dc1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcb1;
    private javax.swing.JTextField jpt1;
    private javax.swing.JTextField jpt2;
    private javax.swing.JTextField jpt3;
    private javax.swing.JLabel jpt31;
    private javax.swing.JTextField jpt4;
    private javax.swing.JLabel jpt41;
    private javax.swing.JTextField jpt5;
    private javax.swing.JLabel jpt51;
    private javax.swing.JTextField jpt6;
    private javax.swing.JTextField jpt7;
    private javax.swing.JPasswordField jpt8;
    private javax.swing.JTextArea jpt9;
    private javax.swing.JRadioButton jrb1;
    private javax.swing.JRadioButton jrb2;
    private javax.swing.JRadioButton jrb3;
    private javax.swing.JRadioButton jrb4;
    private javax.swing.JProgressBar pb1;
    private javax.swing.JLabel reference_caps;
    private javax.swing.JButton signup_btn;
    // End of variables declaration//GEN-END:variables
}
