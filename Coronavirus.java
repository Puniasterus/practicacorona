public class Coronavirus{

    public String Cadena()
    {
    return "Infectats: " + infeccio + " Mortaldat: " + mortaldat;
    }
    private float infeccio;
    private float mortaldat;
    private boolean toString;
    
    Coronavirus(float x, float y)
        {
        infeccio = x;
        mortaldat = y;
        }
    
    public Coronavirus(){
        this.infeccio = 0;
        this.mortaldat = 0;
    }
    
    public void setInfeccio(float infeccio) {
        this.infeccio = infeccio;
    }

    public void setMortaldat(float mortaldat) {
        this.mortaldat = mortaldat;
    }

    public float getInfeccio() {
        return infeccio;
    }

    public float getMortaldat() {
        return mortaldat;
    }
    
    public static void main(String[] args) {
        
    }
    public void start(){
    System.out.println(Cadena());
    }
}
