package program;

public class parameterFunc extends function{
    public String type;
    public String ID ;

    public parameterFunc(String type, String ID) {
        this.type = type;
        this.ID = ID;
    }
    @Override
    public String toString() {
        return "\nparameter Function{" +
                "\ntype='" + type + '\'' +
                ", \nID='" + ID + '\'' +
                "\n}";
    }
}
