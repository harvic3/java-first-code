
package polinomios;


public class PolLsl {
    
    private Nodo p;
    private Nodo u;
    
    public PolLsl(){
        p=u=null;
    }
    
    public boolean esVacio(){
        return p==null; 
    }
    
    public void insertarTer(float coe,int exp){
        
        int cont=0;
        
        Nodo n= new Nodo(coe,exp);
        if (esVacio()){
            p=u=n;
            return;
        }
        Nodo i=p;
        
        if(p.getExp()<exp){
                n.setLiga(p);
                p=n;
                //insertar antes del primero
        }
        else
        if(p.getExp()==exp){
            p.setCoe(p.getCoe()+coe);
            if(p.getCoe()==0){
               ajustarPol();
            }
            
            //suma con el primero
        }
        else
        if(u.getExp()==exp){
            u.setCoe(u.getCoe()+coe);
            if(u.getCoe()==0){
               ajustarPol();
            }
            
            //suma con el ultimo
        }
        else{
            while((i.getLiga()!=null)&&(i.getLiga().getExp()>exp)){
                i=i.getLiga();   
            }
            if(i.getLiga()==null){
                u.setLiga(n);
                u=n;
                //insertar de ultimo
            }
            else
            if(i.getLiga().getExp()!=exp){
                n.setLiga(i.getLiga());
                i.setLiga(n);
                    //insertar en el medio SIN sumar
            }
            else
            if(i.getLiga().getExp()==exp){
                i.getLiga().setCoe(i.getLiga().getCoe()+coe);
                if(i.getLiga().getCoe()==0){
                    ajustarPol();
                }
                
            }
                //insertar en el medio sumando
        }
    }
    
    public void ajustarPol(){
        Nodo k=p;
        
        if(p.getCoe()==0){
            p=p.getLiga();
            return;
        }
        
        else{
            while((k.getLiga()!=null)&&(k.getLiga().getCoe()!=0)){
                k=k.getLiga();
            }
            if(k.getLiga()==u){
                k.setLiga(null);
                u=k;
            }
            else
                k.setLiga(k.getLiga().getLiga());
        }
    }
 
    public String toString() {
        
        String aux="";
        Nodo i=p;
        while(i!=null){
            if(i.getCoe()>0){
                aux+="+"+i.getCoe()+"x^"+i.getExp();
            }
            else{
                aux+=i.getCoe()+"x^"+i.getExp();
                
            }
            i=i.getLiga();     
        }
        return aux;
        
    }
    
    public void eliminarTerm(int exp){
        Nodo i=p;
        if(p.getExp()==exp){
            p=p.getLiga();
        }
        else{
            while(i.getLiga().getExp()!=exp){
                i=i.getLiga();
            }
            if(i.getLiga()==u){
                i.setLiga(null);
                u=i;
            }
            else
            i.setLiga(i.getLiga().getLiga()); 
        }
    }
    
    public double evaluarPol(double x){
        Nodo i=p;
        int total=0;
        double e;
        while(i!=null){
            //e=Math.pow(x,i.getExp());
            total+=i.getCoe()*Math.pow(x,i.getExp());
            i=i.getLiga();
        } 
        return total;
    }
    public PolLsl sumar(PolLsl B){
       Nodo cab=p, q=B.p;
       PolLsl C=new PolLsl();
       while(cab!=null && q!=null)
       {
           if(cab.getExp()>q.getExp())
           {
               C.insertarTer(cab.getCoe(),cab.getExp());
               cab=cab.getLiga();
           }
           else
           if(q.getExp()>cab.getExp())
           {
               C.insertarTer(q.getCoe(),q.getExp());
               q=q.getLiga();
           }
           else
           {
               C.insertarTer(cab.getCoe()+q.getCoe(),cab.getExp());
               cab=cab.getLiga();
               q=q.getLiga();
           }
       }
       while(cab!=null)
       {
           C.insertarTer(cab.getCoe(),cab.getExp());
           cab=cab.getLiga();
       }
       while(q!=null)
       {
           C.insertarTer(q.getCoe(),q.getExp());
           q=q.getLiga();
       }
       C.ajustarPol();
       return C;   
    }
    public PolLsl multiplicar(PolLsl B){
        Nodo cab=p, q=B.p;
        PolLsl C=new PolLsl();
        while(q!=null){
            cab=p;
            while(cab!=null){
                C.insertarTer(q.getCoe()*cab.getCoe(), q.getExp()+cab.getExp());
                cab=cab.getLiga(); 
            }
            q=q.getLiga();
        }
        return C;
    }

    public PolLsl dividir(PolLsl A,PolLsl B){
        PolLsl C=new PolLsl();
        Nodo q=B.p;
        while(A.p.getExp()>=B.p.getExp()){
            q=B.p;
            C.insertarTer(A.p.getCoe()/q.getCoe(),A.p.getExp()-q.getExp());
            while(q!=null){
                A.insertarTer(-1*(C.u.getCoe()*q.getCoe()),C.u.getExp()+q.getExp());
                q=q.getLiga();
            }
        }
        return C;
    }
        
            
}
    
    
    

