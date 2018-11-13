

/**
 *
 * @author xaxokevin
 */
public class MenuItem {
    
    private String name;
    
    private String action;

    public MenuItem(String name, String action) {
        this.name = name;
        this.action = action;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String nombre) {
        this.name = nombre;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String accion) {
        this.action = accion;
    }
    
    
    
}
