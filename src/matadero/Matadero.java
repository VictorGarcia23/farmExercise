package matadero;
import com.tecnara.granja.Gallina;
import com.tecnara.granja.Granja;
import com.tecnara.granja.Pavo;
public interface  Matadero {
    public static Granja sacrificarGallina(Gallina gallina){
        return gallina;
    }

    public abstract int sacrificarPavo();

}
