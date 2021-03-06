
package lab8_andreamendoza;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Proyectos extends javax.swing.JFrame {

    public Proyectos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    private void SetTrees(ArrayList<Actividad> Root, DefaultMutableTreeNode nodo) {
        try {
            for (Actividad temp : Root) {
                if (temp.getAfter().isEmpty()) {
                    DefaultMutableTreeNode n = new DefaultMutableTreeNode(temp.getNombre());
                    nodo.add(n);
                } else {
                    DefaultMutableTreeNode n = new DefaultMutableTreeNode(temp.getNombre());
                    nodo.add(n);
                    SetTrees(temp.getAfter(), n);
                }
                if (Root.toString().equals(nameroot)) {
                }
            }
        } catch (Exception e) {
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Modify = new javax.swing.JDialog();
        Save = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        newnameA1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        parentproyect1 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        newd1 = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        newr1 = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        allactivities1 = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        preactlist1 = new javax.swing.JList<>();
        jLabel21 = new javax.swing.JLabel();
        Gestionar = new javax.swing.JPopupMenu();
        Modificar = new javax.swing.JMenuItem();
        Remove = new javax.swing.JMenuItem();
        Delete = new javax.swing.JPopupMenu();
        DeleteAct = new javax.swing.JMenuItem();
        Pad = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        newname = new javax.swing.JTextField();
        Create = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        newnameA = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        newd = new javax.swing.JSpinner();
        newr = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        allactivities = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        preactlist = new javax.swing.JList<>();
        CreateA = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        parentproyect = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tree = new javax.swing.JTree();
        allprojects = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        show = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        SelectProject = new javax.swing.JComboBox<>();
        Execute = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableE = new javax.swing.JTable();
        Load = new javax.swing.JButton();

        Modify.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Save.setText("Guardar Cambios");
        Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveMouseClicked(evt);
            }
        });

        jLabel16.setText("Nombre de la Actividad");

        jLabel17.setText("Proyecto del que es Parte");

        parentproyect1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                parentproyect1ItemStateChanged(evt);
            }
        });

        jLabel18.setText("Duración");

        jLabel19.setText("Retraso");

        jLabel20.setText("Seleccione las Actividades Predecesoras ");

        allactivities1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                allactivities1ItemStateChanged(evt);
            }
        });

        preactlist1.setModel(new DefaultListModel());
        preactlist1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                preactlist1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(preactlist1);

        jLabel21.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel21.setText("Modificar Actividad");

        javax.swing.GroupLayout ModifyLayout = new javax.swing.GroupLayout(Modify.getContentPane());
        Modify.getContentPane().setLayout(ModifyLayout);
        ModifyLayout.setHorizontalGroup(
            ModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModifyLayout.createSequentialGroup()
                .addGroup(ModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModifyLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ModifyLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(55, 55, 55)
                                .addComponent(newd1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(newr1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ModifyLayout.createSequentialGroup()
                                .addGroup(ModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16))
                                .addGap(18, 18, 18)
                                .addGroup(ModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(newnameA1)
                                    .addComponent(parentproyect1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(ModifyLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(Save)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(ModifyLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ModifyLayout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addGroup(ModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel20)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(allactivities1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        ModifyLayout.setVerticalGroup(
            ModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModifyLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel21)
                .addGap(37, 37, 37)
                .addGroup(ModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(newnameA1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ModifyLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel17))
                    .addGroup(ModifyLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(parentproyect1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(ModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(newd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(newr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(ModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ModifyLayout.createSequentialGroup()
                    .addContainerGap(260, Short.MAX_VALUE)
                    .addComponent(jLabel20)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(allactivities1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(67, 67, 67)))
        );

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        Gestionar.add(Modificar);

        Remove.setText("Eliminar");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });
        Gestionar.add(Remove);

        DeleteAct.setText("Borrar");
        DeleteAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActActionPerformed(evt);
            }
        });
        Delete.add(DeleteAct);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PadStateChanged(evt);
            }
        });

        jLabel6.setText("Nombre del Proyecto");

        Create.setText("Crear Proyecto");
        Create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel9.setText("Nuevo Proyecto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel6)
                .addGap(37, 37, 37)
                .addComponent(newname)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Create)
                    .addComponent(jLabel9))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel9)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(newname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(Create, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        Pad.addTab("Crear Proyecto", jPanel1);

        jLabel11.setText("Nombre de la Actividad");

        jLabel12.setText("Duración");

        jLabel13.setText("Retraso");

        jLabel14.setText("Seleccione las Actividades Predecesoras ");

        allactivities.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione una Actividad --" }));
        allactivities.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                allactivitiesItemStateChanged(evt);
            }
        });

        preactlist.setModel(new DefaultListModel());
        preactlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                preactlistMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(preactlist);

        CreateA.setText("Crear Actividad");
        CreateA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateAMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel10.setText("Nuevo Actividad");

        jLabel15.setText("Proyecto del que es Parte");

        parentproyect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione un Proyecto --" }));
        parentproyect.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                parentproyectItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(55, 55, 55)
                                .addComponent(newd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(newr, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(newnameA)
                                    .addComponent(parentproyect, 0, 239, Short.MAX_VALUE)))
                            .addComponent(jLabel14)
                            .addComponent(jScrollPane4)
                            .addComponent(allactivities, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(CreateA))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel10)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(newnameA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel15))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(parentproyect, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(newd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(newr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(allactivities, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(CreateA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Pad.addTab("Crear Actividad", jPanel4);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        Tree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        Tree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TreeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tree);

        allprojects.setSelectedItem("-- Seleccione un Proyecto --");
        allprojects.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                allprojectsItemStateChanged(evt);
            }
        });
        allprojects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allprojectsActionPerformed(evt);
            }
        });

        jLabel5.setText("Selecciona un proyecto");

        show.setText("Mostrar");
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(allprojects, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(show)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(allprojects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(show)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Pad.addTab("Visualizar Proyectos", jPanel3);

        Execute.setText("Ejecutar");
        Execute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExecuteMouseClicked(evt);
            }
        });

        TableE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Actividad en Ejecución", "Duración", "¿Estado?"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TableE);

        Load.setText("Cargar");
        Load.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoadMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(SelectProject, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Load)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Execute)
                        .addGap(0, 72, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelectProject, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Execute)
                    .addComponent(Load))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );

        Pad.addTab("Ejecutar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pad)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pad, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void allprojectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allprojectsActionPerformed

    }//GEN-LAST:event_allprojectsActionPerformed

    private void CreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateMouseClicked
        Proyecto P = new Proyecto(newname.getText());
        Ps.add(P);
        JOptionPane.showMessageDialog(this, "¡Proyecto creado exitósamente!\n Crea actividades para poder agregarlas a tu proyecto.");
        DefaultComboBoxModel m = (DefaultComboBoxModel) parentproyect.getModel();
        m.addElement(P);
        parentproyect.setModel(m);
        allprojects.setModel(m);
        SelectProject.setModel(m);
        newname.setText("");
    }//GEN-LAST:event_CreateMouseClicked

    private void CreateAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateAMouseClicked
        boolean empty = false;
        try {
            Actividad A = new Actividad(newnameA.getText(), (int) newd.getValue(), (int) newr.getValue(), ((Proyecto) parentproyect.getSelectedItem()));
            As.add(A);
            DefaultListModel m = (DefaultListModel) preactlist.getModel();
            for (int i = 0; i < preactlist.getLastVisibleIndex() + 1; i++) {
                A.addActB((Actividad) m.getElementAt(i));
                ((Actividad) m.getElementAt(i)).addActA(A);
                empty = true;
            }
            ((Proyecto) parentproyect.getSelectedItem()).addact(A);
            if (empty == false) {
                ((Proyecto) parentproyect.getSelectedItem()).addAct(A);
            }
            DefaultComboBoxModel m2 = (DefaultComboBoxModel) allactivities.getModel();
            m2.addElement((Actividad) A);
            allactivities.setModel(m2);
            JOptionPane.showMessageDialog(this, "¡Actividad creada exitósamente!");
            parentproyect.setSelectedIndex(0);
            allactivities.setModel(new DefaultComboBoxModel());
            DefaultComboBoxModel m3 = (DefaultComboBoxModel) allactivities.getModel();
            m3.addElement("-- Seleccione una Actividad --");
            allactivities.setModel(m3);
            newnameA.setText("");
            newd.setValue(0);
            newr.setValue(0);
            m.removeAllElements();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error.\nAsegurese de haber llenado todos los campos.");
            e.printStackTrace();
        }
    }//GEN-LAST:event_CreateAMouseClicked

    private void allactivitiesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_allactivitiesItemStateChanged
        ++flag2;
        DefaultListModel m = (DefaultListModel) preactlist.getModel();
        if (flag2 == 2) {
            if (allactivities.getSelectedIndex() != 0) {
                m.addElement((Actividad) allactivities.getSelectedItem());
            }
            flag2 = 0;
        }
    }//GEN-LAST:event_allactivitiesItemStateChanged

    private void parentproyectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_parentproyectItemStateChanged
        allactivities.setModel(new DefaultComboBoxModel());
        DefaultComboBoxModel m = (DefaultComboBoxModel) allactivities.getModel();
        m.addElement("-- Seleccione una Actividad --");
        ++flag;
        if (flag == 2) {
            for (Actividad act : As) {
                try {
                    if (((Proyecto) parentproyect.getSelectedItem()).getAll().contains(act)) {
                        m.addElement((Actividad) act);
                    }
                } catch (Exception e) {
                }
                allactivities.setModel(m);
            }
            flag = 0;
        }
    }//GEN-LAST:event_parentproyectItemStateChanged

    private void allprojectsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_allprojectsItemStateChanged

    }//GEN-LAST:event_allprojectsItemStateChanged

    private void DeleteActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActActionPerformed
