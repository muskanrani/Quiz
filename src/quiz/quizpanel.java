/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author muskan
 */
public class quizpanel extends javax.swing.JFrame {
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        submit = new javax.swing.JButton();
        skip = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("USERNAME:");

        name.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jRadioButton5.setText("jRadioButton5");

        jRadioButton6.setText("jRadioButton5");

        jRadioButton7.setText("jRadioButton5");

        jRadioButton8.setText("jRadioButton5");

        submit.setText("submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        skip.setText("skip");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(submit)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButton5)
                                .addComponent(jRadioButton6)
                                .addComponent(jRadioButton7)
                                .addComponent(jRadioButton8)))
                        .addGap(63, 63, 63)
                        .addComponent(skip)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(297, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jRadioButton5)
                .addGap(26, 26, 26)
                .addComponent(jRadioButton6)
                .addGap(26, 26, 26)
                .addComponent(jRadioButton7)
                .addGap(26, 26, 26)
                .addComponent(jRadioButton8)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(skip))
                .addContainerGap(230, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitActionPerformed

    /**
     * @param args the command line arguments
     */
     /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Apoorva
 */

     static result robj;
    int i=1;
      Connection con=null;
    Statement stm=null;
      String total="0";
      String ans;
      
      public void reset(){
          jRadioButton5.setSelected(false);
            jRadioButton6.setSelected(false);
              jRadioButton7.setSelected(false);
                jRadioButton8.setSelected(false);
      }
    public void getquiz(){
    reset();
     try{
            Class.forName("com.mysql.jdbc.Driver");
            
              con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject","root","");
             
                   stm=con.createStatement();
            
                   String getQ="select* from ques where id="+i+"";
                   
                             ResultSet result=stm.executeQuery(getQ);
                             
                           
                             result.first();
                          
                              jLabel5.setText(result.getString(2));
                             jRadioButton5.setText(result.getString(3));
                               jRadioButton6.setText(result.getString(4));
                                 jRadioButton7.setText(result.getString(5));
                                   jRadioButton8.setText(result.getString(6));
                      ans=(result.getString(7));
                           if(con!=null && stm!=null){
            
            con.close();
            stm.close();
        }
        }
        catch(Exception t){
         
            jLabel5.setText(""+t);
            
            System.out.println(t);
        }  
}

    /**
     * Creates new form quizpanel
     */
    public quizpanel() {
        initComponents();
        
        name.setText(Quiz.obj.n.toString());
        
          getquiz();
          jRadioButton5.addItemListener(new ItemListener(){
              public void itemStateChanged(ItemEvent t){
              if(t.getStateChange()==1){
                  
            
             submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ans.equalsIgnoreCase(jRadioButton5.getLabel().toString())){
                int m=4+Integer.parseInt(total);
             total=String.valueOf(m);
                }
                
                i++;
             

             
              if(i<5){
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
  
          
         jRadioButton6.addItemListener(new ItemListener(){
              public void itemStateChanged(ItemEvent t){
              if(t.getStateChange()==1){
                  
            
             submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ans.equalsIgnoreCase(jRadioButton6.getLabel().toString())){
                int m=4+Integer.parseInt(total);
             total=String.valueOf(m);
                }
             i++;
          
              if(i<5){
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
         
         jRadioButton7.addItemListener(new ItemListener(){
              public void itemStateChanged(ItemEvent t){
              if(t.getStateChange()==1){
                  
            
             submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ans.equalsIgnoreCase(jRadioButton7.getLabel().toString())){
                int m=4+Integer.parseInt(total);
             total=String.valueOf(m);
                }
             i++;
             
              if(i<5){
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
         jRadioButton8.addItemListener(new ItemListener(){
              public void itemStateChanged(ItemEvent t){
              if(t.getStateChange()==1){
                  
            
             submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ans.equalsIgnoreCase(jRadioButton8.getLabel().toString())){
                int m=4+Integer.parseInt(total);
             total=String.valueOf(m);
                }
             i++;
            
             if(i<5){
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
             
              if(i<5){
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
                                  

                                             

    /**
     * @param args the command line arguments
     */
    
              


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JLabel name;
    private javax.swing.JButton skip;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables

}