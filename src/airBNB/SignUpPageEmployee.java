/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airBNB;

import airBNB.Helper.Auth;
import airBNB.Helper.Validate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author Administrator
 */
public class SignUpPageEmployee extends javax.swing.JFrame {
    
    private Auth auth;
    /**
     * Creates new form login
     */
    public SignUpPageEmployee() {
        initComponents();
    }
    
    public SignUpPageEmployee(Auth auth) {
        this();
        this.auth = auth;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        FrameClose = new javax.swing.JLabel();
        SignUp = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        username = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        passwordFieldConfirm = new javax.swing.JPasswordField();
        fName = new javax.swing.JTextField();
        mName = new javax.swing.JTextField();
        lName = new javax.swing.JTextField();
        usernameError = new javax.swing.JLabel();
        passwordError = new javax.swing.JLabel();
        confirmPasswordError = new javax.swing.JLabel();
        fnameError = new javax.swing.JLabel();
        mnameError = new javax.swing.JLabel();
        lnameError = new javax.swing.JLabel();
        CountryLabel = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(32, 33, 35));
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setNextFocusableComponent(username);
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airBNB/logo.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 295, 80));

        FrameClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FrameClose.setForeground(new java.awt.Color(255, 255, 255));
        FrameClose.setText("X");
        FrameClose.setName(""); // NOI18N
        FrameClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                FrameCloseMouseReleased(evt);
            }
        });
        jPanel1.add(FrameClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 20, 20));

        SignUp.setBackground(new java.awt.Color(102, 102, 255));
        SignUp.setFont(new java.awt.Font("DialogInput", 3, 18)); // NOI18N
        SignUp.setForeground(new java.awt.Color(255, 255, 255));
        SignUp.setLabel("Sign Up");
        SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpActionPerformed(evt);
            }
        });
        jPanel1.add(SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 260, 40));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 70, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 134, 200, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 164, 70, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 198, 200, 10));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Confirm Password:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 236, 120, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 270, 200, 10));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 308, 80, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 342, 200, 10));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Midde Name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 90, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 414, 200, 10));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Last Name:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 80, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 490, 200, 18));

        username.setBackground(new java.awt.Color(32, 33, 35));
        username.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setBorder(null);
        username.setFocusTraversalPolicyProvider(true);
        username.setNextFocusableComponent(passwordField);
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 200, -1));

        passwordField.setBackground(new java.awt.Color(32, 33, 35));
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setBorder(null);
        passwordField.setNextFocusableComponent(passwordFieldConfirm);
        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordFieldMouseClicked(evt);
            }
        });
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 190, 20));

        passwordFieldConfirm.setBackground(new java.awt.Color(32, 33, 35));
        passwordFieldConfirm.setForeground(new java.awt.Color(255, 255, 255));
        passwordFieldConfirm.setBorder(null);
        passwordFieldConfirm.setNextFocusableComponent(fName);
        passwordFieldConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordFieldConfirmMouseClicked(evt);
            }
        });
        passwordFieldConfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldConfirmKeyPressed(evt);
            }
        });
        jPanel1.add(passwordFieldConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 190, 20));

        fName.setBackground(new java.awt.Color(32, 33, 35));
        fName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fName.setForeground(new java.awt.Color(255, 255, 255));
        fName.setBorder(null);
        fName.setNextFocusableComponent(mName);
        fName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fNameMouseClicked(evt);
            }
        });
        jPanel1.add(fName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 324, 210, 20));

        mName.setBackground(new java.awt.Color(32, 33, 35));
        mName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mName.setForeground(new java.awt.Color(255, 255, 255));
        mName.setBorder(null);
        mName.setNextFocusableComponent(lName);
        mName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mNameMouseClicked(evt);
            }
        });
        jPanel1.add(mName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 394, 210, 20));

        lName.setBackground(new java.awt.Color(32, 33, 35));
        lName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lName.setForeground(new java.awt.Color(255, 255, 255));
        lName.setBorder(null);
        lName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lNameMouseClicked(evt);
            }
        });
        jPanel1.add(lName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 200, 20));

        usernameError.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        usernameError.setForeground(new java.awt.Color(255, 0, 0));
        usernameError.setText("jLabel13");
        jPanel1.add(usernameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));
        usernameError.setVisible(false);

        passwordError.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passwordError.setForeground(new java.awt.Color(255, 0, 0));
        passwordError.setText("jLabel13");
        jPanel1.add(passwordError, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        passwordError.setVisible(false);

        confirmPasswordError.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        confirmPasswordError.setForeground(new java.awt.Color(255, 0, 0));
        confirmPasswordError.setText("jLabel13");
        jPanel1.add(confirmPasswordError, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));
        confirmPasswordError.setVisible(false);

        fnameError.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fnameError.setForeground(new java.awt.Color(255, 0, 0));
        fnameError.setText("jLabel13");
        jPanel1.add(fnameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));
        fnameError.setVisible(false);

        mnameError.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mnameError.setForeground(new java.awt.Color(255, 0, 0));
        mnameError.setText("jLabel13");
        jPanel1.add(mnameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));
        mnameError.setVisible(false);

        lnameError.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lnameError.setForeground(new java.awt.Color(255, 0, 0));
        lnameError.setText("jLabel13");
        jPanel1.add(lnameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));
        lnameError.setVisible(false);

        CountryLabel.setBackground(new java.awt.Color(255, 255, 255));
        CountryLabel.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        CountryLabel.setForeground(new java.awt.Color(255, 255, 255));
        CountryLabel.setText("Country:");
        jPanel1.add(CountryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 80, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua & Deps", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Central African Rep", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo", "Congo {Democratic Rep}", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland {Republic}", "Israel", "Italy", "Ivory Coast", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea North", "Korea South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar", "{Burma}", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russian Federation", "Rwanda", "St Kitts & Nevis", "St Lucia", "Saint Vincent & the Grenadines", "Samoa", "San Marino", "Sao Tome & Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad & Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 240, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel1MouseReleased

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void lNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lNameMouseClicked
        // TODO add your handling code here:
        lnameError.setVisible(false);
    }//GEN-LAST:event_lNameMouseClicked

    private void mNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mNameMouseClicked
        // TODO add your handling code here:
        mnameError.setVisible(false);
    }//GEN-LAST:event_mNameMouseClicked

    private void fNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fNameMouseClicked
        // TODO add your handling code here:
        fnameError.setVisible(false);
    }//GEN-LAST:event_fNameMouseClicked

    private void passwordFieldConfirmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldConfirmKeyPressed
        // TODO add your handling code here:
        confirmPasswordError.setVisible(false);
    }//GEN-LAST:event_passwordFieldConfirmKeyPressed

    private void passwordFieldConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldConfirmMouseClicked
        // TODO add your handling code here:
        confirmPasswordError.setVisible(false);
    }//GEN-LAST:event_passwordFieldConfirmMouseClicked

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        // TODO add your handling code here:
        passwordError.setVisible(false);
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void passwordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMouseClicked
        // TODO add your handling code here:
        passwordError.setVisible(false);
    }//GEN-LAST:event_passwordFieldMouseClicked

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
        // TODO add your handling code here:
        usernameError.setVisible(false);
    }//GEN-LAST:event_usernameMouseClicked

    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed
        // TODO add your handling code here:
        SignUp.setEnabled(false);
        boolean usernameChecked = false;
        boolean passwordChecked = false;
        boolean conpasswordChecked = false;
        boolean nameChecked = false;
        boolean countryChecked = false;
        String validUsername = Validate.validateUsername(username.getText());
        String validPassword[] = Validate.validatePassword(new String(passwordField.getPassword()), new String(passwordFieldConfirm.getPassword()));
        String validName = Validate.validateName(fName.getText(), mName.getText(), lName.getText());
        

        if(! validUsername.equals("")) {
            usernameError.setVisible(true);
            usernameError.setText(validUsername);
            usernameChecked = false;
        } else {
            usernameChecked = true;
        }

        if(! validPassword[0].equals("")) {
            passwordError.setVisible(true);
            passwordError.setText(validPassword[0]);
            passwordChecked = false;
        }else {
            passwordChecked = true;
        }

        if(! validPassword[1].equals("")) {
            confirmPasswordError.setVisible(true);
            confirmPasswordError.setText(validPassword[1]);
            conpasswordChecked = false;
        } else {
            conpasswordChecked = true;
        }

        if(! validName.equals("")) {
            fnameError.setVisible(true);
            mnameError.setVisible(true);
            lnameError.setVisible(true);
            fnameError.setText(validName);
            mnameError.setText(validName);
            lnameError.setText(validName);
            nameChecked = false;
        } else {
            nameChecked = true;
        }
        
        if (jComboBox1.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Country Invalid", "InfoBox: Country Invalid", JOptionPane.ERROR_MESSAGE);
        } else {
            countryChecked = true;
        }

        if(usernameChecked && passwordChecked && conpasswordChecked && nameChecked && countryChecked) {
            boolean completed = false;
            Statement st = null;
            
            try {
                String q = String.format("select count(country) from project.branch where country='%s'", jComboBox1.getSelectedItem().toString());
                st = auth.getConnection().createStatement();
                ResultSet rs = st.executeQuery(q);
                int check = 0;
                while(rs.next()) {
                    check = Integer.parseInt(rs.getString("count"));
                }
                rs.close();
                
                Random rnd = new Random();
                double salary = rnd.nextDouble() * 100000;
                DecimalFormat df = new DecimalFormat("#####.##");
                if(check >= 1) {
                    q = String.format("insert into project.employee(position, salary, username, password, fname, lname, country) "
                            + "values('%s', %s, '%s', '%s', '%s', '%s', '%s')", "Customer Service", df.format(salary), username.getText(),
                            new String(passwordField.getPassword()), fName.getText(), lName.getText(), jComboBox1.getSelectedItem().toString());
                    st.execute(q);
                    
                    q = String.format("insert into project.worksat(emp_id, branch_id) values ((select max(employee_id) from project.employee), "
                            + "(select branch_id from project.branch where country='%s'))", jComboBox1.getSelectedItem().toString());
                    st.execute(q);
                    completed = true;
                } else { // Branch doesn't exist
                    q = String.format("insert into project.branch (country, employeeno) "
                            + "values ('%s', %s);", jComboBox1.getSelectedItem().toString(), 150);
                    st.execute(q);
                    
                    q = String.format("insert into project.employee(position, salary, username, password, fname, lname, country) "
                            + "values('%s', %s, '%s', '%s', '%s', '%s', '%s');", "Branch Manager", df.format(salary), username.getText(),
                            new String(passwordField.getPassword()), fName.getText(), lName.getText(), jComboBox1.getSelectedItem().toString());
                    st.execute(q);
                    
                    q = "insert into project.worksat (emp_id, branch_id) values ((select max(employee_id) from project.employee), (select max(branch_id) from project.branch));";
                    st.execute(q);
                    completed = true;
                }
                st.close();
                
            } catch(SQLException | ClassNotFoundException ex) {
                Logger.getLogger(SignUpPageEmployee.class.getName()).log(Level.SEVERE, ex, null);
            }
            
            if (completed) {
                JOptionPane.showMessageDialog(null, "Employee Created", "InfoBox: Employee Created", JOptionPane.PLAIN_MESSAGE);
                dispose();
                LoginMain lg = new LoginMain(auth);
                lg.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Employee Creation Error", "InfoBox: Error", JOptionPane.ERROR_MESSAGE);
            }
            
            SignUp.setEnabled(true);
        } else {
            SignUp.setEnabled(true);
        }

    }//GEN-LAST:event_SignUpActionPerformed

    private void FrameCloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameCloseMouseReleased
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_FrameCloseMouseReleased

    
  int xy;
  int xx;
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
            java.util.logging.Logger.getLogger(SignUpPageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpPageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpPageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpPageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpPageEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CountryLabel;
    private javax.swing.JLabel FrameClose;
    private java.awt.Button SignUp;
    private javax.swing.JLabel confirmPasswordError;
    private javax.swing.JTextField fName;
    private javax.swing.JLabel fnameError;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField lName;
    private javax.swing.JLabel lnameError;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField mName;
    private javax.swing.JLabel mnameError;
    private javax.swing.JLabel passwordError;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordFieldConfirm;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usernameError;
    // End of variables declaration//GEN-END:variables
}
