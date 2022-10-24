/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainWindow;

import estr.hospital.*;
import estr.persona.*;
import estr.especialidades.*;
import forms.especialidades.PanelEspecialidades;
import forms.inicio.PanelInicio;
import forms.pacientes.PanelPacientes;
import forms.personal.PanelPersonal;
import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import persistencia.ArchProy;

/**
 *
 * @author USUARIO
 */
public class MainWindow extends javax.swing.JFrame {
    
    //Estructuras
    private Hospital hospital;
    
    
    //Paneles
    private PanelInicio panel10;
    private PanelEspecialidades panel9;
    private PanelPacientes panel8;
    private PanelPersonal panel7;
    //persistencia
    private ArchProy arch = new ArchProy("archivo.txt");
    //menu
    private int numItems = 4;
    private int selectedMenu;
    private Color defaultColor, hoverColor, selectedColor;
    private JPanel[] menuItems;
    private JPanel[] panel;
    /**
     * 
     * Creates new form MainWindow
     */
    public MainWindow() throws IOException {
        initComponents();
        //Primera carga
        //cargarEstructuras();
        //arch.crear();
        //guardarEstructurasArchivo();
        
        //segunda para ver los archivos
        arch.listarEstructuras();
        cargarPaneles();
        iniciarMenu();
    }
     private void cargarPaneles() {
        panel10 = new PanelInicio(this);
        panel7 = new PanelPersonal();
        panel8 = new PanelPacientes();
        panel9 = new PanelEspecialidades();
     
        panel = new JPanel[numItems];
        panel[0] = panel10;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
        panel[1] = panel9;
        panel[2] = panel7;
        panel[3] = panel8;
    }
     private void iniciarMenu() {
        // asignacion de colores
        defaultColor = new Color(51, 102, 255);   // por defecto
        hoverColor = new Color(81, 123, 252);     // color cuando mouse esta encima
        selectedColor = new Color(102, 153, 255); // color de menu seleccionado

        menuItems = new JPanel[numItems];
        menuItems[0] = menuItem1;
        menuItems[1] = menuItem2;
        menuItems[2] = menuItem3;
        menuItems[3] = menuItem4;

        selectedMenu = 0;
        setMenuSelected(0);
    }
     private void setMenuSelected(int k) {
        selectedMenu = k;
        setPanel(panel[k]);
        for (int i = 0; i < numItems; i++) {
            if (i == k) {
                menuItems[i].setBackground(selectedColor);
            } else {
                menuItems[i].setBackground(defaultColor);
            }
        }
    }
     private void setPanel(Component panel) {
        mainPanel.removeAll();
        mainPanel.add(panel);
        mainPanel.repaint();
        System.out.println("setting panel...");
                
        mainPanel.revalidate();
        System.out.println("done");
    }
     private void setMenuHover(int k) {
        if (k != selectedMenu) {
            menuItems[k].setBackground(hoverColor);
        }
    }

