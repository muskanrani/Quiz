/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import quiz.result;

/**
 *
 * @author Apoorva
 */
public class Quizpanel1 extends javax.swing.JFrame {
     static result robj;
    int i=1;
      Connection con=null;
    Statement stm=null;
      String total="0";
      String ans;
      
      public void reset(){
          jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
              jRadioButton3.setSelected(false);
                jRadioButton4.setSelected(false);
      }
    public void getquiz(){
    reset();
     try{
            Class.forName("com.mysql.jdbc.Driver");
            
              con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","");
             
                   stm=con.createStatement();
            
                   String getQ="select* from ques where id="+i+"";
                   
                             ResultSet result=stm.executeQuery(getQ);
                             
                           
                             result.first();
                          
                              jLabel3.setText(result.getString(2));
                             jRadioButton1.setText(result.getString(3));
                               jRadioButton2.setText(result.getString(4));
                                 jRadioButton3.setText(result.getString(5));
                                   jRadioButton4.setText(result.getString(6));
                      ans=(result.getString(7));
                           if(con!=null && stm!=null){
            
            con.close();
            stm.close();
        }
        }
        catch(Exception t){
         
            jLabel3.setText(""+t);
            
            System.out.println(t);
        }  
}

    /**
     * Creates new form Quizpanel1
     */
    public Quizpanel1() {
        initComponents();
        name.setText(Quiz.obj.n.toString());
        
          getquiz();
          jRadioButton1.addItemListener(new ItemListener(){
              public void itemStateChanged(ItemEvent t){
              if(t.getStateChange()==1){
                  
            
             submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ans.equalsIgnoreCase(jRadioButton1.getLabel().toString())){
                int m=1+Integer.parseInt(total);
             total=String.valueOf(m);
                }
                
                i++;
             

             
              if(i<=6){
                 getquiz();  
                  
              }
               
                else{
                  
                robj=new result();
                robj.setVisible(true);
                
                login.obj2.setVisible(false);
              }
            }
        });}}
          });
  
          
         jRadioButton2.addItemListener(new ItemListener(){
              public void itemStateChanged(ItemEvent t){
              if(t.getStateChange()==1){
                  
            
             submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ans.equalsIgnoreCase(jRadioButton2.getLabel().toString())){
                int m=1+Integer.parseInt(total);
             total=String.valueOf(m);
                }
             i++;
          
              if(i<=6){
                 getquiz();  
                  
              }
               
                else{
                  
                robj=new result();
                robj.setVisible(true);
                
                login.obj2.setVisible(false);
              }
            }
        });}}
          });
         
         jRadioButton3.addItemListener(new ItemListener(){
              public void itemStateChanged(ItemEvent t){
              if(t.getStateChange()==1){
                  
            
             submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ans.equalsIgnoreCase(jRadioButton3.getLabel().toString())){
                int m=1+Integer.parseInt(total);
             total=String.valueOf(m);
                }
             i++;
             
              if(i<=6){
                 getquiz();  
                  
              }
               
                else{
                  
                robj=new result();
                robj.setVisible(true);
                
                login.obj2.setVisible(false);
              }
            }
        });}}
          });
         jRadioButton4.addItemListener(new ItemListener(){
              public void itemStateChanged(ItemEvent t){
              if(t.getStateChange()==1){
                  
            
             submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ans.equalsIgnoreCase(jRadioButton4.getLabel().toString())){
                int m=1+Integer.parseInt(total);
             total=String.valueOf(m);
                }
             i++;
            
             if(i<=6){
                 getquiz();  
                  
              }
               
                else{
                  
                robj=new result();
                robj.setVisible(true);
                
                login.obj2.setVisible(false);
              }
            }
        });}}
          });
         
         
        
        skip.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             i++;
             
              if(i<=6){
                 getquiz();  
                  
              }
               
                else{
                  
                robj=new result();
                robj.setVisible(true);
                
                login.obj2.setVisible(false);
              }
            }
        });
        

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
        name = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        submit = new javax.swing.JButton();
        skip = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("User Name:");

        name.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("jRadioButton2");

        jRadioButton3.setText("jRadioButton3");

        jRadioButton4.setText("jRadioButton4");

        submit.setBackground(new java.awt.Color(0, 255, 255));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        skip.setBackground(new java.awt.Color(0, 255, 255));
        skip.setText("Skip");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(123, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(submit)
                        .addGap(75, 75, 75)
                        .addComponent(skip)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name))
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(skip))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JLabel name;
    private javax.swing.JButton skip;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
