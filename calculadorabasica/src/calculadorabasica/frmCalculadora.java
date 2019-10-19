
package calculadorabasica;

import java.math.BigDecimal;
import java.text.DecimalFormat;
public class frmCalculadora extends javax.swing.JFrame {

    //Definimos las variables globales
    private String strAnterior="";
    private double dblValor1=0.0;
    private double dblValor2=0.0;
    private double dblResultado=0.0;
    private String strOperador="";
    public frmCalculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        btnSiete = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();
        txtOperacion = new javax.swing.JTextField();
        btnAproximar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Básica by DanielBu");

        btnSiete.setText("7");
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });

        btnOcho.setText("8");
        btnOcho.setMaximumSize(new java.awt.Dimension(39, 35));
        btnOcho.setName(""); // NOI18N
        btnOcho.setPreferredSize(new java.awt.Dimension(39, 35));
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });

        btnCuatro.setText("4");
        btnCuatro.setPreferredSize(new java.awt.Dimension(39, 35));
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });

        btnNueve.setText("9");
        btnNueve.setPreferredSize(new java.awt.Dimension(39, 35));
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });

        btnCinco.setText("5");
        btnCinco.setPreferredSize(new java.awt.Dimension(39, 35));
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        btnPunto.setText(".");
        btnPunto.setPreferredSize(new java.awt.Dimension(39, 35));
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        btnUno.setText("1");
        btnUno.setPreferredSize(new java.awt.Dimension(39, 35));
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });

        btnTres.setText("3");
        btnTres.setName(""); // NOI18N
        btnTres.setPreferredSize(new java.awt.Dimension(39, 35));
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnCero.setText("0");
        btnCero.setPreferredSize(new java.awt.Dimension(39, 35));
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });

        btnSeis.setText("6");
        btnSeis.setPreferredSize(new java.awt.Dimension(39, 35));
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        btnDos.setText("2");
        btnDos.setPreferredSize(new java.awt.Dimension(39, 35));
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });

        btnIgual.setText("=");
        btnIgual.setPreferredSize(new java.awt.Dimension(39, 35));
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnMultiplicar.setText("X");
        btnMultiplicar.setPreferredSize(new java.awt.Dimension(51, 23));
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnRestar.setText("-");
        btnRestar.setPreferredSize(new java.awt.Dimension(51, 23));
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });

        btnBorrar.setText("AC");
        btnBorrar.setPreferredSize(new java.awt.Dimension(51, 23));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnDividir.setText("/");
        btnDividir.setPreferredSize(new java.awt.Dimension(51, 23));
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btnDelete.setText("DEL");
        btnDelete.setRequestFocusEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSumar.setText("+");
        btnSumar.setPreferredSize(new java.awt.Dimension(51, 23));
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        txtOperacion.setEditable(false);
        txtOperacion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnAproximar.setText("Aproximar");
        btnAproximar.setToolTipText("Permite reducir la cantidad de decimales a un valor aproximado");
        btnAproximar.setPreferredSize(new java.awt.Dimension(51, 35));
        btnAproximar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAproximarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtOperacion)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDelete))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnAproximar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAproximar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        //Primero se verifica si el ultimo valor de la variable strOperador
        //correspondio al signo Igual, de ser asi se ejecuta lo contenido 
        //en el IF, de lo contrario, lo contenido en el Else
        if (strOperador=="=")
        {
            Limpiar();
            strAnterior=txtOperacion.getText();
            txtOperacion.setText("");
            txtOperacion.setText(strAnterior+"8");
        }
        else
        {
            strAnterior=txtOperacion.getText();
            txtOperacion.setText(strAnterior+"8");
        }
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        txtOperacion.setText("");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
           strOperador="+";
           dblValor1= dblValor1+Double.parseDouble(txtOperacion.getText());
           txtOperacion.setText("");
           
       
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        //Primero se verifica si el ultimo valor de la variable strOperador
        //correspondio al signo Igual, de ser asi se ejecuta lo contenido 
        //en el IF, de lo contrario, lo contenido en el Else
        if (strOperador=="=")
        {
            Limpiar();
            strAnterior=txtOperacion.getText();
            txtOperacion.setText("");
            txtOperacion.setText(strAnterior+"1");
        }
        else
        {
            strAnterior=txtOperacion.getText();
            txtOperacion.setText(strAnterior+"1");
        }
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        //Primero se verifica si el ultimo valor de la variable strOperador
        //correspondio al signo Igual, de ser asi se ejecuta lo contenido 
        //en el IF, de lo contrario, lo contenido en el Else
        if (strOperador=="=")
        {
            Limpiar();
            strAnterior=txtOperacion.getText();
            txtOperacion.setText("");
            txtOperacion.setText(strAnterior+"2");
           
        }
        else
        {
            strAnterior=txtOperacion.getText();
            txtOperacion.setText(strAnterior+"2");
        }
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        //Primero se verifica si el ultimo valor de la variable strOperador
        //correspondio al signo Igual, de ser asi se ejecuta lo contenido 
        //en el IF, de lo contrario, lo contenido en el Else
        if (strOperador=="=")
        {
            Limpiar();
            txtOperacion.setText("");
            strAnterior=txtOperacion.getText();
            txtOperacion.setText(strAnterior+"3");
            
        }
        else
        {
            strAnterior=txtOperacion.getText();
            txtOperacion.setText(strAnterior+"3");
        }
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        //Primero se verifica si el ultimo valor de la variable strOperador
        //correspondio al signo Igual, de ser asi se ejecuta lo contenido 
        //en el IF, de lo contrario, lo contenido en el Else
        if (strOperador=="=")
        {
            Limpiar();
            txtOperacion.setText("");
            strAnterior=txtOperacion.getText();
            txtOperacion.setText(strAnterior+"4");
            
        }
        else
        {
            
            strAnterior=txtOperacion.getText();
            txtOperacion.setText(strAnterior+"4");
        }
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        //Primero se verifica si el ultimo valor de la variable strOperador
        //correspondio al signo Igual, de ser asi se ejecuta lo contenido 
        //en el IF, de lo contrario, lo contenido en el Else
        if (strOperador=="=")//Si el operador es igual
        {
            Limpiar();
            txtOperacion.setText("");//
            strAnterior=txtOperacion.getText();
            txtOperacion.setText(strAnterior+"5");
            
        }
        else
        {
            
            strAnterior=txtOperacion.getText();
            txtOperacion.setText(strAnterior+"5");
        }
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        //Primero se verifica si el ultimo valor de la variable strOperador
        //correspondio al signo Igual, de ser asi se ejecuta lo contenido 
        //en el IF, de lo contrario, lo contenido en el Else
        if (strOperador=="=")
        {
            Limpiar();
            txtOperacion.setText("");
            strAnterior=txtOperacion.getText();
            txtOperacion.setText(strAnterior+"6");
           
        }
        else
        {
           
            strAnterior=txtOperacion.getText();
            txtOperacion.setText(strAnterior+"6");
        }
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        //Primero se verifica si el ultimo valor de la variable strOperador
        //correspondio al signo Igual, de ser asi se ejecuta lo contenido 
        //en el IF, de lo contrario, lo contenido en el Else
        if (strOperador=="=")
        {
            Limpiar();
            txtOperacion.setText("");
            strAnterior=txtOperacion.getText();
            txtOperacion.setText(strAnterior+"7");
           
        }
        else
        {
            strAnterior=txtOperacion.getText();
            txtOperacion.setText(strAnterior+"7");
        }
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
       //Primero se verifica si el ultimo valor de la variable strOperador
        //correspondio al signo Igual, de ser asi se ejecuta lo contenido 
        //en el IF, de lo contrario, lo contenido en el Else
        if (strOperador=="=")
        {
            Limpiar();
            txtOperacion.setText("");
            strAnterior=txtOperacion.getText();
            txtOperacion.setText(strAnterior+"9");
            
        }
        else
        {
            
            strAnterior=txtOperacion.getText();
            txtOperacion.setText(strAnterior+"9");
        }
    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed
        //Primero se verifica si el ultimo valor de la variable strOperador
        //correspondio al signo Igual, de ser asi se ejecuta lo contenido 
        //en el IF, de lo contrario, lo contenido en el Else
        if (strOperador=="=")
        {
            Limpiar();
            txtOperacion.setText("");
            strAnterior=txtOperacion.getText();
            txtOperacion.setText(strAnterior+"0");
           
        }
        else
        {
            
            strAnterior=txtOperacion.getText();
            txtOperacion.setText(strAnterior+"0");
        }
    }//GEN-LAST:event_btnCeroActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        //Primero se verifica si el ultimo valor de la variable strOperador
        //correspondio al signo Igual, de ser asi se ejecuta lo contenido 
        //en el IF, de lo contrario, lo contenido en el Else
        if (strOperador=="=")
        {
            Limpiar();
            txtOperacion.setText("");
            strAnterior=txtOperacion.getText();
            txtOperacion.setText(strAnterior+".");
            
        }
        else
        {
            
            strAnterior=txtOperacion.getText();
            txtOperacion.setText(strAnterior+".");
        }
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        //Al presionar el igual, lo metemos en un Try Catch para capturar la
        //Excepción en caso de que se presente
        try{
        dblValor2=Double.parseDouble(txtOperacion.getText());
        switch (strOperador) {
            case "+":  dblResultado= dblValor1+dblValor2; break;
            case "-":  dblResultado= dblValor1-dblValor2; break;
            case "*":  dblResultado= dblValor1*dblValor2; break;
            case "/":  dblResultado= dblValor1/dblValor2; break;
        }
        
        txtOperacion.setText(formateaDouble(dblResultado));
        strOperador="=";
        }
        catch (Exception e)
        {
            txtOperacion.setText("No ha realizado ninguna operación");
            
        }
    }//GEN-LAST:event_btnIgualActionPerformed
    //Método para que siempre muestre el resultado sin importar los decimales
    //que tenga
    private static String formateaDouble(double numero)
    { 
    BigDecimal formateado = new BigDecimal(numero); 
    return formateado.toString (); 
    }
    
    //Método que permite aproximar el resultado cuando tienen muchos decimales
    private static String aproximarDecimales(double numero)
    { 
    //Creamos un objeto de la clase DecimalFormat y especificamos que aproxime 
    //el resultado
    DecimalFormat aproximado = new DecimalFormat("###.###");
    return aproximado.format(numero); 
    }
   
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtOperacion.setText("");
        dblValor1=0.0;
        dblValor2=0.0;
        dblResultado=0.0;
        strOperador="";
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        strOperador="*";
        dblValor1= Double.parseDouble(txtOperacion.getText());
        txtOperacion.setText("");
       
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        dblValor1= Double.parseDouble(txtOperacion.getText());
        txtOperacion.setText("");
        strOperador="/";
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        dblValor1= Double.parseDouble(txtOperacion.getText());
        txtOperacion.setText("");
        strOperador="-";   
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnAproximarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAproximarActionPerformed
        aproximarDecimales(dblResultado);
        txtOperacion.setText(""+dblResultado);
    }//GEN-LAST:event_btnAproximarActionPerformed

    //Método para inicializar las Variables 
    private void Limpiar()
    {
       
        dblValor1=0.0;
        dblValor2=0.0;
        dblResultado=0.0;
        strOperador="";
    }
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
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCalculadora().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAproximar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnSumar;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtOperacion;
    // End of variables declaration//GEN-END:variables
}
