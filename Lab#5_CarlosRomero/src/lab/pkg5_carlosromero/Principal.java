/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5_carlosromero;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Will
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_agregarequipo = new javax.swing.JDialog();
        txEstadio = new javax.swing.JTextField();
        txNombreEquipo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spCopas = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        btguardareq = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        sppresupuesto = new javax.swing.JSpinner();
        jd_listar = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        listeq = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listj = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jd_agregarjugadores = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        txNombreJugador = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        spresistencia = new javax.swing.JSpinner();
        btguardarjugador = new javax.swing.JButton();
        txPosicion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        sptecnica = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        spprecio = new javax.swing.JSpinner();
        sphabilidad = new javax.swing.JSpinner();
        ppmodificarju = new javax.swing.JPopupMenu();
        jmimodificar = new javax.swing.JMenuItem();
        jmieliminar = new javax.swing.JMenuItem();
        ppmodificarequi = new javax.swing.JPopupMenu();
        jmimodificar1 = new javax.swing.JMenuItem();
        jmieliminar1 = new javax.swing.JMenuItem();
        jd_modificarequipo = new javax.swing.JDialog();
        txEstadio1 = new javax.swing.JTextField();
        txNombreEquipo1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        spCopas1 = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        btmodificareq = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        sppresupuesto1 = new javax.swing.JSpinner();
        jd_agregarjugadores1 = new javax.swing.JDialog();
        jLabel21 = new javax.swing.JLabel();
        txNombreJugador1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        spresistencia1 = new javax.swing.JSpinner();
        btmodificarjugador = new javax.swing.JButton();
        txPosicion1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        sptecnica1 = new javax.swing.JSpinner();
        jLabel27 = new javax.swing.JLabel();
        spprecio1 = new javax.swing.JSpinner();
        sphabilidad1 = new javax.swing.JSpinner();
        jd_comprar = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        listj2 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        list2e = new javax.swing.JList<>();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        ppcomprar = new javax.swing.JPopupMenu();
        jmcomprar = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        Agregar = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        aequipo = new javax.swing.JMenuItem();
        ajugadores = new javax.swing.JMenuItem();
        comprar = new javax.swing.JMenuItem();
        negocios = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jd_agregarequipo.setMinimumSize(new java.awt.Dimension(500, 400));
        jd_agregarequipo.setPreferredSize(new java.awt.Dimension(500, 400));
        jd_agregarequipo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jd_agregarequipo.getContentPane().add(txEstadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 250, -1));
        jd_agregarequipo.getContentPane().add(txNombreEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 250, -1));

        jLabel1.setText("Numero de Copas Ganadas:");
        jd_agregarequipo.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel2.setText("Presupuesto:");
        jd_agregarequipo.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 20));

        jLabel3.setText("Nombre de Equipo: ");
        jd_agregarequipo.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));
        jd_agregarequipo.getContentPane().add(spCopas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 190, 30));

        jLabel4.setText("Estadio:");
        jd_agregarequipo.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        btguardareq.setText("Guardar");
        btguardareq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btguardareqMouseClicked(evt);
            }
        });
        jd_agregarequipo.getContentPane().add(btguardareq, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setText("Agregar Equipo:");
        jd_agregarequipo.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        sppresupuesto.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));
        jd_agregarequipo.getContentPane().add(sppresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 250, 30));

        jd_listar.setMinimumSize(new java.awt.Dimension(900, 550));
        jd_listar.setPreferredSize(new java.awt.Dimension(900, 550));
        jd_listar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listeq.setModel(new DefaultListModel());
        listeq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listeqMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listeq);

        jd_listar.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 810, 150));

        listj.setModel(new DefaultListModel());
        listj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listjMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listj);

        jd_listar.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 810, 160));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Eliminar/Modificar Jugadores");
        jd_listar.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 520, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Equipos:");
        jd_listar.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Jugadores");
        jd_listar.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jd_agregarjugadores.setMinimumSize(new java.awt.Dimension(500, 400));
        jd_agregarjugadores.setPreferredSize(new java.awt.Dimension(500, 400));
        jd_agregarjugadores.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Nombre de Jugador: ");
        jd_agregarjugadores.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        jd_agregarjugadores.getContentPane().add(txNombreJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 250, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 255));
        jLabel10.setText("Agregar Jugador:");
        jd_agregarjugadores.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel11.setText("Precio:");
        jd_agregarjugadores.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 20));

        jLabel12.setText("Resistencia:");
        jd_agregarjugadores.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 30));

        spresistencia.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 10));
        jd_agregarjugadores.getContentPane().add(spresistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 250, 30));

        btguardarjugador.setText("Guardar");
        btguardarjugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btguardarjugadorMouseClicked(evt);
            }
        });
        jd_agregarjugadores.getContentPane().add(btguardarjugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 90, 50));
        jd_agregarjugadores.getContentPane().add(txPosicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 250, -1));

        jLabel14.setText("Posición:");
        jd_agregarjugadores.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 20));

        jLabel15.setText("Técnica:");
        jd_agregarjugadores.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        sptecnica.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 10));
        jd_agregarjugadores.getContentPane().add(sptecnica, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 250, 30));

        jLabel16.setText("Habilidad:");
        jd_agregarjugadores.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 10));

        spprecio.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));
        jd_agregarjugadores.getContentPane().add(spprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 250, 30));

        sphabilidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 10));
        jd_agregarjugadores.getContentPane().add(sphabilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 250, 30));

        jmimodificar.setText("Modificar Jugador");
        jmimodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmimodificarActionPerformed(evt);
            }
        });
        ppmodificarju.add(jmimodificar);

        jmieliminar.setText("Eliminar Jugador");
        jmieliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmieliminarActionPerformed(evt);
            }
        });
        ppmodificarju.add(jmieliminar);

        jmimodificar1.setText("Modificar Jugador");
        jmimodificar1.setActionCommand("Modificar Equipo");
        jmimodificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmimodificar1ActionPerformed(evt);
            }
        });
        ppmodificarequi.add(jmimodificar1);

        jmieliminar1.setText("Eliminar Equipo");
        jmieliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmieliminar1ActionPerformed(evt);
            }
        });
        ppmodificarequi.add(jmieliminar1);

        jd_modificarequipo.setMinimumSize(new java.awt.Dimension(500, 400));
        jd_modificarequipo.setPreferredSize(new java.awt.Dimension(500, 400));
        jd_modificarequipo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jd_modificarequipo.getContentPane().add(txEstadio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 250, -1));
        jd_modificarequipo.getContentPane().add(txNombreEquipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 250, -1));

        jLabel13.setText("Numero de Copas Ganadas:");
        jd_modificarequipo.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel17.setText("Presupuesto:");
        jd_modificarequipo.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 20));

        jLabel18.setText("Nombre de Equipo: ");
        jd_modificarequipo.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));
        jd_modificarequipo.getContentPane().add(spCopas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 190, 30));

        jLabel19.setText("Estadio:");
        jd_modificarequipo.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        btmodificareq.setText("Modificar");
        btmodificareq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btmodificareqMouseClicked(evt);
            }
        });
        jd_modificarequipo.getContentPane().add(btmodificareq, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 0));
        jLabel20.setText("Modificar Equipo:");
        jd_modificarequipo.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        sppresupuesto1.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));
        jd_modificarequipo.getContentPane().add(sppresupuesto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 250, 30));

        jd_agregarjugadores1.setMinimumSize(new java.awt.Dimension(500, 400));
        jd_agregarjugadores1.setPreferredSize(new java.awt.Dimension(500, 400));
        jd_agregarjugadores1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setText("Nombre de Jugador: ");
        jd_agregarjugadores1.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        jd_agregarjugadores1.getContentPane().add(txNombreJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 250, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 102, 255));
        jLabel22.setText("Modificar Jugador:");
        jd_agregarjugadores1.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel23.setText("Precio:");
        jd_agregarjugadores1.getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 20));

        jLabel24.setText("Resistencia:");
        jd_agregarjugadores1.getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 30));

        spresistencia1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 10));
        jd_agregarjugadores1.getContentPane().add(spresistencia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 250, 30));

        btmodificarjugador.setText("Modificar");
        btmodificarjugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btmodificarjugadorMouseClicked(evt);
            }
        });
        jd_agregarjugadores1.getContentPane().add(btmodificarjugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 90, 50));
        jd_agregarjugadores1.getContentPane().add(txPosicion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 250, -1));

        jLabel25.setText("Posición:");
        jd_agregarjugadores1.getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 20));

        jLabel26.setText("Técnica:");
        jd_agregarjugadores1.getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        sptecnica1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 10));
        jd_agregarjugadores1.getContentPane().add(sptecnica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 250, 30));

        jLabel27.setText("Habilidad:");
        jd_agregarjugadores1.getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 10));

        spprecio1.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));
        jd_agregarjugadores1.getContentPane().add(spprecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 250, 30));

        sphabilidad1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 10));
        jd_agregarjugadores1.getContentPane().add(sphabilidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 250, 30));

        jd_comprar.setMinimumSize(new java.awt.Dimension(900, 550));
        jd_comprar.setPreferredSize(new java.awt.Dimension(900, 550));
        jd_comprar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listj2.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(listj2);

        jd_comprar.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 810, 170));

        list2e.setModel(new DefaultListModel());
        list2e.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list2eMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(list2e);

        jd_comprar.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 810, 170));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Jugadores");
        jd_comprar.getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Equipos:");
        jd_comprar.getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Comprar Jugadores");
        jd_comprar.getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 520, 30));

        jmcomprar.setText("Comprar Jugador");
        jmcomprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmcomprarActionPerformed(evt);
            }
        });
        ppcomprar.add(jmcomprar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Agregar.setText("Administracion");

        jMenu1.setText("Agregar");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        aequipo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        aequipo.setText("Equipo");
        aequipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aequipoActionPerformed(evt);
            }
        });
        jMenu1.add(aequipo);

        ajugadores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        ajugadores.setText("Jugadores");
        ajugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajugadoresActionPerformed(evt);
            }
        });
        jMenu1.add(ajugadores);

        Agregar.add(jMenu1);

        comprar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        comprar.setText("Listar y Modificar  Jugadores");
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });
        Agregar.add(comprar);

        jMenuBar1.add(Agregar);

        negocios.setText("Negocios");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem1.setText("Comprara Jugadores");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        negocios.add(jMenuItem1);

        jMenuBar1.add(negocios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void aequipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aequipoActionPerformed
        // TODO add your handling code here:
        jd_agregarequipo.setModal(true);
        jd_agregarequipo.pack();
        jd_agregarequipo.setLocationRelativeTo(this);
        jd_agregarequipo.setVisible(true);
    }//GEN-LAST:event_aequipoActionPerformed

    private void btguardareqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btguardareqMouseClicked
        // TODO add your handling code here:
        val=val+1;
        if(val>=1){
            negocios.setEnabled(true);
        }
        String Nombre=txNombreEquipo.getText(); 
        double Presupuesto=(Double)sppresupuesto.getValue(); 
        int CopasGanadas=(Integer)spCopas.getValue(); 
        String Estadio=txEstadio.getText();
        DefaultListModel modelo= (DefaultListModel) listeq.getModel();
        modelo.addElement(new Equipos (Nombre, Presupuesto, CopasGanadas,Estadio));
        listeq.setModel(modelo);
        list2e.setModel(modelo);
        Equipos e=new Equipos (Nombre, Presupuesto, CopasGanadas,Estadio);
        equipos.add(e);
        JOptionPane.showMessageDialog(jd_agregarequipo, "Guardado!", "Proceso Correcto", 1);
    }//GEN-LAST:event_btguardareqMouseClicked

    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarActionPerformed
        jd_listar.setModal(true);
        jd_listar.pack();
        jd_listar.setLocationRelativeTo(this);
        jd_listar.setVisible(true);
    }//GEN-LAST:event_comprarActionPerformed

    private void btguardarjugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btguardarjugadorMouseClicked
        // TODO add your handling code here:
        val=val+1;
        if(val>=1){
            negocios.setEnabled(true);
        }
        String NombreJ=txNombreJugador.getText(); 
        double Precio=(Double)spprecio.getValue(); 
        String Posicion=txPosicion.getText(); 
        boolean Disponibilidad=true; 
        int Habilidad=(Integer)sphabilidad.getValue(); 
        int Tecnica=(Integer)sptecnica.getValue(); 
        int Resistecia=(Integer)spresistencia.getValue();
        DefaultListModel modelo= (DefaultListModel) listj.getModel();
        modelo.addElement(new Jugadores(NombreJ, Precio, Posicion, Disponibilidad, Habilidad, Tecnica, Resistecia));
        listj.setModel(modelo);
        listj2.setModel(modelo);
        Jugadores j=new Jugadores(NombreJ, Precio, Posicion, Disponibilidad, Habilidad, Tecnica, Resistecia);
        jugadores.add(j);
        JOptionPane.showMessageDialog(jd_agregarjugadores, "Guardado!", "Proceso Correcto", 1);
    }//GEN-LAST:event_btguardarjugadorMouseClicked

    private void ajugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajugadoresActionPerformed
        // TODO add your handling code here:
        jd_agregarjugadores.setModal(true);
        jd_agregarjugadores.pack();
        jd_agregarjugadores.setLocationRelativeTo(this);
        jd_agregarjugadores.setVisible(true);
    }//GEN-LAST:event_ajugadoresActionPerformed

    private void listjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listjMouseClicked
        if (evt.isMetaDown()) {
            this.ppmodificarju.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_listjMouseClicked

    private void jmimodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmimodificarActionPerformed
        // TODO add your handling code here:
        jd_agregarjugadores1.setModal(true);
        jd_agregarjugadores1.pack();
        jd_agregarjugadores1.setLocationRelativeTo(this);
        jd_agregarjugadores1.setVisible(true);
    }//GEN-LAST:event_jmimodificarActionPerformed

    private void jmieliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmieliminarActionPerformed
       try{
       J=listj.getSelectedIndex();
       jugadores.remove(J);
       DefaultListModel modelo = new DefaultListModel();
       for (int i = 0; i < jugadores.size(); i++) {
            modelo.addElement(jugadores.get(i));
       }
       listj.setModel(modelo);
       listj2.setModel(modelo);
       }catch(Exception e){
           JOptionPane.showMessageDialog(jd_listar, "No hay Selección alguna!", "Error", 0);
       }
    }//GEN-LAST:event_jmieliminarActionPerformed

    private void jmimodificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmimodificar1ActionPerformed
        jd_modificarequipo.setModal(true);
        jd_modificarequipo.pack();
        jd_modificarequipo.setLocationRelativeTo(this);
        jd_modificarequipo.setVisible(true);
    }//GEN-LAST:event_jmimodificar1ActionPerformed

    private void jmieliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmieliminar1ActionPerformed
       try{
       E=listeq.getSelectedIndex();
       equipos.remove(E);
       DefaultListModel model = new DefaultListModel();
       for (int i = 0; i < equipos.size(); i++) {
            model.addElement(equipos.get(i));
       }
       listeq.setModel(model);
       list2e.setModel(model);
       }catch(Exception e){
           JOptionPane.showMessageDialog(jd_listar, "No hay Selección alguna!", "Error", 0);
       }
       
    }//GEN-LAST:event_jmieliminar1ActionPerformed

    private void listeqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeqMouseClicked
        if (evt.isMetaDown()) {
            this.ppmodificarequi.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_listeqMouseClicked

    private void btmodificareqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmodificareqMouseClicked
        // TODO add your handling code here:
        try{
        E=listeq.getSelectedIndex();
        equipo_selected=equipos.get(E);
        String Nombre=txNombreEquipo1.getText();
        equipo_selected.setNombre(Nombre);
        double Presupuesto=(Double)sppresupuesto1.getValue(); 
        equipo_selected.setPresupuesto(Presupuesto);
        int CopasGanadas=(Integer)spCopas1.getValue(); 
        equipo_selected.setCopasGanadas(CopasGanadas);
        String Estadio=txEstadio1.getText();
        equipo_selected.setEstadio(Estadio);
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < equipos.size(); i++) {
            model.addElement(equipos.get(i));
        }
        listeq.setModel(model);
        list2e.setModel(model);
        Equipos e=new Equipos (Nombre, Presupuesto, CopasGanadas,Estadio);
        JOptionPane.showMessageDialog(jd_agregarequipo, "Modificado!", "Proceso Correcto", 1);
        jd_modificarequipo.dispose();
        }catch(Exception e){
          JOptionPane.showMessageDialog(jd_listar, "No hay Selección alguna!", "Error", 0);
          jd_modificarequipo.dispose();
        }
    }//GEN-LAST:event_btmodificareqMouseClicked

    private void btmodificarjugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmodificarjugadorMouseClicked
        try {
        J=listj.getSelectedIndex();
        jugador_selected=jugadores.get(J);
        String NombreJ=txNombreJugador1.getText(); 
        jugador_selected.setNombreJ(NombreJ);
        double Precio=(Double)spprecio1.getValue(); 
        jugador_selected.setPrecio(Precio);
        String Posicion=txPosicion1.getText(); 
        jugador_selected.setPosicion(Posicion);
        int Habilidad=(Integer)sphabilidad1.getValue(); 
        jugador_selected.setHabilidad(Habilidad);
        int Tecnica=(Integer)sptecnica1.getValue(); 
        jugador_selected.setTecnica(Tecnica);
        int Resistecia=(Integer)spresistencia1.getValue();
        jugador_selected.setResistecia(Resistecia);
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < jugadores.size(); i++) {
            model.addElement(jugadores.get(i));
        }
        listj.setModel(model);
        listj2.setModel(model);
        JOptionPane.showMessageDialog(jd_agregarequipo, "Modificado!", "Proceso Correcto", 1);
        jd_agregarjugadores1.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jd_listar, "No hay Selección alguna!", "Error", 0);
            jd_agregarjugadores1.dispose();
        }
    }//GEN-LAST:event_btmodificarjugadorMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jd_comprar.setModal(true);
        jd_comprar.pack();
        jd_comprar.setLocationRelativeTo(this);
        jd_comprar.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void list2eMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list2eMouseClicked
        if(evt.isMetaDown()){
            ppcomprar.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_list2eMouseClicked

    private void jmcomprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcomprarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmcomprarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Agregar;
    private javax.swing.JMenuItem aequipo;
    private javax.swing.JMenuItem ajugadores;
    private javax.swing.JButton btguardareq;
    private javax.swing.JButton btguardarjugador;
    private javax.swing.JButton btmodificareq;
    private javax.swing.JButton btmodificarjugador;
    private javax.swing.JMenuItem comprar;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JDialog jd_agregarequipo;
    private javax.swing.JDialog jd_agregarjugadores;
    private javax.swing.JDialog jd_agregarjugadores1;
    private javax.swing.JDialog jd_comprar;
    private javax.swing.JDialog jd_listar;
    private javax.swing.JDialog jd_modificarequipo;
    private javax.swing.JMenuItem jmcomprar;
    private javax.swing.JMenuItem jmieliminar;
    private javax.swing.JMenuItem jmieliminar1;
    private javax.swing.JMenuItem jmimodificar;
    private javax.swing.JMenuItem jmimodificar1;
    private javax.swing.JList<String> list2e;
    private javax.swing.JList<String> listeq;
    private javax.swing.JList<String> listj;
    private javax.swing.JList<String> listj2;
    private javax.swing.JMenu negocios;
    private javax.swing.JPopupMenu ppcomprar;
    private javax.swing.JPopupMenu ppmodificarequi;
    private javax.swing.JPopupMenu ppmodificarju;
    private javax.swing.JSpinner spCopas;
    private javax.swing.JSpinner spCopas1;
    private javax.swing.JSpinner sphabilidad;
    private javax.swing.JSpinner sphabilidad1;
    private javax.swing.JSpinner spprecio;
    private javax.swing.JSpinner spprecio1;
    private javax.swing.JSpinner sppresupuesto;
    private javax.swing.JSpinner sppresupuesto1;
    private javax.swing.JSpinner spresistencia;
    private javax.swing.JSpinner spresistencia1;
    private javax.swing.JSpinner sptecnica;
    private javax.swing.JSpinner sptecnica1;
    private javax.swing.JTextField txEstadio;
    private javax.swing.JTextField txEstadio1;
    private javax.swing.JTextField txNombreEquipo;
    private javax.swing.JTextField txNombreEquipo1;
    private javax.swing.JTextField txNombreJugador;
    private javax.swing.JTextField txNombreJugador1;
    private javax.swing.JTextField txPosicion;
    private javax.swing.JTextField txPosicion1;
    // End of variables declaration//GEN-END:variables
    Equipos equipo_selected;
    Jugadores jugador_selected;
    int val=0;
    ArrayList<Jugadores> jugadores=new ArrayList();
    ArrayList<Equipos> equipos=new ArrayList();
    int J,E;
}
