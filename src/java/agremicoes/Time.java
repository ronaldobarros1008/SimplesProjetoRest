package agremicoes;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Time {
    
    private Integer id;
    private String name;
    private String state;

    
    public Time(Integer id, String name, String state) {
        this.id = id;
        this.name = name;
        this.state = state;
    }
    
    public Time() {
    }    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    
    
}
