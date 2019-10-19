/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos_vectores;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ventana extends javax.swing.JFrame {
private Funciones F = new Funciones();


    int i,pos=0;
    int pos1;
    String busc;
    String nom1[]=new String[0];
    String cod1[]=new String[0];
    String nom2[]=new String[0];
    String cod2[]=new String[0];
    String not1[]=new String[0];
    String not2[]=new String[0];
    //variable y vectores utilizados en la parte numerica
    
    int num1[]=new int[0];
    int num2[]=new int[0];
    int num1_t[]=new int [0];
    int num2_t[]=new int [0];
   int n1,n2;
    
    //____________________________--
    
    //variable para almacenar los resultados
  int sum1=0,sum2=0,res1=0,res2=0,mult1=0,mult2=0,div1=0,div2=0;
  int sumat=0;
  int m1=0,m2=0,mn1=999999,mn2=9999999;
  int prom1=0,prom2=0;
  int busV1;
  int busV2;
    public ventana() {
        initComponents();
       this.setSize(1300,600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
      // registrar();
        this.desabilitarnum();
      
        this.registrar.setEnabled(false);
        this.modificar.setEnabled(false);
        this.eliminar.setEnabled(false);
        this.cancelar.setEnabled(false);
        this.buscar.setEnabled(false);
        this.actualizar.setEnabled(false);
        
    }

    
    public void registrar()

    {
        DefaultTableModel tabla=new DefaultTableModel();
      String nom=this.jTextField2.getText();
        String cod=this.jTextField2.getText();
        String nota=this.jTextField2.getText();
        if(this.jTextField2.equals("") && this.jTextField2.equals("") && this.jTextField2.equals(""))
       {
          JOptionPane.showMessageDialog(null,"Primeor debe llenar los campos" ,"Aviso",JOptionPane.WARNING_MESSAGE);
       }
        else 
       {
        if(nom1.length==0 && cod1.length==0 && not1.length==0)
       {
          nom1=new String[1];  
          cod1=new String[1];
          not1=new String[1];
       //   nom1[0]=this.jTextField1.getText();
        //  cod1[0]=this.jTextField2.getText();
        //  not1[0]=this.jTextField3.getText();
          for(i=0;i<=(num1.length-1)&& i<=(num2.length-1);i++)
          {
              
          }
        }
        
        else if(nom1.length>0 && cod1.length>0 && not1.length>0)
        {
            //num_tem=new int [num.length+1]
            nom2=new String[nom1.length+1];
            cod2=new String [cod1.length+1];
            not2=new String [not1.length+1];
            for( i=0;i<=(nom1.length-1) && i<=(cod1.length-1)&&i<=(not1.length-1);i++)//creo un ciclo para pasarle los valores del vector original al vector temporal
    				//sin eliminarlo
            {			
             nom2[i]=nom1[i];//realizo el intercambio de datos
             cod2[i]=cod1[i];
             not2[i]=not1[i];
  	    }
          //  nom2[nom2.length-1]=this.jTextField1.getText();
          //  cod2[cod2.length-1]=this.jTextField2.getText();
          //  not2[not2.length-1]=this.jTextField3.getText();
            
            nom1=new String[nom2.length];//al vector original le creo una nueva posicion que va hacer la camtidad de datos que tenga el
            cod1=new String[cod2.length];
            not1=new String[not2.length];
            //vector temporal
            for( i=0;i<=(nom2.length-1)&&i<=(cod2.length-1)&&i<=(not2.length-1);i++)//realizo un ciclo para realizar el intercambio de nuevo
           {
    		nom1[i]=nom2[i];//los valores del vector temporal los paso al vector original
    	        cod1[i]=cod2[i];
                not1[i]=not2[i];
                // y que da el vecot listo para realizar operaciones
    						
                // el vector que que con los datos es num[], el vector original
    						
           ///con ese este vector se realizaran las operaciones que necesite
                
                
                 }

        }
        }
    }
    
    //metodo para visualizar los datos en el jtable
     private void agregarDatos1()

    {

        // obtengo el modelo de la tabla (El TableModel)

        DefaultTableModel modelo = (DefaultTableModel)this.jTable2.getModel();

        // defino el vector que contendra los datos a cargar en la tabla

        String datos[] = new String[4];// como la tabla contiene 3 columnas, le asigno 3 como tamaño al vector

        // ahora cargo el vector con los datos que cargo el usuario.

        datos[0] = this.jTextField2.getText().trim();

        datos[1] = this.jTextField2.getText().trim();

        datos[2] = this.jTextField2.getText().trim(); 
        
        datos[3] = this.jTextField2.getText().trim(); 

        //ahora agrego los datos al TableModel

        modelo.addRow(datos);

        // y listo, los datos aparecen en la tabla

    }
    public void desabilitar()
    {
       
        this.registrar.setEnabled(false);
        this.modificar.setEnabled(false);
        this.eliminar.setEnabled(false);
        this.cancelar.setEnabled(false);
        this.buscar.setEnabled(false);
        this.actualizar.setEnabled(false);
    }
    public void habilitar()
    {
        this.jTextField2.setEnabled(true);
        this.jTextField2.setEnabled(true);
        this.jTextField2.setEnabled(true);
        this.registrar.setEnabled(true);
        this.modificar.setEnabled(true);
        this.eliminar.setEnabled(true);
        this.cancelar.setEnabled(true);
        this.buscar.setEnabled(true);
        this.actualizar.setEnabled(true);
    
    }
    
    public void buscar()
    {
       busc= JOptionPane.showInputDialog(null, "Digite el nombre que decea buscar " ,"Buscar por nombre",JOptionPane.INFORMATION_MESSAGE);
       for(i=0;i<nom1.length;i++)       
           if(busc.equals(nom1[i]))
           {
               
               JOptionPane.showMessageDialog(null,"El nombre   " + busc   +" en la posicion "+ pos +"   Fue en contrado");
               
               this.jTextField2.setText(nom1[pos]);
               this.jTextField2.setText(cod1[pos]);
               this.jTextField2.setText(not1[pos]);
               System.out.println("1  " + nom1[pos]);
               System.out.println("1  " + cod1[pos]);
               System.out.println("1  " + not1[pos]);
           }
           else
           {
               JOptionPane.showMessageDialog(null,"El nombre  " + busc   + " en la posicion  "  +  pos  +  "  No fue encontrado","Error al buscar" ,JOptionPane.WARNING_MESSAGE);
           }
       pos++;
            
    }
    
    public void limpiar()
    {
        this.jTextField2.setText("");
        this.jTextField2.setText("");
        this.jTextField2.setText("");
    }
    //******************************************************************************************
    
    //metodos para numeros
    
    public void habilitarnum()
    {
        this.numero1.setEnabled(true);
        this.numero2.setEnabled(true);
        this.result.setEnabled(true);
        this.result2.setEnabled(true);
        this.regis.setEnabled(true);
        
        this.suma.setEnabled(true);
        this.sumtotal.setEnabled(true);
        this.resta.setEnabled(true);
        this.multiplicacion.setEnabled(true);
        this.division.setEnabled(true);
        this.mayor.setEnabled(true);
        this.menor.setEnabled(true);
        this.promedio.setEnabled(true);
        
        
    }
    public void desabilitarnum()
    {
      this.numero1.setEnabled(false);
      this.numero2.setEnabled(false);
      this.result.setEnabled(false);
      this.result2.setEnabled(false);
      this.regis.setEnabled(false);
         
      this.suma.setEnabled(false);
        this.sumtotal.setEnabled(false);
        this.resta.setEnabled(false);
        this.multiplicacion.setEnabled(false);
        this.division.setEnabled(false);
        this.mayor.setEnabled(false);
        this.menor.setEnabled(false);
        this.promedio.setEnabled(false);
    }
    
    public void limpiarnum()
    {
        this.numero1.setText("");
        this.numero2.setText("");
        this.result.setText("");
    }
    
    public void registroNumero()
    {
        if(num1.length==0 && num2.length==0)
        {
            num1=new int[1];
            num2=new int[1];
            //pedir y guardar los datos
            
            num1[0]=Integer.parseInt(numero1.getText());
            num2[0]=Integer.parseInt(numero2.getText());
            for(i=0;i<=(num1.length-1)&&i<=(num2.length-1);i++)
            {
            n1=num1[i];
            n2=num2[i];
            System.out.println(num1[i]  + "   "  + num2[i]);
            }
        }
        else if(num1.length>0 &&num2.length>0)
        {
             //num_tem=new int [num.length+1]
            num1_t=new int[num1.length+1];
            num2_t=new int[num2.length+1];
            for(i=0;i<=(num1.length-1)&& i<=(num2.length-1);i++)
            {
                num1_t[i]=num1[i];
                num2_t[i]=num2[i];
            }
            //nom2[nom2.length-1]=this.jTextField1.getText();
            num1_t[num1_t.length-1]=Integer.parseInt(numero1.getText());
            num2_t[num2_t.length-1]=Integer.parseInt(numero2.getText());
            // not1=new String[not2.length];
            num1=new int[num1_t.length];
            num2=new int[num2_t.length];
            for(i=0;i<=(num1_t.length-1) && i<=(num2_t.length-1); i++)
            {
                num1[i]=num1_t[i];
                num2[i]=num2_t[i];
                
                System.out.println( num1[i] + "      " + num2[i]);
            }
            
         
            
        }
    }
    
    private void agregarDatos()

    {

        // obtengo el modelo de la tabla (El TableModel)

        DefaultTableModel modelo = (DefaultTableModel)this.jTable1.getModel();

        // defino el vector que contendra los datos a cargar en la tabla

        String datos[] = new String[2];

        // ahora cargo el vector con los datos que cargo el usuario.

        datos[0] = this.numero1.getText().trim();

        datos[1] = this.numero2.getText().trim();

        modelo.addRow(datos);

        // y listo, los datos aparecen en la tabla

    }
    
    public void MetodoSumar()
    {
      
       for(i=0;i<=(num1.length-1) && i<=(num2.length-1);i++)
       {
           sum1=sum1+ num1[i];//suma vector 1
           sum2=sum2+num2[i];//suma vector 2
           
           //mostrar los resultados en los campos resultados
           
           this.result.setText(Integer.toString(sum1));
           this.result2.setText(Integer.toString(sum2));
           r1.setText("suma");
           
       }
        
    }
    public void MetodoRestar()
    {
      
       for(i=0;i<=(num1.length-1) && i<=(num2.length-1);i++)
       {
           res1=res1- num1[i];//suma vector 1
           res2=res2-num2[i];//suma vector 2
           
           //mostrar los resultados en los campos resultados
           
           this.result.setText(Integer.toString(sum1));
           this.result2.setText(Integer.toString(sum2));
           r1.setText("resta");
           
       }
        
    }
    
    
    public void MetodoMultiplicar()
    {
      
       for(i=0;i<=(num1.length-1) && i<=(num2.length-1);i++)
       {
           mult1=mult1* num1[i];//suma vector 1
           mult2=mult2*num2[i];//suma vector 2
           
           //mostrar los resultados en los campos resultados
           
           this.result.setText(Integer.toString(sum1));
           this.result2.setText(Integer.toString(sum2));
           r1.setText("multiplicacion");
           
       }
        
    }
    
    
    public void Metododividir()
    {
      
       for(i=0;i<=(num1.length-1) && i<=(num2.length-1);i++)
       {
           div1=div1/ num1[i];//suma vector 1
           div2=div2/num2[i];//suma vector 2
           
           //mostrar los resultados en los campos resultados
           
           this.result.setText(Integer.toString(sum1));
           this.result2.setText(Integer.toString(sum2));
           r1.setText("division");
           
       }
        
    }
    
    public void sumaTotal()
    {
         
        sumat=sum1+sum2;
        JOptionPane.showMessageDialog(null,"La suma de los vectores es  "  + sumat);
    }
    
    public void mayorvec()
    {
      for(i=0;i<=(num1.length-1)&&i<=(num2.length-1);i++)
      {
          if(num1[i]>m1)
          {
              m1=num1[i];
              
          }
          if(num2[i]>m2)
          {
              m2=num2[i];
          }
                   
      }
      JOptionPane.showMessageDialog(null, "el mayor del vector 1 es " + m1 );
      JOptionPane.showMessageDialog(null, "el mayor del vector 2 es " + m2 );
    }
    
    public void menorvec()
    {
         for(i=0;i<=(num1.length-1)&&i<=(num2.length-1);i++)
      {
          if(num1[i]<mn1)
          {
              mn1=num1[i];
              
          }
          if(num2[i]<mn2)
          {
              mn2=num2[i];
          }
                   
      }
      JOptionPane.showMessageDialog(null, "el manor del vector 1 es " + mn1 );
      JOptionPane.showMessageDialog(null, "el manor del vector 2 es " + mn2 );
        
    }
    
    
    public void _promedios()
    {
        for(i=0;i<=(num1.length-1)&&i<=(num2.length-1);i++)
        {
            prom1=num1[i]/num1.length;
            prom2=num2[i]/num2.length;
        }
        JOptionPane.showMessageDialog(null, "El promedio del vector 1 es "  + prom1 );
         JOptionPane.showMessageDialog(null, "El promedio del vector 2 es "  + prom2 );
    }
    
    
   
    public void buscarV1()
    {
        pos1=0;
        
      
        busV1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el dato a buscar"));
        for(i=0;i<=(num1.length-1);i++)
        {
            if(busV1==num1[i])
            {
                pos1++;
                
                
            }
            
        }
            
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        numero1 = new javax.swing.JTextField();
        numero2 = new javax.swing.JTextField();
        result = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        result2 = new javax.swing.JTextField();
        r1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        nuev = new javax.swing.JButton();
        regis = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        mayor = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        menor = new javax.swing.JButton();
        multiplicacion = new javax.swing.JButton();
        promedio = new javax.swing.JButton();
        division = new javax.swing.JButton();
        sumtotal = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manejo de vectores con interfaz");
        setMaximumSize(new java.awt.Dimension(1200, 800));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(251, 250, 250));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sistema de Control de Huecos Viales", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18))); // NOI18N
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 153, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso de Cliente"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Identificación");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, -1));
        jPanel6.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 180, -1));

        jButton2.setText("Validar Cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 13, 300, 150));

        jPanel7.setBackground(new java.awt.Color(0, 153, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso de numeros"));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Numero 1");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 24, -1, -1));

        jLabel5.setText("Numero 2");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel6.setText("Resultado 1");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        jPanel7.add(numero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 70, -1));
        jPanel7.add(numero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 70, -1));
        jPanel7.add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 70, -1));

        jLabel7.setText("Resultado 2");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        jPanel7.add(result2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 70, -1));

        r1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        r1.setText("oper");
        jPanel7.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 84, 80, 30));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 280, 180));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 40, 620, 210);

        jPanel4.setBackground(new java.awt.Color(0, 153, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 153, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones Para numeros"));

        nuev.setText("Nuevo");
        nuev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevActionPerformed(evt);
            }
        });

        regis.setText("Registrar");
        regis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisActionPerformed(evt);
            }
        });

        suma.setText("Suma");
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });

        mayor.setText("Mayor");
        mayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mayorActionPerformed(evt);
            }
        });

        resta.setText("Resta");
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });

        menor.setText("Menor");
        menor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menorActionPerformed(evt);
            }
        });

        multiplicacion.setText("Multiplicacion");
        multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacionActionPerformed(evt);
            }
        });

        promedio.setText("Promedio");
        promedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promedioActionPerformed(evt);
            }
        });

        division.setText("Division");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });

        sumtotal.setText("Suma total");
        sumtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumtotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nuev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(division, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(multiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(suma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mayor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(promedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sumtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(regis, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nuev)
                    .addComponent(regis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suma)
                    .addComponent(mayor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resta)
                    .addComponent(menor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multiplicacion)
                    .addComponent(promedio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(division)
                    .addComponent(sumtotal))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 280, 220));

        jPanel3.setBackground(new java.awt.Color(0, 153, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones para textos"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 79, -1));

        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        jPanel3.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 90, -1));

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jPanel3.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 80, -1));

        modificar.setText("Modificar");
        jPanel3.add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 90, -1));

        actualizar.setText("Actulizar");
        jPanel3.add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 180, -1));

        jButton7.setText("Salir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 180, -1));

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel3.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 90, -1));

        eliminar.setText("Eliminar");
        jPanel3.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, -1));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 250, 220));

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 210, 620, 360);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 640, 580);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero 1", "Numero 2"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(660, 320, 370, 250);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificacion", "Nombre", "Apellido 1", "Apellido 2", "Direcciòn", "Telefono", "Correo"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(660, 50, 550, 240);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Cliente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(820, 10, 110, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:
        
        registrar();
        this.agregarDatos1();
        for(i=0;i<nom1.length  && i<cod1.length && i<not1.length;i++)
        {
        System.out.println("       " +    nom1[i]     + "        "   +    cod1[i]  +   "        " + not1[i]);
       // System.out.println("vector 2   " + cod1[i] );
        //System.out.println("vector 3   " + not1[i] );
        }
      limpiar();
    }//GEN-LAST:event_registrarActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
        int salir=JOptionPane.showConfirmDialog(null,"decea en realidad salir","Confirmar",JOptionPane.YES_OPTION);
        if(salir==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        habilitar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        buscar();
    }//GEN-LAST:event_buscarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        limpiar();
        desabilitar();
    }//GEN-LAST:event_cancelarActionPerformed

    private void nuevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevActionPerformed
        // TODO add your handling code here:
        this.habilitarnum();
    }//GEN-LAST:event_nuevActionPerformed

    private void regisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisActionPerformed
        // TODO add your handling code here:
        this.registroNumero();
        this.agregarDatos();
    }//GEN-LAST:event_regisActionPerformed

    private void menorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menorActionPerformed
        // TODO add your handling code here:
        this.menorvec();
    }//GEN-LAST:event_menorActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        // TODO add your handling code here:
        this.MetodoSumar();
    }//GEN-LAST:event_sumaActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        // TODO add your handling code here
        this.MetodoRestar();
    }//GEN-LAST:event_restaActionPerformed

    private void multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacionActionPerformed
        // TODO add your handling code here:
        this.MetodoMultiplicar();
    }//GEN-LAST:event_multiplicacionActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        // TODO add your handling code here:
        this.Metododividir();
    }//GEN-LAST:event_divisionActionPerformed

    private void sumtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumtotalActionPerformed
        // TODO add your handling code here:
        this.sumaTotal();
    }//GEN-LAST:event_sumtotalActionPerformed

    private void mayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mayorActionPerformed
        // TODO add your handling code here:
       this.mayorvec();
    }//GEN-LAST:event_mayorActionPerformed

    private void promedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promedioActionPerformed
        // TODO add your handling code here:
        this._promedios();
    }//GEN-LAST:event_promedioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try {
        F.limpiaTabla(jTable2);
    } catch (Exception ex) {
        Logger.getLogger(ventana.class.getName()).log(Level.SEVERE, null, ex);
    }
        String val =  jTextField2.getText() ;
    String Texto = "select CEDULA,NOMBRE,APELL1,APELL2,DIRECCION,TELEFONO,CORREO  from BDHueco.CLIENTE where "+val+"=CEDULA";
       habilitar();
                                              
        Funciones f=new Funciones();
        try {
            F.llenarTabla(jTable2,Texto);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton division;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton mayor;
    private javax.swing.JButton menor;
    private javax.swing.JButton modificar;
    private javax.swing.JButton multiplicacion;
    private javax.swing.JButton nuev;
    private javax.swing.JTextField numero1;
    private javax.swing.JTextField numero2;
    private javax.swing.JButton promedio;
    private javax.swing.JLabel r1;
    private javax.swing.JButton regis;
    private javax.swing.JButton registrar;
    private javax.swing.JButton resta;
    private javax.swing.JTextField result;
    private javax.swing.JTextField result2;
    private javax.swing.JButton suma;
    private javax.swing.JButton sumtotal;
    // End of variables declaration//GEN-END:variables
}
