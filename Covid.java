
/**
 *
 * @author Roger
 */
public class Covid extends Coronavirus {
    private String pais;
    
    public Covid(){
    super(); //cria a la classe superior (Coronavirus)
    this.pais = "";
    }
    //Constructor parametres
    public Covid(float infeccio, float mortaldat, String pais) {
        super(infeccio, mortaldat);
        this.pais = pais;
    }
    
    public String getPais(){
    return this.pais;
    }
    public void setPais(String pais) {
    this.pais = pais;
    }
}
