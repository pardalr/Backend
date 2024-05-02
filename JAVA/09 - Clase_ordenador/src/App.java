// import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

                // ArrayList<Ordenador> PC = new ArrayList<>();


        Ordenador pcHP = new Ordenador("HP", "Elitebook", 16, 500, 734.2);
        // Ordenador pcAcer = new Ordenador("Acer", "Aspire 3", 8, 400, 394.0);
        // Ordenador pcAsus = new Ordenador("Asus", "ZenBook 14", 16, 1000, 999.9);
        // Ordenador pcToshiba = new Ordenador("Toshiba", "Tob13", 32, 1024, 1501.1);
    
        System.out.println("Este PC " + pcHP.getMarca() + " " + pcHP.getModelo() + ", tiene un precio de " + pcHP.getPrecio() + " euros");

        pcHP.setPrecio(600);

        System.out.println(pcHP.toString());

        // PC.add(pcHP);
        // PC.add(pcAcer);
        // PC.add(pcAsus);
        // PC.add(pcToshiba);

        // for(Ordenador x: PC){
        //     System.out.println(x.getMarca() + " vale " + x.getPrecio() + " euros");
        // }





















    }
}
