package practiceOops;

public class EncapsulationInJava {

    private int id;

    private String name;

    private int roleNumber;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRoleNumber() {
        return roleNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoleNumber(int roleNumber) {
        this.roleNumber = roleNumber;
    }

    public static void main(String[] args) {
        EncapsulationInJava obj = new EncapsulationInJava();
    }

}