try {        
        if (Pad.getSelectedIndex() == 1) {
            DefaultListModel m = (DefaultListModel) preactlist.getModel();
            m.remove(preactlist.getSelectedIndex());
        } else {
            DefaultListModel m = (DefaultListModel) preactlist1.getModel();
            Actividad S = (Actividad) m.getElementAt(preactlist1.getSelectedIndex());

            for (Iterator<Actividad> iterator = S.getAfter().iterator(); iterator.hasNext();) {
                Actividad I = iterator.next();
                if (I.toString().equals(M.toString())) {
                    iterator.remove();
                }
            }
            m.remove(preactlist1.getSelectedIndex());
        }
} catch (Exception e) {
}
    }//GEN-LAST:event_DeleteActActionPerformed

    private void preactlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preactlistMouseClicked
        if (evt.isMetaDown()) {
            Delete.show(preactlist, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_preactlistMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        Proyecto P = (Proyecto) allprojects.getSelectedItem();
        DefaultTreeModel m = (DefaultTreeModel) Tree.getModel();
        m.setRoot(new DefaultMutableTreeNode(allprojects.getSelectedItem().toString()));
        DefaultMutableTreeNode n = (DefaultMutableTreeNode) m.getRoot();
        nameroot = P.getActividades().toString();
        SetTrees(P.getActividades(), n);
    }//GEN-LAST:event_showMouseClicked

    private void TreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TreeMouseClicked
        DefaultMutableTreeNode n = (DefaultMutableTreeNode) Tree.getLastSelectedPathComponent();
        boolean act = true;
        try {
            for (Proyecto P : Ps) {
                if (P.getNombre().equalsIgnoreCase(n.toString())) {
                    act = false;
                    break;
                }
            }
        } catch (Exception e) {
        }
        if (evt.isMetaDown()) {
            Gestionar.show(Tree, evt.getX(), getY());
            if (act == true) {
                Modify.setEnabled(true);
                Remove.setEnabled(false);
            } else {
                Modify.setEnabled(false);
                Remove.setEnabled(true);
            }
        }


    }//GEN-LAST:event_TreeMouseClicked

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        DefaultMutableTreeNode n = (DefaultMutableTreeNode) Tree.getLastSelectedPathComponent();
        DefaultListModel m = (DefaultListModel) preactlist1.getModel();
        for (Actividad A : As) {
            if (A.getNombre().equals(n.toString())) {
                M = A;
            }
        }
        newnameA1.setText(M.getNombre());
        newd1.setValue(M.getDuracion());
        newr1.setValue(M.getRetraso());
        DefaultComboBoxModel o = (DefaultComboBoxModel) allprojects.getModel();
        parentproyect1.setModel(o);
        parentproyect1.setSelectedItem(M.getOwner());
        allactivities1.setModel(new DefaultComboBoxModel());
        DefaultComboBoxModel m2 = (DefaultComboBoxModel) allactivities1.getModel();
        m2.addElement("-- Seleccione una Actividad --");
        for (Actividad act : As) {
            try {
                if (((Proyecto) parentproyect1.getSelectedItem()).getActividades().contains(act)) {
                    m2.addElement((Actividad) act);
                    flag = 0;
                }
            } catch (Exception e) {
            }
            allactivities1.setModel(m2);
        }
        for (Actividad act : M.getBefore()) {
            m.addElement(act);
        }
        Modify.pack();
        Modify.setModal(true);
        Modify.setLocationRelativeTo(null);
        Modify.setVisible(true);


    }//GEN-LAST:event_ModificarActionPerformed

    private void preactlist1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preactlist1MouseClicked
        if (evt.isMetaDown()) {
            Delete.show(preactlist1, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_preactlist1MouseClicked

    private void parentproyect1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_parentproyect1ItemStateChanged
        DefaultComboBoxModel m = (DefaultComboBoxModel) allactivities1.getModel();
        ++flag;
        if (flag == 2) {
            for (Actividad act : As) {
                try {
                    if (((Proyecto) parentproyect1.getSelectedItem()).getActividades().contains(act)) {
                        m.addElement((Actividad) act);
                    }
                } catch (Exception e) {
                }
                allactivities1.setModel(m);
            }
            flag = 0;
        }
    }//GEN-LAST:event_parentproyect1ItemStateChanged

    private void allactivities1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_allactivities1ItemStateChanged
        ++flag2;
        DefaultListModel m = (DefaultListModel) preactlist1.getModel();
        if (flag2 == 2) {
            if (allactivities.getSelectedIndex() != 0) {
                m.addElement((Actividad) allactivities1.getSelectedItem());
            }
            flag2 = 0;
        }
    }//GEN-LAST:event_allactivities1ItemStateChanged

    private void SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseClicked
        try {
            M.setNombre(newnameA1.getText());
            M.setDuracion((int) newd1.getValue());
            M.setRetraso((int) newr1.getValue());
            DefaultListModel m = (DefaultListModel) preactlist1.getModel();
            M.setBefore(new ArrayList());
            for (int i = 0; i < preactlist1.getLastVisibleIndex() + 1; i++) {
                M.addActB((Actividad) m.getElementAt(i));
                ((Actividad) m.getElementAt(i)).addActA(M);
            }
            ((Proyecto) parentproyect1.getSelectedItem()).addAct(M);
            JOptionPane.showMessageDialog(this, "¡Cambios guardados exitósamente!");
            parentproyect1.setSelectedIndex(0);
            allactivities1.setModel(new DefaultComboBoxModel());
            DefaultComboBoxModel m3 = (DefaultComboBoxModel) allactivities1.getModel();
            m3.addElement("-- Seleccione una Actividad --");
            allactivities1.setModel(m3);
            newnameA1.setText("");
            newd1.setValue(0);
            newr1.setValue(0);
            m.removeAllElements();
            Tree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode()));
            Modify.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error.\nAsegurese de haber llenado todos los campos.");
        }
    }//GEN-LAST:event_SaveMouseClicked

    private void PadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PadStateChanged

    }//GEN-LAST:event_PadStateChanged

    private void ExecuteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExecuteMouseClicked
        Proyecto P = (Proyecto) SelectProject.getSelectedItem();
        pos = 0;
        try {
            FillTable(P.getActividades());
        } catch (InterruptedException ex) {
        }
    }//GEN-LAST:event_ExecuteMouseClicked

    private void LoadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadMouseClicked
        Proyecto P = (Proyecto) SelectProject.getSelectedItem();
        DefaultTableModel m = (DefaultTableModel) TableE.getModel();
        m.setRowCount(0);
        FillTable1(P.getActividades());
    }//GEN-LAST:event_LoadMouseClicked

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
        DefaultMutableTreeNode n = (DefaultMutableTreeNode) Tree.getLastSelectedPathComponent();
        Proyecto temp = null;
        for (Proyecto P : Ps) {
            if (P.getNombre().equals(n.toString())) {
                temp = P;
            }
        }
        Ps.remove(temp);
        DefaultComboBoxModel m = (DefaultComboBoxModel) allprojects.getModel();
        m.removeElement(temp);
        Tree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("")));

    }//GEN-LAST:event_RemoveActionPerformed

    public void FillTable1(ArrayList<Actividad> P) {
        try {
        DefaultTableModel m = (DefaultTableModel) TableE.getModel();
        for (Actividad act : P) {
            if (act.getAfter().isEmpty()) {
                Object[] R = {act.getNombre(), act.getDuracion(), "En Espera."};
                m.addRow(R);
            } else {
                Object[] R = {act.getNombre(), act.getDuracion(), "En Espera."};
                m.addRow(R);
                FillTable1(act.getAfter());
            }
        }
        } catch (Exception e) {
        }
    }

    public void FillTable(ArrayList<Actividad> P) throws InterruptedException {
        try {
        for (Actividad act : P) {
            B = new Execute(act, TableE, pos);
            B.start();
            ++pos;
        }
        B.join();

        for (Actividad act : P) {
            for (Actividad act2 : act.getAfter()) {
                if (act.getAfter().isEmpty()) {
                    break;
                } else {
                    B = new Execute(act, TableE, pos);
                    B.start();
                    ++pos;
                }
                B.join();
                FillTable(act2.getAfter());
            }

        }
        } catch (Exception e) {
        }
        /* BEST SHOT
        
        for (Actividad act : P) {
            if (act.getInicio() > 0) {
                System.out.println("entra b");
                B = new Execute(act, TableE, pos);
                B.start();
            } 
            
            
            else if (act.getBefore().isEmpty()){
                A = new Execute(act, TableE, pos);
                A.start();
            }
            ++pos;
        }

        /*  while (E.isAlive()) {
                    m.setValueAt(E.estado, m.getRowCount() - 1, 2);
                    TableE.setModel(m);
                }
                System.out.println(A.isAlive());
                temp = act;
            }

        }
         
        
    }

    /**
     * @param args the command line arguments
         */
    }

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
            java.util.logging.Logger.getLogger(Proyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proyectos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Create;
    private javax.swing.JButton CreateA;
    private javax.swing.JPopupMenu Delete;
    private javax.swing.JMenuItem DeleteAct;
    private javax.swing.JButton Execute;
    private javax.swing.JPopupMenu Gestionar;
    private javax.swing.JButton Load;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JDialog Modify;
    private javax.swing.JTabbedPane Pad;
    private javax.swing.JMenuItem Remove;
    private javax.swing.JButton Save;
    private javax.swing.JComboBox<String> SelectProject;
    private javax.swing.JTable TableE;
    private javax.swing.JTree Tree;
    private javax.swing.JComboBox<String> allactivities;
    private javax.swing.JComboBox<String> allactivities1;
    private javax.swing.JComboBox<String> allprojects;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSpinner newd;
    private javax.swing.JSpinner newd1;
    private javax.swing.JTextField newname;
    private javax.swing.JTextField newnameA;
    private javax.swing.JTextField newnameA1;
    private javax.swing.JSpinner newr;
    private javax.swing.JSpinner newr1;
    private javax.swing.JComboBox<String> parentproyect;
    private javax.swing.JComboBox<String> parentproyect1;
    private javax.swing.JList<String> preactlist;
    private javax.swing.JList<String> preactlist1;
    private javax.swing.JButton show;
    // End of variables declaration//GEN-END:variables
ArrayList<Proyecto> Ps = new ArrayList();
    ArrayList<Actividad> As = new ArrayList();
    int flag = 0;
    int flag2 = 0;
    String nameroot = "";
    Actividad M;
    Actividad temp = null;
    boolean t = false;
    Execute A = null;
    Execute B = null;
    ArrayList<Execute> Ts = new ArrayList();
    int pos = 0;
}

