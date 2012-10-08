/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vertexnet.realestate.view.dialog;

import static com.vertexnet.realestate.constants.UIConstants.EMPLOYEE;

import java.math.BigDecimal;
import java.security.acl.LastOwnerException;
import java.util.Date;

import javax.swing.JOptionPane;

import com.vertexnet.realestate.interfaces.Controller;
import com.vertexnet.realestate.interfaces.DefaultDialog;
import com.vertexnet.realestatenet.model.bean.Employee;

/**
 *
 * @author Srivathsa
 */
public class EmployeeDetailsDialog extends DefaultDialog {

	private static final long serialVersionUID = 1L;
	private Controller controller;
	private Employee employee;
	private boolean editModel =false;

	/**
     * Creates new form EmployeeDetailsDialog
	 * @param employeeDetailsController 
     */
    public EmployeeDetailsDialog(Controller controller) {
        initComponents();
        
        this.controller = controller;
        this.employee = new Employee();
        setupPanel();
        editModel  =false;
    }

    public EmployeeDetailsDialog(Controller controller, Employee employee) {
        initComponents();
        
        this.controller = controller;
        this.employee = employee;
        setupPanel();
        
        editModel = true;
	}
    
	private void setupPanel() {
		nameTextField.setText(employee.getName());
		if(employee.getSalary() != null) {
			salaryTextField.setText(employee.getSalary().toString());
		}
		dateOfJoiningChooser.setDate(employee.getStartDate());
		addressTextField.setText(employee.getAddress());
		phoneTextField.setText(employee.getPhone());
		mobileTextField.setText(employee.getMobile());
		emailTextField.setText(employee.getEmailId());
		
		workingYesRadioButton.setSelected(true);
		if (employee.getEndDate() != null) {
			if(employee.getEndDate().before(new Date())) {
				workingNoRadioButton.setSelected(true);
				applicationNoRadioButton.setSelected(true);
				adminNoRadioButton.setSelected(true);
			}
			lastWorkingDateChooser.setDate(employee.getEndDate());
		} else {
			applicationYesRadioButton.setSelected(employee.isAppAccess());
			applicationNoRadioButton.setSelected(!employee.isAppAccess());
			adminYesRadioButton.setSelected(employee.isAdminAccess());
			adminNoRadioButton.setSelected(!employee.isAdminAccess());
		}
	}

	/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        applicationAccessGroup = new javax.swing.ButtonGroup();
        adminAccessGroup = new javax.swing.ButtonGroup();
        workingEmployeeGroup = new javax.swing.ButtonGroup();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        salaryLabel = new javax.swing.JLabel();
        salaryTextField = new javax.swing.JTextField();
        dateOfJoiningLabel = new javax.swing.JLabel();
        dateOfJoiningChooser = new com.toedter.calendar.JDateChooser();
        applicationAccessLabel = new javax.swing.JLabel();
        applicationYesRadioButton = new javax.swing.JRadioButton();
        applicationNoRadioButton = new javax.swing.JRadioButton();
        adminAccessLabel = new javax.swing.JLabel();
        adminYesRadioButton = new javax.swing.JRadioButton();
        adminNoRadioButton = new javax.swing.JRadioButton();
        addressLabel = new javax.swing.JLabel();
        addressScrollPane = new javax.swing.JScrollPane();
        addressTextField = new javax.swing.JTextArea();
        phoneLabel = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        mobileLabel = new javax.swing.JLabel();
        mobileTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        workingYesRadioButton = new javax.swing.JRadioButton();
        workingNoRadioButton = new javax.swing.JRadioButton();
        lastWorkingDateLabel = new javax.swing.JLabel();
        lastWorkingDateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        nameLabel.setText("Name : ");

        salaryLabel.setText("Salary : ");

        dateOfJoiningLabel.setText("Date of Joining : ");

        applicationAccessLabel.setText("Application Access : ");

