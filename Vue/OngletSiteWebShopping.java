package Vue;



import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

     public class OngletSiteWebShopping extends JFrame implements ActionListener {
         private static final long serialVersionUID = 1L;

         public OngletSiteWebShopping() {
             super("Onglets Site Web Shopping");
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

             JTabbedPane onglets = new JTabbedPane();
             getContentPane().add(onglets);

             JPanel onglet1 = new JPanel();
             onglets.addTab("Onglet 1", null, onglet1, "Premier onglet");

             JPanel onglet2 = new JPanel(new BorderLayout());
             onglets.addTab("Onglet 2", null, onglet2, "Deuxième onglet");

             JEditorPane editeurTexte = new JEditorPane();
             editeurTexte.setEditable(false);
             JScrollPane scrollPane = new JScrollPane(editeurTexte);
             editeurTexte.setPreferredSize(new Dimension(800, 600));
             onglet2.add(scrollPane);

             JButton boutonChargerPageWeb = new JButton("Charger Page Web");
             boutonChargerPageWeb.addActionListener(this);
             onglet2.add(boutonChargerPageWeb, BorderLayout.SOUTH);

             pack();
         }

         public void actionPerformed(ActionEvent e) {
             JEditorPane editeurTexte = (JEditorPane) ((JScrollPane) ((JPanel) ((JButton) e.getSource()).getParent()).getComponent(0)).getViewport().getView();
             editeurTexte.setText("<html><body><h1>Amazon.fr</h1><p>Site web shopping</p></body></html>");
         }

         public static void main(String[] args) {
             OngletSiteWebShopping fenetre = new OngletSiteWebShopping();
             fenetre.setVisible(true);
         }
     }