    private void setMenuExitHover(int k) {
        if (k != selectedMenu) {
            menuItems[k].setBackground(defaultColor);
        }
    }
    public void cargarEstructuras() {
        ListaSEmpleados lem1 = new ListaSEmpleados();
        lem1.adicionarFinal(new Empleado(12345601, "empleado1", "cargo1", 100));
        lem1.adicionarFinal(new Empleado(12345602, "empleado2", "cargo2", 200));
        lem1.adicionarFinal(new Empleado(12345603, "empleado3", "cargo3", 300));
        
        lem1.adicionarFinal(new Empleado(12345604, "empleado4", "cargo4", 400));
        lem1.adicionarFinal(new Empleado(12345605, "empleado5", "cargo5", 500));
        lem1.adicionarFinal(new Empleado(12345606, "empleado6", "cargo6", 600));
        
        ListaSEmpleados lem2 = new ListaSEmpleados();
        lem2.adicionarFinal(new Empleado(12345607, "empleado7", "cargo7", 100));
        lem2.adicionarFinal(new Empleado(12345608, "empleado8", "cargo8", 200));
        lem2.adicionarFinal(new Empleado(12345609, "empleado9", "cargo9", 300));
        
        lem2.adicionarFinal(new Empleado(123456010, "empleado10", "cargo10", 400));
        lem2.adicionarFinal(new Empleado(123456011, "empleado11", "cargo11", 500));
        lem2.adicionarFinal(new Empleado(123456012, "empleado12", "cargo12", 600));
        
        ListaSPacientes lpa1 = new ListaSPacientes();
        lpa1.adicionarFinal(new Paciente(23456701, "paciente1", 21, "F"));
        lpa1.adicionarFinal(new Paciente(23456702, "paciente2", 22, "M"));
        lpa1.adicionarFinal(new Paciente(23456703, "paciente3", 23, "F"));
       
        lpa1.adicionarFinal(new Paciente(23456704, "paciente4", 24, "F"));
        lpa1.adicionarFinal(new Paciente(23456705, "paciente5", 25, "M"));
        lpa1.adicionarFinal(new Paciente(23456706, "paciente6", 26, "F"));
        
        ListaSPacientes lpa2 = new ListaSPacientes();
        lpa2.adicionarFinal(new Paciente(23456707, "paciente7", 21, "F"));
        lpa2.adicionarFinal(new Paciente(23456708, "paciente8", 22, "M"));
        lpa2.adicionarFinal(new Paciente(23456709, "paciente9", 23, "F"));
       
        lpa2.adicionarFinal(new Paciente(234567010, "paciente10", 24, "F"));
        lpa2.adicionarFinal(new Paciente(234567011, "paciente11", 25, "M"));
        lpa2.adicionarFinal(new Paciente(234567012, "paciente12", 26, "F"));
        
        ListaSEspecialidades lesp1 = new ListaSEspecialidades();
        lesp1.adicionarFinal(new Especialidad("Especialidad1", lem1, lpa1));
        lesp1.adicionarFinal(new Especialidad("Especialidad2", lem2, lpa2));
        
        hospital  = new Hospital("HOSPITALX", "mRS. SPANGLER", lesp1);
        //hospital.mostrar();
    }
    public void cargarEstructurasArchivo() throws IOException{
        LinkedList<Object> estruct = arch.leerEstructuras();
        ListIterator<Object> it = estruct.listIterator();
        int c = 0;
        while(it.hasNext()){
            if (c == 0)
               hospital  = (Hospital) it.next();            
            c++;
        }
    }
    
public void guardarEstructurasArchivo() throws IOException{
        LinkedList<Object> estruct = new LinkedList<>();        
        estruct.addLast(hospital);        
        arch.guardarEstructuras(estruct);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SideBar = new javax.swing.JPanel();
        menuItem1 = new javax.swing.JPanel();
        titulo4 = new javax.swing.JLabel();
        menuItem2 = new javax.swing.JPanel();
        titulo3Espe = new javax.swing.JLabel();
        menuItem3 = new javax.swing.JPanel();
        titulo3Espe1 = new javax.swing.JLabel();
        menuItem4 = new javax.swing.JPanel();
        titulo3Espe2 = new javax.swing.JLabel();
        menuItem6 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SideBar.setBackground(new java.awt.Color(51, 51, 255));

        menuItem1.setBackground(new java.awt.Color(51, 102, 255));
        menuItem1.setPreferredSize(new java.awt.Dimension(160, 40));
        menuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItem1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuItem1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuItem1MouseExited(evt);
            }
        });

        titulo4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        titulo4.setForeground(new java.awt.Color(255, 255, 255));
        titulo4.setText("Hospital");
        titulo4.setIconTextGap(10);

        javax.swing.GroupLayout menuItem1Layout = new javax.swing.GroupLayout(menuItem1);
        menuItem1.setLayout(menuItem1Layout);
        menuItem1Layout.setHorizontalGroup(
            menuItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuItem1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuItem1Layout.setVerticalGroup(
            menuItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuItem1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo4)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        menuItem2.setBackground(new java.awt.Color(51, 102, 255));
        menuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItem2MouseClicked(evt);
            }
        });

        titulo3Espe.setForeground(new java.awt.Color(255, 255, 255));
        titulo3Espe.setText("Especialidades");

        javax.swing.GroupLayout menuItem2Layout = new javax.swing.GroupLayout(menuItem2);
        menuItem2.setLayout(menuItem2Layout);
        menuItem2Layout.setHorizontalGroup(
            menuItem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuItem2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo3Espe, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuItem2Layout.setVerticalGroup(
            menuItem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItem2Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(titulo3Espe)
                .addContainerGap())
        );

        menuItem3.setBackground(new java.awt.Color(51, 102, 255));
        menuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItem3MouseClicked(evt);
            }
        });

        titulo3Espe1.setForeground(new java.awt.Color(255, 255, 255));
        titulo3Espe1.setText("Personal");

        javax.swing.GroupLayout menuItem3Layout = new javax.swing.GroupLayout(menuItem3);
        menuItem3.setLayout(menuItem3Layout);
        menuItem3Layout.setHorizontalGroup(
            menuItem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuItem3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo3Espe1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuItem3Layout.setVerticalGroup(
            menuItem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItem3Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(titulo3Espe1)
                .addContainerGap())
        );

        menuItem4.setBackground(new java.awt.Color(51, 102, 255));
        menuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItem4MouseClicked(evt);
            }
        });

        titulo3Espe2.setForeground(new java.awt.Color(255, 255, 255));
        titulo3Espe2.setText("Pacientes");

        javax.swing.GroupLayout menuItem4Layout = new javax.swing.GroupLayout(menuItem4);
        menuItem4.setLayout(menuItem4Layout);
        menuItem4Layout.setHorizontalGroup(
            menuItem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuItem4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo3Espe2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuItem4Layout.setVerticalGroup(
            menuItem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItem4Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(titulo3Espe2)
                .addContainerGap())
        );

        menuItem6.setForeground(new java.awt.Color(255, 255, 255));
        menuItem6.setText("NAME PROGRAM");

        javax.swing.GroupLayout SideBarLayout = new javax.swing.GroupLayout(SideBar);
        SideBar.setLayout(SideBarLayout);
        SideBarLayout.setHorizontalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarLayout.createSequentialGroup()
                .addGroup(SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(menuItem4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menuItem3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menuItem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(SideBarLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(menuItem6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addComponent(menuItem1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addContainerGap())
        );
        SideBarLayout.setVerticalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideBarLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(menuItem6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuItem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuItem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuItem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );

        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem1MouseClicked
        setMenuSelected(0);
    }//GEN-LAST:event_menuItem1MouseClicked

    private void menuItem1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem1MouseEntered
  //      setMenuHover(4);
    }//GEN-LAST:event_menuItem1MouseEntered

    private void menuItem1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem1MouseExited
    //    setMenuExitHover(4);
    }//GEN-LAST:event_menuItem1MouseExited

    private void menuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem2MouseClicked
            setMenuSelected(1);                  
    }//GEN-LAST:event_menuItem2MouseClicked

    private void menuItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem3MouseClicked
        setMenuSelected(2);            
// TODO add your handling code here:
    }//GEN-LAST:event_menuItem3MouseClicked

    private void menuItem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem4MouseClicked
        setMenuSelected(3);    
// TODO add your handling code here:
    }//GEN-LAST:event_menuItem4MouseClicked

               
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //File fichero = new File("test.txt");
        //System.out.println("La ruta del fichero es: " + fichero.getAbsolutePath());
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainWindow().setVisible(true);
                    
                } catch (IOException ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SideBar;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuItem1;
    private javax.swing.JPanel menuItem2;
    private javax.swing.JPanel menuItem3;
    private javax.swing.JPanel menuItem4;
    private javax.swing.JLabel menuItem6;
    private javax.swing.JLabel titulo3Espe;
    private javax.swing.JLabel titulo3Espe1;
    private javax.swing.JLabel titulo3Espe2;
    private javax.swing.JLabel titulo4;
    // End of variables declaration//GEN-END:variables
}