        applicationAccessGroup.add(applicationYesRadioButton);
        applicationYesRadioButton.setText("Yes");
        applicationYesRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applicationYesRadioButtonActionPerformed(evt);
            }
        });

        applicationAccessGroup.add(applicationNoRadioButton);
        applicationNoRadioButton.setSelected(true);
        applicationNoRadioButton.setText("No");
        applicationNoRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applicationNoRadioButtonActionPerformed(evt);
            }
        });

        adminAccessLabel.setText("Admin Access : ");

        adminAccessGroup.add(adminYesRadioButton);
        adminYesRadioButton.setText("Yes");

        adminAccessGroup.add(adminNoRadioButton);
        adminNoRadioButton.setText("No");

        addressLabel.setText("Address : ");

        addressTextField.setColumns(5);
        addressTextField.setRows(1);
        addressScrollPane.setViewportView(addressTextField);

        phoneLabel.setText("Phone : ");

        mobileLabel.setText("Mobile : ");

        emailLabel.setText("Email : ");

        saveButton.setText("Save");
        saveButton.setName(EMPLOYEE.getSave());
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Working Employee : ");

        workingEmployeeGroup.add(workingYesRadioButton);
        workingYesRadioButton.setSelected(true);
        workingYesRadioButton.setText("Yes");
        workingYesRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workingYesRadioButtonActionPerformed(evt);
            }
        });

        workingEmployeeGroup.add(workingNoRadioButton);
        workingNoRadioButton.setText("No");
        workingNoRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workingNoRadioButtonActionPerformed(evt);
            }
        });

        lastWorkingDateLabel.setText("Last Working Date : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(saveButton)
                        .addGap(5, 5, 5)
                        .addComponent(closeButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastWorkingDateLabel)
                                    .addComponent(salaryLabel)
                                    .addComponent(nameLabel)
                                    .addComponent(dateOfJoiningLabel)
                                    .addComponent(addressLabel)
                                    .addComponent(phoneLabel)
                                    .addComponent(mobileLabel)
                                    .addComponent(emailLabel)
                                    .addComponent(applicationAccessLabel)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(salaryTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateOfJoiningChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addressScrollPane, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phoneTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mobileTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(workingYesRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(workingNoRadioButton))
                                    .addComponent(lastWorkingDateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(applicationYesRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(applicationNoRadioButton))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(adminYesRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(adminNoRadioButton))
                                    .addComponent(nameTextField)))
                            .addComponent(adminAccessLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salaryLabel)
                    .addComponent(salaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(dateOfJoiningLabel)
                    .addComponent(dateOfJoiningChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressLabel)
                    .addComponent(addressScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileLabel)
                    .addComponent(mobileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(workingYesRadioButton)
                    .addComponent(workingNoRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastWorkingDateLabel)
                    .addComponent(lastWorkingDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(applicationAccessLabel)
                    .addComponent(applicationYesRadioButton)
                    .addComponent(applicationNoRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminAccessLabel)
                    .addComponent(adminYesRadioButton)
                    .addComponent(adminNoRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(closeButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
		employee.setName(nameTextField.getText());
		employee.setSalary(new BigDecimal(salaryTextField.getText()));
		employee.setStartDate(dateOfJoiningChooser.getDate());
		employee.setAddress(addressTextField.getText());
		employee.setPhone(phoneTextField.getText());
		employee.setMobile(mobileTextField.getText());
		employee.setEmailId(emailTextField.getText());
		if(applicationYesRadioButton.isSelected()) {
			employee.setAppAccess(true);
			//employee.setLoginId(loginIdTextField.getText());
			if(adminYesRadioButton.isSelected()) {
				employee.setAdminAccess(true);
			} else {
				employee.setAdminAccess(false);
			}
		} else {
			employee.setAppAccess(false);
		}
		if(!editModel) {
			employee.setPassword("test123");
		}
		
		//employee.setWorking(workingYesRadioButton.isSelected());
//		
//		if(workingNoRadioButton.isSelected() && employee.getLastWorkingDate() == null) {
//			employee.setWorking(false);
//			employee.setLastWorkingDate(new Date());
//		}
		
		if(applicationYesRadioButton.isSelected() && !editModel) {
			JOptionPane.showMessageDialog(this, "Please Note Default Password Generated will be test123");
		}
    	controller.handleEvent(evt);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
    	this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void applicationYesRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applicationYesRadioButtonActionPerformed
    	adminNoRadioButton.setEnabled(true);
    	adminYesRadioButton.setEnabled(true);
    }//GEN-LAST:event_applicationYesRadioButtonActionPerformed

    private void applicationNoRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applicationNoRadioButtonActionPerformed
    	adminNoRadioButton.setEnabled(false);
    	adminYesRadioButton.setEnabled(false);
    }//GEN-LAST:event_applicationNoRadioButtonActionPerformed

    private void workingYesRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workingYesRadioButtonActionPerformed
    	if(employee.getEndDate() != null) {
    		lastWorkingDateChooser.setDate(employee.getEndDate());
    	} else {
    		lastWorkingDateChooser.setDate(null);
    	}
    }//GEN-LAST:event_workingYesRadioButtonActionPerformed

    private void workingNoRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workingNoRadioButtonActionPerformed
    	if(employee.getEndDate() != null) {
    		lastWorkingDateChooser.setDate(employee.getEndDate());
    	} else {
    		lastWorkingDateChooser.setDate(new Date());
    	}
    }//GEN-LAST:event_workingNoRadioButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JScrollPane addressScrollPane;
    private javax.swing.JTextArea addressTextField;
    private javax.swing.ButtonGroup adminAccessGroup;
    private javax.swing.JLabel adminAccessLabel;
    private javax.swing.JRadioButton adminNoRadioButton;
    private javax.swing.JRadioButton adminYesRadioButton;
    private javax.swing.ButtonGroup applicationAccessGroup;
    private javax.swing.JLabel applicationAccessLabel;
    private javax.swing.JRadioButton applicationNoRadioButton;
    private javax.swing.JRadioButton applicationYesRadioButton;
    private javax.swing.JButton closeButton;
    private com.toedter.calendar.JDateChooser dateOfJoiningChooser;
    private javax.swing.JLabel dateOfJoiningLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel1;
    private com.toedter.calendar.JDateChooser lastWorkingDateChooser;
    private javax.swing.JLabel lastWorkingDateLabel;
    private javax.swing.JLabel mobileLabel;
    private javax.swing.JTextField mobileTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JLabel salaryLabel;
    private javax.swing.JTextField salaryTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.ButtonGroup workingEmployeeGroup;
    private javax.swing.JRadioButton workingNoRadioButton;
    private javax.swing.JRadioButton workingYesRadioButton;
    // End of variables declaration//GEN-END:variables

	public Employee getEmployee() {
		return employee;
	}

	public void showSaveConfirmation() {
		JOptionPane.showMessageDialog(this, "Employee Created Successfully");
	}

	@Override
	public void setupDialog() {
		// TODO Auto-generated method stub
		
	}
}
