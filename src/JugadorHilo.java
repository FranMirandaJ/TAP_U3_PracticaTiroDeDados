
public class JugadorHilo extends Thread {
    
    Ventana v;
    StringBuilder sb;
    int numeroJugador;
    int puntaje;
    
    public JugadorHilo (Ventana v, int numeroJugador){
        this.v = v;
        sb = new StringBuilder();
        this.numeroJugador = numeroJugador;
    }
    
    
    public void run(){
        
        int t1d1 = (int)(Math.random()*6)+1;
        int t1d2 = (int)(Math.random()*6)+1;
        int t2d1 = (int)(Math.random()*6)+1;
        int t2d2 = (int)(Math.random()*6)+1;
        puntaje = t1d1+t1d2+t2d1+t2d2;
        
        sb.append("Jugador realiza su primer tiro!").append("\n");
        sb.append("Tiro Dado 1 : ").append(t1d1).append("\n");
        sb.append("Tiro Dado 2 : ").append(t1d2).append("\n");
        sb.append("Jugador realiza su segundo tiro!").append("\n");
        sb.append("Tiro Dado 1 : ").append(t2d1).append("\n");
        sb.append("Tiro Dado 2 : ").append(t2d2).append("\n");
        sb.append("PUNTAJE ====> ").append(puntaje);
        
        switch (numeroJugador) {
            case 1: v.jTextArea1.setText(sb.toString()); break;
            case 2: v.jTextArea2.setText(sb.toString()); break;
            case 3: v.jTextArea3.setText(sb.toString()); break;
        }
        
        switch (numeroJugador) {
            case 1: v.jugador2.start(); break;
            case 2: v.jugador3.start(); break;
        }
        
    }
    
    public int getPuntaje(){
        return puntaje;
    }
    
}
