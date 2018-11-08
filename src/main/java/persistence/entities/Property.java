package persistence.entities;

public class Property {
    private String name;
    private String value;

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public Property () {}

    public Property (String name, String value) {
        this.setName(name);
        this.setValue(value);
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setValue (String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Property{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
