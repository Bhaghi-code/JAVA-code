/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Person;


/**
 *
 * @author lENOVO PC
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPanel
     */
    public ViewPanel(Person person) {
        initComponents();
        String firstName =person.getFirstName();
        fnameTextField.setText(firstName);
        String lastName =person.getLastName();
        lnameTextField.setText(lastName);
        String age =person.getAge();
        ageTextField.setText(age);
        String height =person.getHeight();
        heightTextField.setText(height);
        String weight =person.getWeight();
        weightTextField.setText(weight);
        String socialSecurityNumner =person.getSocialSecurityNumber();
        ssnTextField.setText(socialSecurityNumner);
        String dateOfBirth  =person.getDateOfBirth();
        dobTextField.setText(dateOfBirth);
        String phoneNumber=person.getPhoneNumber();
        phonenumberTextField.setText(phoneNumber);
        
        String streetaddress = person.getAddress().getStreetAddress();
        streetaddressTextField.setText(streetaddress);
        String city = person.getAddress().getCity();
        cityTextField.setText(city);
        String state = person.getAddress().getState();
        stateTextField.setText(state);
        String zipCode = person.getAddress().getZipCode();
        zipcodeTextField.setText(zipCode);
        
        String checkingBankName = person.getCheckingaccount().getCheckingBankName();
        cbanknameTextField.setText(checkingBankName);
        String checkingBankAccountNumber = person.getCheckingaccount().getCheckingBankAccountNumber();
        cbankaccountnumberTextField.setText(checkingBankAccountNumber);
        String checkingBankRoutingNumber = person.getCheckingaccount().getCheckingBankRoutingNumber();
        cbankroutingnumberTextField.setText(checkingBankAccountNumber);
        String checkingAccountBalance = person.getCheckingaccount().getCheckingAccountBalance();
        caccountbalanceTextField.setText(checkingAccountBalance);
        String checkingAccountType = person.getCheckingaccount().getCheckingAccountType();
        caccounttypeTextField.setText(checkingAccountType);
        
        String BankName = person.getSavingaccount().getBankName();
        sbanknameTextField.setText(BankName);
        String BankRoutingNumber = person.getSavingaccount().getBankRoutingNumber();
        sbanknameroutingnumberTextField.setText(BankRoutingNumber);
        String BankAccountNumber = person.getSavingaccount().getBankAccountNumber();
        sbankaccountnumberTextField.setText(BankAccountNumber);
        String AccountType = person.getSavingaccount().getAccountType();
        saccounttypeTextField.setText(AccountType);
        String AccountBalance = person.getSavingaccount().getAccountBalance();
        saccountbalanceTextField.setText(AccountBalance);
        
        String LicenseNumber = person.getDriverinformation().getLicenseNumber();
        licensenumberTextField.setText(LicenseNumber);
        String IssueDate = person.getDriverinformation().getIssueDate();
        issuedateTextField.setText(IssueDate);
        String ExpirationDate = person.getDriverinformation().getExpirationDate();
        expirydateTextField.setText(ExpirationDate);
        String BloodType = person.getDriverinformation().getBloodType();
        bloodtypeTextField.setText(BloodType);
        //String Picture = person.getDriverinformation().getPicture();
        attachimage.setIcon(person.getDriverinformation().getImage());
               
        
        String MedicalRecordNumber = person.getMedicalrecord().getMedicalRecordNumber();
        medicalrecordnumberTextField.setText(MedicalRecordNumber);
        String Allergy1 = person.getMedicalrecord().getAllergy1();
        allergy1TextField.setText(Allergy1);
        String Allergy2 = person.getMedicalrecord().getAllergy2();
        allergy2TextField.setText(Allergy2);
        String Allergy3 = person.getMedicalrecord().getAllergy3();
        allergy3TextField.setText(Allergy3);
        
        
        
       
        
        
        
        
      
        
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fnameTextField = new javax.swing.JTextField();
        lnameTextField = new javax.swing.JTextField();
        phonenumberTextField = new javax.swing.JTextField();
        dobTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        heightTextField = new javax.swing.JTextField();
        weightTextField = new javax.swing.JTextField();
        ssnTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        streetaddressTextField = new javax.swing.JTextField();
        cityTextField = new javax.swing.JTextField();
        stateTextField = new javax.swing.JTextField();
        zipcodeTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        sbanknameTextField = new javax.swing.JTextField();
        sbanknameroutingnumberTextField = new javax.swing.JTextField();
        sbankaccountnumberTextField = new javax.swing.JTextField();
        saccountbalanceTextField = new javax.swing.JTextField();
        saccounttypeTextField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        cbanknameTextField = new javax.swing.JTextField();
        cbankroutingnumberTextField = new javax.swing.JTextField();
        cbankaccountnumberTextField = new javax.swing.JTextField();
        caccountbalanceTextField = new javax.swing.JTextField();
        caccounttypeTextField = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        licensenumberTextField = new javax.swing.JTextField();
        issuedateTextField = new javax.swing.JTextField();
        expirydateTextField = new javax.swing.JTextField();
        bloodtypeTextField = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        allergy1TextField = new javax.swing.JTextField();
        allergy2TextField = new javax.swing.JTextField();
        allergy3TextField = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        medicalrecordnumberTextField = new javax.swing.JTextField();
        attachimage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("    VIEW YOUR PRODUCT");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("Personal Details");

        jLabel3.setText("First Name");

        jLabel4.setText("Last Name");

        jLabel5.setText("Phone Number");

        jLabel6.setText("D.O.B");

        jLabel7.setText("Age");

        jLabel8.setText("Height");

        jLabel9.setText("Weight");

        jLabel10.setText("SSN");

        fnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameTextFieldActionPerformed(evt);
            }
        });

        heightTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightTextFieldActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel11.setText("Address");

        jLabel12.setText("Street Address");

        jLabel13.setText("City");

        jLabel14.setText("State");

        jLabel15.setText("Zip Code");

        streetaddressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetaddressTextFieldActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel16.setText("Savings Account Infomation");

        jLabel17.setText("Bank Name");

        jLabel18.setText("Routing Number");

        jLabel19.setText("Account Number");

        jLabel20.setText("Account Balance");

        jLabel21.setText("Account Type");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel22.setText("Checking Account Information");

        jLabel23.setText("Bank Name");

        jLabel24.setText("Routing Number");

        jLabel25.setText(" Account Number");

        jLabel26.setText("Account Balance");

        jLabel27.setText("Account Type");

        caccountbalanceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caccountbalanceTextFieldActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel28.setText("Driver's License Information");

        jLabel29.setText("License Number");

        jLabel30.setText("Issue Date");

        jLabel31.setText("Expiry Date");

        jLabel32.setText("Blood Type");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel34.setText("Medical Record");

        jLabel35.setText("Allergy1");

        jLabel36.setText("Allergy2");

        jLabel37.setText("Allergy3");

        jLabel38.setText("Medical Record Number");

        attachimage.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel29)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel30))
                                        .addGap(52, 52, 52)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(fnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel5))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(saccounttypeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                                    .addComponent(sbanknameroutingnumberTextField)
                                                    .addComponent(issuedateTextField)
                                                    .addComponent(weightTextField)
                                                    .addComponent(ageTextField)
                                                    .addComponent(lnameTextField)
                                                    .addComponent(licensenumberTextField)
                                                    .addComponent(sbanknameTextField))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel31)
                                                    .addComponent(jLabel32)
                                                    .addComponent(jLabel19)
                                                    .addComponent(jLabel20)))))
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel21))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ssnTextField)
                                            .addComponent(expirydateTextField)
                                            .addComponent(bloodtypeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                            .addComponent(sbankaccountnumberTextField)
                                            .addComponent(saccountbalanceTextField))))
                                .addGap(52, 52, 52))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(phonenumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(dobTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(heightTextField))
                                .addGap(248, 248, 248)))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(attachimage, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(450, 450, 450)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel12)
                                                .addComponent(jLabel13)
                                                .addComponent(jLabel14)
                                                .addComponent(jLabel15))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(71, 71, 71)
                                                    .addComponent(streetaddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(stateTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(zipcodeTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel35)
                                            .addGap(212, 212, 212))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel23)
                                                .addComponent(jLabel24)
                                                .addComponent(jLabel27))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cbanknameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                                .addComponent(cbankroutingnumberTextField)
                                                .addComponent(caccounttypeTextField)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel38)
                                            .addGap(31, 31, 31)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(allergy2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(allergy3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbankaccountnumberTextField))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel37)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(allergy1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel36)
                                        .addGap(59, 59, 59)
                                        .addComponent(medicalrecordnumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addGap(21, 21, 21)
                                        .addComponent(caccountbalanceTextField)))))
                        .addGap(187, 187, 187))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(fnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(phonenumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(streetaddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(dobTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(lnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(attachimage, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(stateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ssnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(zipcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)))))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel34))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(licensenumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(expirydateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(medicalrecordnumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(allergy2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(issuedateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(bloodtypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(allergy1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(allergy3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(sbanknameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(sbankaccountnumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(cbanknameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(cbankaccountnumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(sbanknameroutingnumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(saccountbalanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(cbankroutingnumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(caccountbalanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(saccounttypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(caccounttypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1270, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameTextFieldActionPerformed

    private void streetaddressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetaddressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_streetaddressTextFieldActionPerformed

    private void heightTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightTextFieldActionPerformed

    private void caccountbalanceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caccountbalanceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caccountbalanceTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTextField;
    private javax.swing.JTextField allergy1TextField;
    private javax.swing.JTextField allergy2TextField;
    private javax.swing.JTextField allergy3TextField;
    private javax.swing.JLabel attachimage;
    private javax.swing.JTextField bloodtypeTextField;
    private javax.swing.JTextField caccountbalanceTextField;
    private javax.swing.JTextField caccounttypeTextField;
    private javax.swing.JTextField cbankaccountnumberTextField;
    private javax.swing.JTextField cbanknameTextField;
    private javax.swing.JTextField cbankroutingnumberTextField;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JTextField dobTextField;
    private javax.swing.JTextField expirydateTextField;
    private javax.swing.JTextField fnameTextField;
    private javax.swing.JTextField heightTextField;
    private javax.swing.JTextField issuedateTextField;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField licensenumberTextField;
    private javax.swing.JTextField lnameTextField;
    private javax.swing.JTextField medicalrecordnumberTextField;
    private javax.swing.JTextField phonenumberTextField;
    private javax.swing.JTextField saccountbalanceTextField;
    private javax.swing.JTextField saccounttypeTextField;
    private javax.swing.JTextField sbankaccountnumberTextField;
    private javax.swing.JTextField sbanknameTextField;
    private javax.swing.JTextField sbanknameroutingnumberTextField;
    private javax.swing.JTextField ssnTextField;
    private javax.swing.JTextField stateTextField;
    private javax.swing.JTextField streetaddressTextField;
    private javax.swing.JTextField weightTextField;
    private javax.swing.JTextField zipcodeTextField;
    // End of variables declaration//GEN-END:variables
}
