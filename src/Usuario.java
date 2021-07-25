public class Usuario {
    private String username;
    private int id;
    private String email;
    private int age;
    private String workstation;
    private boolean boss;

    public static void main(String[] args){
        Usuario obj = new Usuario("Miguel Alvarez", 1099000222, "miguel.alvarez@correo.com", 29, "administrativa", false);
        obj.info();
    }


    public Usuario(String username, int id, String email, int age, String workstation, boolean boss) {
        this.username = username;
        this.id = id;
        this.email = email;
        this.age = age;
        this.workstation = workstation;
        this.boss = boss;
    }

    public void info(){

        String msj = "[Usuario]:\n" +
                "Nombre: " + username + "\n" +
                "Identificación: " + id + "\n" +
                "Email: " + email + "\n" +
                "Edad: " + age + "\n" +
                "Area: " + workstation + "\n"+
                "Salario: " + salary();
        System.out.println(msj);
    }

    private double salary() {
        double cost = 0;
        double aux = 0;
        double costTotal = 0;
        if (workstation.equals("desarrollo")){
            cost = 4500000;
            if (boss) {
                cost += 2500000;
            }
        }else {
            cost = 3500000;
            if (boss) {
                cost += 3000000;
            }
        }

        costTotal = cost;

        aux = cost * 0.08;
        cost -= aux;

        if (costTotal > (908526*4)){
            aux = costTotal * 0.01;
            cost -= aux;
        }
        return cost;
    }
}
