package scripts.Smither.gui;

import org.tribot.api2007.types.RSArea;
import org.tribot.api2007.types.RSTile;

import scripts.Smither.utils.Constants;
import scripts.Smither.utils.Variables;

public class MainGui extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form CannonballScriptGui
     */
    public MainGui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

    	 jLabel1 = new javax.swing.JLabel();
         jButton1 = new javax.swing.JButton();
         jComboBox1 = new javax.swing.JComboBox<>();
         jLabel2 = new javax.swing.JLabel();
         jLabel3 = new javax.swing.JLabel();
         jComboBox2 = new javax.swing.JComboBox<>();

         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

         jLabel1.setBackground(new java.awt.Color(255, 255, 51));
         jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
         jLabel1.setText("Monts Cannonballs");

         jButton1.setText("Start");
         jButton1.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 jButton1ActionPerformed(evt);
             }
         });
         
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EDGEVILLE", "AL_KHARID", "FALADOR", "PORT_PHASMATYS" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Location");
        
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Item to smelt");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BARS", "ORE" }));
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 120, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>          
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {      

       locationChooser();
       Variables.get().task = (jComboBox2.getSelectedItem().toString());
        
       dispose();
    }
    
    private void locationChooser() {
    	Variables.get().location = (jComboBox1.getSelectedItem().toString());
    	
    	switch(Variables.get().location) {
    		case "EDGEVILLE":
    			Variables.get().furnaceArea = new RSArea(new RSTile(3110,3501,0), new RSTile(3105,3497,0));
    			Variables.get().furnaceTile = new RSTile(3109, 3499, 0);
    			break;
    		case "AL_KHARID":
    			Variables.get().furnaceArea = new RSArea(new RSTile(3271,3189,0),new RSTile(3280,3183,0));
				Variables.get().furnaceTile = new RSTile(3274, 3186, 0);
				break;
    		case "PORT_PHASMATYS":
    			Variables.get().furnaceArea = new RSArea(new RSTile(3688,3476,0), new RSTile(3682,3482,0));
    			Variables.get().furnaceTile = new RSTile(3687, 3479, 0);
    			break;
    		case "FALADOR":
    			Variables.get().furnaceArea = new RSArea(new RSTile(2976,3374,0),new RSTile(2969,3367,0));
				Variables.get().furnaceTile = new RSTile(2975, 3369, 0);
				break;
    		
    		}
    		return;
    	}

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration                                
}                                                        
                                          
